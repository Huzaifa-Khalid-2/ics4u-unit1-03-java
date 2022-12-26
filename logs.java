import java.util.Scanner;
/**
 * The program calculates the time needs to cook food.
 *
 * @author  Yiyun Qin
 * @version 2.0
 * @since   2022-09-23
 */

class Food {
  public static void main(String[] args) {
    final int maxFood = 3;
    final int timeSubMinute = 1;
    final int timeSubSec = 0;
    final int timePizzaMinute = 0;
    final int timePizzaSec = 45;
    final int timeSoupMinute = 1;
    final int timeSoupSec = 45;
    int foodTimeMinute = -1;
    int foodTimeSec = -1;
    final int aMinute = 60;
    String foodType;
    double multipleDouble;
    int multiple;


    Scanner myobj = new Scanner(System.in);
    System.out.print("Which food do you want to heat, sub, pizza or soup?: ");
    foodType = myobj.nextLine();
    System.out.print("How many " + foodType + "(s) are you cooking?(max 3): ");
    String foodNumberString = myobj.nextLine();

    try {
      int foodNumber = Integer.parseInt(foodNumberString);
      if (foodNumber > maxFood) {
        System.out.println("\nThe maximum quantity of food is 3.");
      } else if (foodNumber <= 0) {
        System.out.println("\nPlease enter a positive number!");
      } else {
        if (foodType.equals("sub")) {
          foodTimeMinute = foodNumber * timeSubMinute;
          foodTimeSec = foodNumber * timeSubSec;
        } else if (foodType.equals("pizza")) {
          foodTimeMinute = foodNumber * timePizzaMinute;
          foodTimeSec = foodNumber * timePizzaSec;
        } else if (foodType.equals("soup")) {
          foodTimeMinute = foodNumber * timeSoupMinute;
          foodTimeSec = foodNumber * timeSoupSec;
        } else {
          System.out.println("\nPlease choose a food in options!");
        }
      }
      if (foodTimeMinute >= 0 && foodTimeSec >= 0) {
        if (foodTimeSec >= aMinute) {
          multipleDouble = foodTimeSec / aMinute;
          multiple = (int) Math.floor(multipleDouble);
          foodTimeMinute = foodTimeMinute + multiple;
          foodTimeSec = foodTimeSec - multiple * aMinute;
        }
        System.out.println(
            "\nThe total cook time is " + foodTimeMinute + " minutes and "
            + foodTimeSec + " seconds."
        );
      }
    } catch (Exception e) {
      System.out.println("\nInvalid food number!");
    } finally {
      System.out.println("\nDone.");
    }
  }
}
