package Data;

public abstract class Vehicle
{
  protected int id;
  protected String brand;
  protected int hp;
  protected int weight;

  /**
   * 
   * @param id vehicle id
   * @param brand which company made the vehicle
   * @param hp how many horsepower the vehicle got
   * @param weight how heavy the vehicle ise
   */
  
  public Vehicle(int id, String brand, int hp, int weight)
  {
    this.id = id;
    this.brand = brand;
    this.hp = hp;
    this.weight = weight;
  }
}
