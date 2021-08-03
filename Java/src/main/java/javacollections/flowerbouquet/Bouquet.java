package javacollections.flowerbouquet;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import javacollections.flowerbouquet.accessories.Accessory;
import javacollections.flowerbouquet.flowers.Flower;

public class Bouquet {

  private List<? extends Flower> flowers;
  private List<? extends Accessory> accessories;

  public Bouquet(List<? extends Flower> flowers, List<? extends Accessory> accessories) {
    this.flowers = flowers;
    this.accessories = accessories;
  }

  public List<? extends Flower> getFlowers() {
    return flowers;
  }

  public void setFlowers(List<? extends Flower> flowers) {
    this.flowers = flowers;
  }

  public List<? extends Accessory> getAccessories() {
    return accessories;
  }

  public void setAccessories(
      List<? extends Accessory> accessories) {
    this.accessories = accessories;
  }

  public void sortByFreshnessLevel() {
    flowers.sort(Comparator.comparing(Flower::getFreshnessLevel));
  }

  public List<? extends Flower> getFlowersByRangeOfStemLength(int min, int max) {
    return flowers.stream()
        .filter(flower -> flower.getStemLength() >= min & flower.getStemLength() <= max)
        .collect(Collectors.toList());
  }

  public double getFlowersCost() {
    return flowers.stream()
        .mapToDouble(Flower::getCost)
        .sum();
  }

  public double getAccessoriesCost() {
    return accessories.stream()
        .mapToDouble(Accessory::getCost)
        .sum();
  }

  public double getBouquetCost() {
    return getFlowersCost() + getAccessoriesCost();
  }

  public void print(List<? extends Flower> list) {
    list.forEach(System.out::println);
  }

  public void print(Bouquet bouquet) {
    bouquet.getFlowers().forEach(System.out::println);
    bouquet.getAccessories().forEach(System.out::println);
  }

  @Override
  public String toString() {
    return "Bouquet{"
        + "flowers=" + flowers
        + ", accessories=" + accessories
        + '}';
  }
}
