import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int num, digit, sum =0;
    Scanner s = new Scanner(System.in);
    System.out.print("enter a number: ");
    num = s.nextInt();
    while (num >0)
    {
    digit = num%10;
    sum= sum+digit;
    num= num/10;
    }
    if (sum%3 ==0){
      System.out.print("your num is divisible by 3");
    }
    else{
      System.out.print("your num is not divisible by 3");
    }
    }  
  }
