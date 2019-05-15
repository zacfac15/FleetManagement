package Database;

import Data.LKW;
import Data.PKW;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fabianzach
 */
public class DB_Access
{

  private DB_Database database = DB_Database.getInstance();
  private static DB_Access instance;
  private Connection conn = database.getConn();

  public static DB_Access getInstance()
  {
    if (instance == null)
    {
      instance = new DB_Access();
    }
    return instance;
  }

  public ArrayList<LKW> getLKW() throws SQLException
  {
    ArrayList<LKW> lkw = new ArrayList<>();

    Statement statement = database.getStatement();
    String sqlStr = "SELECT * FROM LKW";
    ResultSet rs = statement.executeQuery(sqlStr);

    while (rs.next())
    {
      lkw.add(new LKW(rs.getInt("ID"), rs.getString("Brand"),
              rs.getInt("Axes"), rs.getInt("Weight"), rs.getInt("Kilometers"), rs.getInt("Horsepower")));
    }
    database.releaseStatement(statement);

    return lkw;
  }

  public ArrayList<PKW> getPKW() throws SQLException
  {
    ArrayList<PKW> pkw = new ArrayList<>();

    Statement statement = database.getStatement();
    String sqlStr = "SELECT * FROM PKW";
    ResultSet rs = statement.executeQuery(sqlStr);

    while (rs.next())
    {
      pkw.add(new PKW(rs.getInt("ID"), rs.getString("Brand"), rs.getInt("Seats"),
              rs.getString("Spezification"), rs.getInt("Horsepower"), rs.getInt("Weight")));
    }
    database.releaseStatement(statement);

    return pkw;
  }

  public void createTablePKW() throws SQLException
  {
    String sql = "CREATE TABLE PKW\n"
            + "(\n"
            + "     ID integer NOT NULL PRIMARY KEY,\n"
            + "     Brand character varying NOT NULL,\n"
            + "     Spezification character varying NOT NULL,\n"
            + "     Seats integer NOT NULL,\n"
            + "     Weight integer NOT NULL,\n"
            + "     Horsepower integer  NOT NULL\n"
            + ")";

    Statement stat = conn.createStatement();
    stat.executeUpdate(sql);
  }

  public void createTableLKW() throws SQLException
  {
    String sql = "CREATE TABLE LKW\n"
            + "(\n"
            + "     ID integer NOT NULL PRIMARY KEY,\n"
            + "     Brand character varying NOT NULL,\n"
            + "     Axes integer NOT NULL,\n"
            + "     Kilometers integer NOT NULL,\n"
            + "     Weight integer NOT NULL,\n"
            + "     Horsepower integer  NOT NULL\n"
            + ")";

    Statement stat = conn.createStatement();
    stat.executeUpdate(sql);
  }

  public void insertPKW(int index, ArrayList<PKW> list) throws SQLException
  {
    Statement statement = conn.createStatement();
    String sqlString = "INSERT INTO PKW (ID, Brand, Spezification, Weight, Seats, Horsepower)\n"
            + " VALUES ("
            + list.get(index).getId() + ",'"
            + list.get(index).getBrand() + "','"
            + list.get(index).getSpez() + "',"
            + list.get(index).getWeight() + ","
            + list.get(index).getSeats() + ","
            + list.get(index).getHp() + ")";

    statement.execute(sqlString);
    statement.close();
  }

  public void insertLKW(int index, ArrayList<LKW> list) throws SQLException
  {
    Statement statement = conn.createStatement();
    String sqlString = "INSERT INTO LKW (ID, Brand, Axes, Weight, Kilometers, Horsepower)\n"
            + " VALUES ("
            + list.get(index).getId() + ",'"
            + list.get(index).getBrand() + "',"
            + list.get(index).getAxes() + ","
            + list.get(index).getWeight() + ","
            + list.get(index).getKilometers() + ","
            + list.get(index).getHp() + ")";

    statement.execute(sqlString);
    statement.close();
  }

  public void addTables() throws SQLException
  {
    createTableLKW();
    createTablePKW();
  }

  public static void main(String[] args)
  {

  }

}
