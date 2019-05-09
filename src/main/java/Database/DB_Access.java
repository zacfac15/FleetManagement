package Database;

import java.sql.Connection;

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
}
