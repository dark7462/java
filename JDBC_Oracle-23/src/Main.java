import java.sql.*;
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@//localhost:1521/FREEPDB1";
        String user = "system";
        String password = "YourStrongPassword1";

        String query = "select * from emp"; // the query we'll execute
        Connection conn;  // for jdbc connection
        Statement stmt = null; // for statements
        ResultSet rs; // for storing and printing the results table
        try{
            conn = DriverManager.getConnection(url,user,password);
            if(conn != null){
                stmt = conn.createStatement(); // if the connection is set then create the statement
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // whole connection done now comes the scripts to get data
        try {
            assert stmt != null;
            rs = stmt.executeQuery(query);
            while(rs.next()) { // runs though line by line
                String  name = rs.getString("emp_name");
                int id = rs.getInt("emp_id");
                System.out.println(id + " " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // script to update data NOTE : the statement should be in all caps except the names of any table or variable / column / row value
        try {
            // Corrected "inset" to "INSERT"
            String up_query = "INSERT INTO emp VALUES (20255, 'Navin', 'SDE')";
            stmt.executeUpdate(up_query);
            System.out.println("Update successful!"); // Optional: add a success message
        } catch (SQLException e) {
            System.out.println("Not able to update");
            e.printStackTrace();
        }

        //print the updated data same as the first one
        try {
            rs = stmt.executeQuery(query);
            while(rs.next()) { // runs though line by line
                String  name = rs.getString("emp_name");
                int id = rs.getInt("emp_id");
                System.out.println(id + " " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}