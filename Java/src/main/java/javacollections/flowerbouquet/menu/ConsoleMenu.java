package javacollections.flowerbouquet.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javacollections.flowerbouquet.Bouquet;

public class ConsoleMenu {

  public void startConsoleMenu(Bouquet bouquet) {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    showMenu();
    do {
      try {
        int menuChoice = Integer.parseInt(reader.readLine());
        switch (menuChoice) {
          case 0:
            showMenu();
            break;
          case 1:
            bouquet.print(bouquet);
            break;
          case 2:
            bouquet.print(bouquet.getFlowers());
            break;
          case 3:
            bouquet.sortByFreshnessLevel();
            System.out.println("The bouquet has been sorted by freshness");
            break;
          case 4:
            int minStemLength;
            int maxStemLength;
            while (true) {
              System.out.println("Enter the minimum stem length");
              try {
                minStemLength = Integer.parseInt(reader.readLine());
                System.out.println("Enter the maximum stem length");
                maxStemLength = Integer.parseInt(reader.readLine());
              } catch (NumberFormatException e) {
                printIncorrectInput();
                continue;
              }
              bouquet.print(bouquet.getFlowersByRangeOfStemLength(minStemLength, maxStemLength));
              if (bouquet.getFlowersByRangeOfStemLength(minStemLength, maxStemLength).isEmpty()) {
                System.out.println("Nothing found");
              }
              break;
            }
            break;
          case 5:
            System.out.println("Bouquet cost: " + bouquet.getBouquetCost());
            break;
          case 6:
            System.exit(0);
            break;
          default:
            printIncorrectInput();
        }
      } catch (NumberFormatException | IOException e) {
        printIncorrectInput();
      }
    } while (true);
  }

  public void showMenu() {
    System.out.println("Menu\n"
        + "1. Get all the items of the bouquet\n"
        + "2. Get all the flowers in the bouquet\n"
        + "3. Sort flowers by freshness\n"
        + "4. Get flowers by a range of stem length\n"
        + "5. Get the cost of the bouquet\n"
        + "6. Exit");
  }

  public void printIncorrectInput() {
    System.out.println("Incorrect input. Once again");
  }
}
