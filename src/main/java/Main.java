import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    String a = "witaj świecie";
    System.out.println(a.toUpperCase());

    Scanner b = new Scanner(System.in);
    System.out.println("Podaj napis");

    String napis = b.nextLine();
    System.out.println(napis.toUpperCase());
  }
}