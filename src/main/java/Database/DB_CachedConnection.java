package Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Queue;

public class DB_CachedConnection
{

  private Queue<Statement> statQueue = new LinkedList<>();
  private Connection conn;

  public DB_CachedConnection(Connection conn)
  {
    this.conn = conn;
  }

  public Statement getStatement() throws SQLException
  {
    if (conn == null)
    {
      throw new RuntimeException("not connected to database");
    }
    if (statQueue.isEmpty())
    {
      return conn.createStatement();
    }
    return statQueue.poll();
  }

  public void releaseStatement(Statement stat)
  {
    if (conn == null)
    {
      throw new RuntimeException("not connected to database");
    }
    statQueue.offer(stat);
  }

}
