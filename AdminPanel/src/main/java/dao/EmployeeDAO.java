package dao;

import model.Employee;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Yaroslav on 16.06.2016.
 */
public interface EmployeeDAO {
   String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    String DB_URL = "jdbc:mysql://localhost:3306/adminpaneldb";
    //  Database credentials
    String USER = "root";
    String PASS = "root";

    void create();
    Employee readEmployee(String name) throws SQLException, ClassNotFoundException;
    void update();
    void delete();
    void getMysqlConnection() throws SQLException, ClassNotFoundException;
}
