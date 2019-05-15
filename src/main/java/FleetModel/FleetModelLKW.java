package FleetModel;

import Data.LKW;
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

public class FleetModelLKW extends AbstractTableModel
{

  private DB_Access db = DB_Access.getInstance();
  private ArrayList<LKW> lkwList = new ArrayList<>();
  private String filename = System.getProperty("user.dir")
          + File.separator + "src"
          + File.separator + "res"
          + File.separator + "lkwList.ser";
  private String[] colNamesLKW =
  {
    "ID", "Brand", "Axes", "Weight", "Kilometers", "Horsepower"
  };

  @Override
  public int getRowCount()
  {
    return lkwList.size();
  }

  @Override
  public int getColumnCount()
  {
    return 6;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex)
  {
    LKW lkw = lkwList.get(rowIndex);

    switch (columnIndex)
    {
      case 0:
        return lkw.getId();
      case 1:
        return lkw.getBrand();
      case 2:
        return lkw.getAxes();
      case 3:
        return lkw.getWeight();
      case 4:
        return lkw.getKilometers();
      case 5:
        return lkw.getHp();
      default:
        return "Error";
    }
  }

  public void initLKWList() throws SQLException
  {
    lkwList = db.getLKW();
  }

  public void addLKW(LKW l) throws SQLException
  {
    if (!(lkwList.contains(l)))
    {
      lkwList.add(l);
      this.fireTableRowsInserted(lkwList.size() - 1, lkwList.size() - 1);
      db.insertLKW(lkwList.size() - 1, lkwList);
    }
  }

  @Override
  public String getColumnName(int column)
  {
    return colNamesLKW[column];
  }

  public void saveLKW() throws IOException
  {
    FileOutputStream fos = new FileOutputStream(filename);
    ObjectOutputStream oos = new ObjectOutputStream(fos);

    for (LKW lkw : lkwList)
    {
      oos.writeObject(lkw);
    }

    oos.close();
  }
}
