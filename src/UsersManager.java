import java.sql.*;

public class UsersManager {
    public static void main(String[] args) {
        String jdbc = "jdbc:mysql://localhost:3306/db";
        String user = "root";
        String password = "root";

        User user1 = new User("Vinipoxa", "senha", "Vinicius de Oliveira", "vof@gmail.com");

        try{
            Connection connection = DriverManager.getConnection(jdbc, user, password);
            if(connection != null){
                System.out.println("Connected to the database");

                String sql = "DELETE FROM users WHERE username=?";

                // Usar o DELETE
                /*PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, "Vinipoxa");
                ps.executeUpdate();*/

                // Usar o UPDATE
                /*Statement statement = connection.createStatement();
                int rows = statement.executeUpdate(sql);
                if(rows >0) System.out.println("Users data has been updated");*/

                // Usar o UPDATE
                /*PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, "senhanova");
                ps.setString(2, "Chico Bento");
                ps.setString(3, "Vinipoxa");
                ps.executeUpdate();*/

                // Usar o SELECT
                /*Statement statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sql);
                while(result.next()){
                    String username = result.getNString(2);
                    String passwordR = result.getNString(3);
                    String fullname = result.getNString(4);
                    String email = result.getNString(5);
                    System.out.println(username +", "+passwordR+", "+fullname+", " + email);
                }*/

                // Usar o INSERT
                /*PreparedStatement ps = connection.prepareStatement(sql);
                ps.setString(1, user1.getUsername());
                ps.setString(2, user1.getPassword());
                ps.setString(3, user1.getFullname());
                ps.setString(4, user1.getEmail());
                int rows = ps.executeUpdate();
                if(rows > 0){
                    System.out.println("New user added");
                }*/

                connection.close();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
