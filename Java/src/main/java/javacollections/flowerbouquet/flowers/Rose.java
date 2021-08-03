package javacollections.flowerbouquet.flowers;

public class Rose extends Flower {

  private RoseVariety roseVariety;

  public Rose(RoseVariety roseVariety, int stemLength, FreshnessLevel freshnessLevel,
      double cost) {
    super(stemLength, freshnessLevel, cost);
    this.roseVariety = roseVariety;
  }

  public RoseVariety getRoseVariety() {
    return roseVariety;
  }

  public void setRoseVariety(RoseVariety roseVariety) {
    this.roseVariety = roseVariety;
  }

  @Override
  public String toString() {
    return super.toString().replace("{",
        "{roseVariety=" + roseVariety
            + ", ");
  }
}
