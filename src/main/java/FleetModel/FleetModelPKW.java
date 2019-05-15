package FleetModel;

import Data.LKW;
import Data.PKW;
import Database.DB_Access;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FleetModelPKW extends AbstractTableModel
{

  private DB_Access db = DB_Access.getInstance();
  private ArrayList<PKW> pkwList = new ArrayList<>();
   private String filename = System.getProperty("user.dir")
          + File.separator + "src"
          + File.separator + "res"
          + File.separator + "pkwList.ser";
  private String[] colNamesPKW =
  {
    "ID", "Brand", "Spezification", "Weight", "Seats", "Horsepower"
  };

  @Override
  public int getRowCount()
  {
    return pkwList.size();
  }

  @Override
  public int getColumnCount()
  {
    return 6;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex)
  {
    PKW pkw = pkwList.get(rowIndex);
    switch (columnIndex)
    {
      case 0:
        return pkw.getId();
      case 1:
        return pkw.getBrand();
      case 2:
        return pkw.getSpez();
      case 3:
        return pkw.getWeight();
      case 4:
        return pkw.getSeats();
      case 5:
        return pkw.getHp();
      default:
        return "Error";
    }
  }

  /**
   * to add a PKW in the list and in the Database, if it is not existing
   * @param p PKW object
   * @throws SQLException 
   */
  public void addPKW(PKW p) throws SQLException
  {
    if (!(pkwList.contains(p)))
    {
      pkwList.add(p);
      this.fireTableRowsInserted(pkwList.size() - 1, pkwList.size() - 1);
      db.insertPKW(pkwList.size() - 1, pkwList);
    }
  }

  /**
   * to synchronize the data with the database
   * @throws SQLException 
   */
  public void initPKWList() throws SQLException
  {
    pkwList = db.getPKW();
  }

  @Override
  public String getColumnName(int column)
  {
    return colNamesPKW[column];
  }

  /**
   * to save data in a File
   * @throws IOException 
   */
  public void savePKW() throws IOException
  {
    FileOutputStream fos = new FileOutputStream(filename);
    ObjectOutputStream oos = new ObjectOutputStream(fos);

    for (PKW pkw : pkwList)
    {
      oos.writeObject(pkw);
    }
    oos.close();
  }
  
  /**
   * To load data from a file
   * @throws IOException
   * @throws ClassNotFoundException 
   */
  
  public void loadPKW() throws IOException, ClassNotFoundException
  {

    FileInputStream fis = new FileInputStream(filename);
    ObjectInputStream ois = new ObjectInputStream(fis);

    Object obj = ois.readObject();

    if (obj instanceof LKW)
    {
      PKW pkw = (PKW) obj;
      pkwList.add(pkw);
    }
    ois.close();
  }
}
