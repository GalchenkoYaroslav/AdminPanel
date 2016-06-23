package dao;

import model.Employee;

import java.sql.*;

/**
 * Created by Yaroslav on 16.06.2016.
 */
public class EmployeeDAO extends AbstractDAO {

    private Employee employee;

    public Employee read(int id) throws SQLException, ClassNotFoundException {
        getMysqlConnection();
       stmt = conn.createStatement();
        String sql = "SELECT * FROM adminpaneldb.employee where id = " + id;
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

}
