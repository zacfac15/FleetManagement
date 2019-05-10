package Data;

public class PKW extends Vehicle
{

  private int seats;
  private String spez;

  public PKW(int id, String brand, int seats, String spez, int hp, int weight)
  {
    super(id, brand, hp, weight);
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
  
  
}
