import java.util.Scanner;

public class NameUppercase {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name in lowercase: ");
    String name = sc.nextLine();

    System.out.println("Uppercase name: " + name.toUpperCase());

    sc.close();
  }
}