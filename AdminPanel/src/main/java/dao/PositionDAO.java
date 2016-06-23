package dao;

import model.Employee;
import model.Position;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Yaroslav on 22.06.2016.
 */
public class PositionDAO extends AbstractDAO {

    private Position position;

    public Position read(int id) throws SQLException, ClassNotFoundException {
        getMysqlConnection();
        stmt = conn.createStatement();
        String sql = "SELECT * FROM adminpaneldb.position where id = " + id;
        ResultSet rs = stmt.executeQuery(sql);
        position = new Position();
        while(rs.next()) {
            //Retrieve by column name
            position.setName(rs.getString("Name"));
            position.setDescription(rs.getString("Description"));
            //Display values
        }
        return position;
    }
}
