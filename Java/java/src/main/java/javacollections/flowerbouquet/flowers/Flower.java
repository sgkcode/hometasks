package javacollections.flowerbouquet.flowers;

public abstract class Flower {
  private int stemLength;
  private FreshnessLevel freshnessLevel;
  private double cost;

  public Flower(int stemLength, FreshnessLevel freshnessLevel, double cost) {
    this.stemLength = stemLength;
    this.freshnessLevel = freshnessLevel;
    this.cost = cost;
  }

  public int getStemLength() {
    return stemLength;
  }

  public void setStemLength(int stemLength) {
    this.stemLength = stemLength;
  }

  public FreshnessLevel getFreshnessLevel() {
    return freshnessLevel;
  }

  public void setFreshnessLevel(FreshnessLevel freshnessLevel) {
    this.freshnessLevel = freshnessLevel;
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  @Override
  public String toString() {
    return "Flower{" +
        "stemLength=" + stemLength +
        ", freshnessLevel=" + freshnessLevel +
        ", cost=" + cost +
        '}';
  }
}
