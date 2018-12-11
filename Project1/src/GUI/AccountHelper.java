
package GUI;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class này là lớp chứa các phương thức trợ giúp cho các chức năng liên quan đến tài khoản
 * @author CoTrang-Lecture
 */
public class AccountHelper {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
   // public static final Pattern VALID_PASSWORD_REGEX = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
   // public static final Pattern VALID_PHONE_NUMBER_REGEX = Pattern.compile("^([ .-]*[0-9]+[ .-]*)+$");
    /**
     * Hàm này để kiểm tra email có đúng định dạng
     * @param emailStr là email string
     * @return boolean cho biết đúng định dạng hay không
     */  
    public static boolean validateEmail(String emailStr) {
            Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailStr);
            return matcher.find();
    }
    /**
     * Hàm này để kiểm tra str có đúng định dạng
     * @param str là họ hoặc tên
     * @return int cho biết đúng định dạng hay không
     * 1 là lỗi do người dùng không nhập gì
     * 2 là lỗi do chuỗi đầu vào quá dài
     * 0 là không có lỗi
     */      
    public static int validateFirstNameOrLastName(String str){
        int len = str.length();
        if(len ==0)
            return 1;
        if(len>25)
            return 2;
        return 0;
    }
    /**
     * Hàm này để kiểm tra số điện thoại có đúng định dạng
     * @param phoneNumber là số điện thoại
     * @return boolean cho biết đúng định dạng hay không
     */  
//    public static boolean validatePhoneNumber(String phoneNumber) {
//            if(phoneNumber.length()>0){
//                Matcher matcher = VALID_PHONE_NUMBER_REGEX .matcher(phoneNumber);
//                return matcher.find();
//            }
//            return true;
//    }
    /**
     * Hàm này để kiểm tra mật khẩu có đúng định dạng
     * @param passStr là mật khẩu
     * @return boolean cho biết đúng định dạng hay không
     */  
//    public static boolean  validatePassword(String passStr){
//            Matcher matcher =  VALID_PASSWORD_REGEX.matcher(passStr);
//            return matcher.find();
//    }
    public static boolean validPassdword(String passwordString){
        int pws = passwordString.length();
        if(pws==0 )
            return false;
        if(pws <=8)
            return false;
        return true;
    }
    /**
     * Hàm này để mã hóa mật khẩu theo md5
     * @param password là mật khẩu
     * @return String mật khẩu sau khi mã hóa md5
     */ 
//    public static String MD5encrypt(String password){            
//        StringBuffer sb = new StringBuffer();
//        try{ 
//            byte[] bytesOfMessage = password.getBytes("UTF-8");
//            MessageDigest md = MessageDigest.getInstance("MD5");
//            byte[] thedigest = md.digest(bytesOfMessage);
//            for (int i = 0; i < thedigest.length; i++) {
//              sb.append(Integer.toString((thedigest[i] & 0xff) + 0x100, 16).substring(1));
//            }
//        } catch (NoSuchAlgorithmException ex) {
//            Logger.getLogger(Register1.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (UnsupportedEncodingException ex) {
//            Logger.getLogger(Register1.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return sb.toString();
//    }
    /**
     * Hàm này để chuyển ngày tháng thành đúng định dạng
     * khi lấy string trên jCalendar
     * @param date là chuỗi thể hiện ngày tháng được lấy từ jCalendar
     * @return String ngày dưới dạng dd/M/yyyy
     */     
//    public static String getDate(String date){
//        String[] splitResult = date.split(" "); //split(date, " ");
//        String month = convertStringToMonth(splitResult[1]);
//        return splitResult[2]+"/"+month+"/"+splitResult[5];
//    }
    /**
     * Hàm này để chuyển các chữ cái đầu của tháng trong tiếng Anh
     * thành số tương ứng của tháng
     * @param month là chữ cái đầu của tháng trong tiếng Anh
     * @return String kết quả chuyển dưới dạng 01, 02, 03, ...
     */        
//    private static String convertStringToMonth(String month){
//        //String [] monthsInYear = {"Jan","Feb","Mar","Apr","May","June","Jul","Aug","Sept","Oct","Nov","Dec"};
//        switch(month){
//            case "Jan":
//                return "01";
//            case "Feb":
//                return "02";
//            case "Mar":
//                return "03";
//            case "Apr":
//                return "04";
//            case "May":
//                return "05";
//            case "June":
//                return "06";
//            case "Jul":
//                return "07";
//            case "Aug":
//                return "08";
//            case "Sept":
//                return "09";
//            case "Oct":
//                return "10";
//            case "Nov":
//                return "11";
//            case "Dec":
//                return "12";
//            default:
//                return "null";
//        }
//    }
    /**
     * Hàm này để chuyển số điện thoại 
     * thành định dạng có dấu chấm xen giữa 2 số
     * và loại bỏ các kí tự thùa
     * @param phoneNumber là số điện thoại
     * @return String kết quả chuyển dưới dạng 09.74.01.17.03
     */     
//    public static String changePhoneNumberToNormalForm(String phoneNumber){
//        String phoneNumberNew = phoneNumber.replaceAll("[ .-]","");
//        String result = new String();
//        StringBuilder str = new StringBuilder(phoneNumberNew);
//        int i=2;
//        while(i<str.length()){
//            str.insert(i, ".");
//            i+=3;
//        }
//        result=str.toString();
//        return result;
//    }
}
