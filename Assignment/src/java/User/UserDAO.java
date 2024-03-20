/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import Utils.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sang
 */
public class UserDAO {

   public UserDTO login(String username, String password) {
    UserDTO user = null;
    try {
        Connection con = DBUtils.getConnection();
        String sql = "SELECT * FROM Users WHERE UserName = ? AND Password = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, username);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();
        
        if (rs != null) {
            if (rs.next()) {
                user = new UserDTO();
                user.setUserName(rs.getString("UserName"));
                user.setEmail(rs.getString("Email"));
                user.setType(rs.getString("Type"));
                user.setUserID(rs.getInt("UserID"));
                user.setPhoneNum(rs.getString("PhoneNum"));
                user.setAccountStatus(rs.getString("AccountStatus")); 
            }
        }
        con.close();
    } catch (SQLException ex) {
        System.out.println("Error in servlet. Details:" + ex.getMessage());
        ex.printStackTrace();
    }
    return user;
}


    public UserDTO signup(String username, String password, String email, String phoneNum) {
        UserDTO newUser = null;
        try {
            Connection con = DBUtils.getConnection();
            String sql = "INSERT INTO Users (UserName, Password, Email, PhoneNum, RegistrationDate, Type) VALUES (?, ?, ?, ?, GETDATE(), 'reader')";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.setString(3, email);
            stmt.setString(4, phoneNum);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                newUser = new UserDTO();
                newUser.setUserName(username);
                newUser.setEmail(email);
                newUser.setPhoneNum(phoneNum);

                // Không cần lấy giá trị của UserID vì nó đã được tự động tăng lên
                // Đóng kết nối
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error in signup method. Details: " + ex.getMessage());
            ex.printStackTrace();
        }
        return newUser;
    }

    public List<UserDTO> list(String keyword, String sortCol) {
        List<UserDTO> userList = new ArrayList<>();

        try {
            Connection conn = DBUtils.getConnection();
            String sql = "SELECT UserID, UserName, Email, PhoneNum, RegistrationDate, Type, AccountStatus FROM Users ";

            if (keyword != null && !keyword.isEmpty()) {
                sql += " WHERE UserName LIKE ? OR Email LIKE ? OR PhoneNum LIKE ? ";
            }

            if (sortCol != null && !sortCol.isEmpty()) {
                sql += " ORDER BY " + sortCol + " ASC ";
            }

            PreparedStatement ps = conn.prepareStatement(sql);

            if (keyword != null && !keyword.isEmpty()) {
                String searchKeyword = "%" + keyword + "%";
                ps.setString(1, searchKeyword);
                ps.setString(2, searchKeyword);
                ps.setString(3, searchKeyword);
            }

            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    int userID = rs.getInt("UserID");
                    String userName = rs.getString("UserName");
                    String email = rs.getString("Email");
                    String phoneNum = rs.getString("PhoneNum");
                    Date registrationDate = rs.getDate("RegistrationDate");
                    String type = rs.getString("Type");
                    String accountStatus = rs.getString("AccountStatus");

                    UserDTO user = new UserDTO();
                    user.setUserID(userID);
                    user.setUserName(userName);
                    user.setEmail(email);
                    user.setPhoneNum(phoneNum);
                    user.setRegistrationDate(registrationDate);
                    user.setType(type);
                    user.setAccountStatus(accountStatus);

                    userList.add(user);
                }

                // Log statement to check if the list is populated
                if (!userList.isEmpty()) {
                    System.out.println("User list is populated. Size: " + userList.size());
                } else {
                    System.out.println("User list is empty.");
                }
            }

            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error in UserDAO.list method. Details:" + ex.getMessage());
            ex.printStackTrace();
        }

        return userList;
    }
    public boolean banUser(int userID) {
    try {
        Connection con = DBUtils.getConnection();
        String sql = "UPDATE Users SET AccountStatus = 'banned' WHERE UserID = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, userID);
        int rowsAffected = stmt.executeUpdate();
        con.close();
        return rowsAffected > 0;
    } catch (SQLException ex) {
        System.out.println("Error banning user. Details:" + ex.getMessage());
        ex.printStackTrace();
        return false;
    }
}

}
