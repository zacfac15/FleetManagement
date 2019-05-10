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
}
