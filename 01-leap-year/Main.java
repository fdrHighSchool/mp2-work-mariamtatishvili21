class Main {
  public static void main(String[] args){
      System.out.println(isLeapYear(2000));
      System.out.println(isLeapYear(1900));
  }
  
  public static boolean isLeapYear(int year) {
    

    if (year % 4!=0 || (year % 100==0 && year %400!=0)) {
      return false;
    }
    return true;
    }
  
}
