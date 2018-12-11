
package user.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import entity.User;
/**
 * Class này điều khiển các chức năng liên quan tới user
 * @author CoTrang-Lecture
 */
public class UserController {
    User user = new User();
    
    private static UserController me;

    /**
     *Hàm khởi tạo là private để không đối tượng nào bên ngoài có thể khởi tạo tuỳ ý đối tượng của lớp này
     */ 
    private UserController(){}
	
    /**
     *Hàm này khởi tạo cho đối tượng dùng chung duy nhất của UserController nếu đối tượng đố null
     * @return đối tượng dùng chung duy nhất của UserController
     */ 
    public static UserController getInstance(){
            if (me == null)
                    me = new UserController();
            return me;
    }
    /**
     *Hàm này để kiểm tra người dùng có thể đăng nhập vào hệ thống không
     * @param email là email người dùng
     * @param password  là mật khẩu người dùng
     *  *@return int return là : 0. tài khoản bị khóa, 1 yêu cầu thay đổi pass
     * 2 sai mật khẩu, 3 là đúng, 4 là email không tồn tại.
     */
    public int  checkLogin(String email,String password) throws SQLException, ClassNotFoundException{
       return  user.checkLogin(email, password);
    }
    
    
    
    
    
    public boolean register(User user) throws ClassNotFoundException, SQLException{
            return user.addUser();
    }
    
    
    
    
    
    public User findUserByEmail(String email) throws SQLException, ClassNotFoundException{
        User user = new User();
        if(user.findByEmail(email))
            return user;
        return null;
    }

}
