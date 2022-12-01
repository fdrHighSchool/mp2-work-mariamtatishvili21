import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("enter a number: ");
    int num = scanner.nextInt();

    if (num % 3==0 & num%5==0){
      System.out.println("fizzbuzz");
    }
    else if (num % 5==0){
      System.out.println("buzz");
    }
    else if (num % 3==0){
      System.out.println("fizz");
    }
    else{
      System.out.println(num);
    }
  }
}
