import java.util.Scanner;

public class apcsarighttriangle {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("\nEnter base: ");
    int base = in.nextInt();
    System.out.print("Enter height: ");
    int height = in.nextInt();
    System.out.print("Enter hypotenuse: ");
    int hypotenuse = in.nextInt();

    if (Math.pow(base, 2) + Math.pow(height, 2) == (Math.pow(hypotenuse, 2))) {
      System.out.println("\nYes, that's a right triangle!");
    } else {
      System.out.println("\nNope...not a right triangle.");
    }

    in.close();
  }
}
