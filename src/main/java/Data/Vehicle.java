package Data;

public class Vehicle
{
  private int id;
  private String brand;
  private int hp;
  private int weight;

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
