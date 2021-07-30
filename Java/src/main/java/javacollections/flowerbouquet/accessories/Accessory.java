package javacollections.flowerbouquet.accessories;

public class Accessory {
 private AccessoryType accessoryType;
 private double cost;

 public Accessory(AccessoryType accessoryType, double cost) {
  this.accessoryType = accessoryType;
  this.cost = cost;
 }

 public AccessoryType getAccessoryType() {
  return accessoryType;
 }

 public void setAccessoryType(AccessoryType accessoryType) {
  this.accessoryType = accessoryType;
 }

 public double getCost() {
  return cost;
 }

 public void setCost(double cost) {
  this.cost = cost;
 }

 @Override
 public String toString() {
  return "Accessory{" +
      "accessoryType=" + accessoryType +
      ", cost=" + cost +
      '}';
 }
}
