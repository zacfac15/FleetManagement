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

  public int getAxes()
  {
    return axes;
  }

  public void setAxes(int axes)
  {
    this.axes = axes;
  }

  public int getKilometers()
  {
    return kilometers;
  }

  public void setKilometers(int kilometers)
  {
    this.kilometers = kilometers;
  }

  public int getId()
  {
    return id;
  }

  public void setId(int id)
  {
    this.id = id;
  }

  public String getBrand()
  {
    return brand;
  }

  public void setBrand(String brand)
  {
    this.brand = brand;
  }

  public int getHp()
  {
    return hp;
  }

  public void setHp(int hp)
  {
    this.hp = hp;
  }

  public int getWeight()
  {
    return weight;
  }

  public void setWeight(int weight)
  {
    this.weight = weight;
  }
  
  
}
