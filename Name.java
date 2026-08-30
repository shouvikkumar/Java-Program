import java.util.Scanner;

public class Name {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your full name: ");
    String name = sc.nextLine();

    System.out.println("Name: " + name);
    System.out.println("Name Length: " + name.length());
    System.out.println("1st Character: " + name.charAt(0));
    System.out.println("5th Character: " + name.charAt(4));

    sc.close();
  }

}
