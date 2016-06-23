import dao.AbstractDAO;
import dao.EmployeeDAO;
import dao.PositionDAO;
import model.Employee;
import model.Position;

import java.sql.*;

/**
 * Created by Yaroslav on 16.06.2016.
 */
public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        EmployeeDAO employeeDAO = new EmployeeDAO();
//        Employee employee =   employeeDAO.read(1);
//        System.out.println("Employee age: " + employee.getAge());
//        System.out.println("Employee experiance: " + employee.getExperiance());

        AbstractDAO<Position> positionDAO = new PositionDAO();
        Position position = positionDAO.read(1);
        System.out.println(position.getName());
        System.out.println(position.getDescription());
        

//
//        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//        String DB_URL = "jdbc:mysql://localhost:3306/adminpaneldb";
//        //  Database credentials
//        String USER = "root";
//        String PASS = "root";
//        Connection conn;
//        Statement stmt;
//        Class.forName("com.mysql.jdbc.Driver");
//        //STEP 3: Open a connection
//        //       System.out.println("Connecting to database...");
//            conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            stmt = conn.createStatement();
//            String sql = "SELECT * FROM adminpaneldb.employee where id = 2" ;
//            ResultSet rs = stmt.executeQuery(sql);
//           Employee employee = new Employee();
//            while(rs.next()) {
//                //Retrieve by column name
//               employee.setFullname(rs.getString("Name"));
//
//                //Display values
//            }
//
//        System.out.println(employee.getFullname());

        }
    }

