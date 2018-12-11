/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nguyen Thanh Binh
 */
public class User extends ConnectDB {
    private final String GET_LOGIN = "select * from UserE where email= ? and  password=?";
    private final String ADD_USER = "INSERT INTO UserE (userName,gender,email,password,status,requestToChange,firstName,lastName,dateOfBirth) VALUES (?,?,?,?,?,?,?,?,?)";
    private final String UPDATE_PASSWORD = "upate UserE set password = ?, requestToChange =?, where email = ?";
    private final String SEARCH_USER_BY_EMAIL ="select * from UserE where email = ?";
    private final String UPDATE_PROFILE ="update UserE set password = ?,email=?,gender=?,dateOfBirth=?,requestToChange=?, status=? where email = ?";
    
    private String email;
    private boolean status;
    private boolean requestToChange;
    private String userName;
    private String password;
    private String dateOfBirth;
    private String gender;
    private String lastName;
    private String firstName;
    
    public int checkLogin(String email, String password) throws SQLException, ClassNotFoundException {
        if(findByEmail(email)){
            connectDB();
            PreparedStatement ps = conn.prepareStatement(GET_LOGIN);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs != null && rs.next()) {
                if(rs.getBoolean("status")){

                    closeDB();
                    return 0; // bị khóa
                }else if(rs.getBoolean("requestToChange")){
                    closeDB();
                    return 1; // yêu cầu thay đổi mật khẩu
                }else{
                    closeDB();
                    return 2; // đăng nhập thành công
                }
            }else{
                closeDB();
                return 3; // sai mật khẩu
            }
        }
        return 4; // email không tồn tại
    }
    public boolean findByEmail(String email) throws SQLException, ClassNotFoundException{
        connectDB();
        PreparedStatement ps = conn.prepareStatement(SEARCH_USER_BY_EMAIL);
        ps.setString(1, email);
        ps.executeQuery();
        ResultSet rs = ps.executeQuery();
        if(rs !=null && rs.next()){
            this.setUserName(rs.getString("userName"));
            this.setFirstName(rs.getString("firstName"));
            this.setLastName(rs.getString("lastName"));
            this.setGender(rs.getString("gender"));
            this.setDateOfBirth(rs.getString("dateOfBirth"));
            this.setEmail(rs.getString("email"));
            this.setPassword(rs.getString("password"));
            
            closeDB();
            return true;
        }
        closeDB();
        return false;
        
    }
    
public boolean addUser() throws SQLException, ClassNotFoundException {
        connectDB();
        PreparedStatement ps;
        ps = conn.prepareStatement(SEARCH_USER_BY_EMAIL);
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();
        if (rs != null && rs.next()){
            closeDB();
            return false;
        }else{
            ps = conn.prepareStatement(ADD_USER);
            ps.setString(1, userName);
            ps.setString(2, gender);
            ps.setString(3, email);
            ps.setString(4, password);
            ps.setBoolean(5, status);
           ps.setBoolean(6, requestToChange);
            ps.setString(7, firstName);
            ps.setString(8, lastName);
            ps.setString(9, dateOfBirth);
            ps.executeUpdate();
           //  ps = conn.prepareStatement(ADD_USER_ROLE);
           // ps.setString(1, email);
           // ps.setInt(2, 2);
            ps.executeUpdate();
        }
        closeDB();
        return true;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isRequestToChange() {
        return requestToChange;
    }

    public void setRequestToChange(boolean requestToChange) {
        this.requestToChange = requestToChange;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
