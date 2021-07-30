package javacollections.flowerbouquet;

import java.util.Arrays;
import java.util.List;
import javacollections.flowerbouquet.accessories.Accessory;
import javacollections.flowerbouquet.accessories.AccessoryType;
import javacollections.flowerbouquet.flowers.Flower;
import javacollections.flowerbouquet.flowers.FreshnessLevel;
import javacollections.flowerbouquet.flowers.Peony;
import javacollections.flowerbouquet.flowers.PeonyVariety;
import javacollections.flowerbouquet.flowers.Rose;
import javacollections.flowerbouquet.flowers.RoseVariety;
import javacollections.flowerbouquet.menu.ConsoleMenu;

public class Runner {

  public static void main(String[] args) {
    List<Flower> flowers = Arrays.asList(
        new Rose(RoseVariety.BRIGHTON, 90, FreshnessLevel.HIGH, 2),
        new Rose(RoseVariety.FREEDOM, 80, FreshnessLevel.HIGH, 2),
        new Rose(RoseVariety.RHODOS, 80, FreshnessLevel.LOW, 2.5),
        new Peony(PeonyVariety.GARDENIA, 60, FreshnessLevel.MEDIUM, 10),
        new Peony(PeonyVariety.DINNER_PLATE, 70, FreshnessLevel.MEDIUM, 11)
    );
    List<Accessory> accessories = Arrays.asList(
        new Accessory(AccessoryType.RIBBON, 3),
        new Accessory(AccessoryType.TOY, 7)
    );
    Bouquet bouquet = new Bouquet(flowers, accessories);
    ConsoleMenu consoleMenu = new ConsoleMenu();
    consoleMenu.startConsoleMenu(bouquet);
  }
}
