package dao;

import java.sql.*;

/**
 * Created by Yaroslav on 23.06.2016.
 */
public abstract class AbstractDAO<E> {

    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    String DB_URL = "jdbc:mysql://localhost:3306/adminpaneldb";
    String USER = "root";
    String PASS = "root";
    protected Connection conn;
    protected Statement stmt;


    public abstract  E read(int id) throws SQLException, ClassNotFoundException;

    public void getMysqlConnection() throws SQLException, ClassNotFoundException {
        //STEP 2: Register JDBC driver
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
    }

}