package Data;

public class PKW
{

  private int id;
  private String brand;
  private int hp;
  private int weight;
  private int seats;
  private String spez;

  public PKW(int id, String brand, int seats, String spez, int hp, int weight)
  {
    this.id = id;
    this.brand = brand;
    this.hp = hp;
    this.weight = weight;
    this.seats = seats;
    this.spez = spez;
  }

  public int getSeats()
  {
    return seats;
  }

  public void setSeats(int seats)
  {
    this.seats = seats;
  }

  public String getSpez()
  {
    return spez;
  }

  public void setSpez(String spez)
  {
    this.spez = spez;
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
    int hash = 3;
    hash = 73 * hash + this.id;
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
    final PKW other = (PKW) obj;
    if (this.id != other.id)
    {
      return false;
    }
    return true;
  }

    
  

}
