package Data;

public class LKW extends Vehicle
{
  private int axes;
  private int kilometers;

  public LKW(int axes, int kilometers, int id, String brand, int hp, int weight)
  {
    super(id, brand, hp, weight);
    this.axes = axes;
    this.kilometers = kilometers;
  }
}
