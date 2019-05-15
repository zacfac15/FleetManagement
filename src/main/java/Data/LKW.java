package Data;

public class LKW
{

  private int id;
  private String brand;
  private int hp;
  private int weight;
  private int axes;
  private int kilometers;

  public LKW(int id, String brand, int axes, int weight, int kilometers, int hp)
  {
    this.id = id;
    this.brand = brand;
    this.hp = hp;
    this.weight = weight;
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

  @Override
  public int hashCode()
  {
    int hash = 5;
    hash = 53 * hash + this.id;
    return hash;
  }

  @Override
  public boolean equals(Object obj)
  {
    if (this == obj)
    {
      return true;
    }
    if (obj == null)
    {
      return false;
    }
    if (getClass() != obj.getClass())
    {
      return false;
    }
    final LKW other = (LKW) obj;
    if (this.id != other.id)
    {
      return false;
    }
    return true;
  }
  
  

}
