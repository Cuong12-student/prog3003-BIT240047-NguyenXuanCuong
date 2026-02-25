/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author VICTUS
 */
import java.sql.*;
public class Main {
    private static final String URL =
        "jdbc:mysql://localhost:3306/jdbc_users?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "Cuong124@";
    public static void main(String[] args) {
        getAllUsers();
        deleteUser(1);
        deleteUser(11);
    }
    static void insertUser(String name, String email) {
        String sql = "INSERT INTO users(name, email) VALUES (?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, email);
            ps.executeUpdate();
            System.out.println("Inserted user successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static void deleteUser(int id) {
    String sql = "DELETE FROM nguoidung WHERE id = ?";

    try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setInt(1, id);

        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            System.out.println("Xoa user thanh cong!");
        } else {
            System.out.println("Khong tim thay user de xoa");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    static void getAllUsers() {
        String sql = "SELECT * FROM nguoidung";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("User list:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("username") + " | " +
                        rs.getString("email")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
