package dao;

import model.Employee;
import model.Position;

import java.sql.*;
import java.util.List;

/**
 * Created by Yaroslav on 16.06.2016.
 */
public class EmployeeDaoImpl implements EmployeeDAO {
    private Connection conn;
    private Statement stmt;
    private Employee employee;
    public void create() {
    }

    public Employee readEmployee(String name) throws SQLException, ClassNotFoundException {
        getMysqlConnection();
        stmt = conn.createStatement();
        String sql = "SELECT * FROM employee where Name = " + name;
        ResultSet rs = stmt.executeQuery(sql);
        employee = new Employee();
        while(rs.next()) {
            //Retrieve by column name
            employee.setFullname(rs.getString("Name"));
            employee.setAge(rs.getInt("Age"));
            employee.setExperiance(rs.getInt("Experiance"));
            //Display values
        }
        return employee;
    }

    public void update() {

    }

    public void delete() {

    }

    public void getMysqlConnection() throws SQLException, ClassNotFoundException {
        //STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        //STEP 3: Open a connection
        //       System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
