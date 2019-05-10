package FleetModel;

import Data.Vehicle;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FleetModel extends AbstractTableModel
{
  private ArrayList<Vehicle> list = new ArrayList<>(); 
  private String[] colNamesPKW = {"ID","Brand","Spezification","Weight","Seats","Horsepower"};
  private String[] colNamesLKW = {"ID","Brand","Axes","Weight","Kilometers","Horsepower"};
  private boolean pkw;
  
  @Override
  public int getRowCount()
  {
    return list.size();
  }

  @Override
  public int getColumnCount()
  {
    return 6;
  }

  @Override
  public Object getValueAt(int rowIndex, int columnIndex)
  {
    return list.get(rowIndex);
  }
  
  public void getPKW()
  {
    
  }

  public void isPkw(boolean pkw)
  {
    this.pkw = pkw;
    this.fireTableStructureChanged();
  }
  
  @Override
  public String getColumnName(int column)
  {
     if(pkw)
     {
       return colNamesPKW[column];
     }
     else
     {
       return colNamesLKW[column];
     }
  }
}
