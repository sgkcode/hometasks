package javacollections.flowerbouquet.flowers;

public class Peony extends Flower {

  private PeonyVariety peonyVariety;

  public Peony(PeonyVariety peonyVariety, int stemLength, FreshnessLevel freshnessLevel,
      double cost) {
    super(stemLength, freshnessLevel, cost);
    this.peonyVariety = peonyVariety;
  }

  public PeonyVariety getPeonyVariety() {
    return peonyVariety;
  }

  public void setPeonyVariety(PeonyVariety peonyVariety) {
    this.peonyVariety = peonyVariety;
  }

  @Override
  public String toString() {
    return super.toString().replace("{",
        "{roseVariety=" + peonyVariety
            + ", ");
  }
}
