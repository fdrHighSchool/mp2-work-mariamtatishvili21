import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println("Enter a number: ");
    int money = s.nextInt();
    String m  = String.valueOf(money);
    m.substring(m.length()-2,m.length());
    int k = Integer.parseInt( m.substring(m.length()-2,m.length()));
    if (m.length() < 2){
      System.out.println(0);
    }
    else{
      System.out.println(k / 25 );
    }
  }
}
