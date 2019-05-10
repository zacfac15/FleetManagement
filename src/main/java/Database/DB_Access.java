package Database;

import Data.LKW;
import Data.PKW;
import Data.Vehicle;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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
  
  public List<Vehicle> getLKW() throws SQLException
  {
    List<Vehicle> lkw = new ArrayList<>();
    
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
  
  public List<Vehicle> getPKW() throws SQLException
  {
    List<Vehicle> pkw = new ArrayList<>();
    
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
}
