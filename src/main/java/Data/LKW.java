package Data;

public class LKW extends Vehicle
{
  private int axes;
  private int kilometers;

  public LKW(int id, String brand,int axes, int weight,int kilometers,int hp)
  {
    super(id, brand, hp, weight);
    this.axes = axes;
    this.kilometers = kilometers;
  }
}
