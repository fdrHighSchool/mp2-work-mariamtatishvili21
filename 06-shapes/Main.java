class Main {
  public static void main(String[] args) {
    System.out.println();
    square(2);
    System.out.println();
    rectangle(2,4);
    System.out.println();
    rectangle(4,2);
    System.out.println();
    rightTriangle(8);
    System.out.println();
    triangle(5);
    }//end of main method
  
  public static void square(int s){
    for (int row = 0; row < s; row++){
      for(int col = 0; col< s; col++){
        System.out.print("* ");
      }//end inner for loop
      System.out.println();//next line
    }//end outerfor loop
  }//end square method

  
   public static void rectangle(int l, int w){
     for(int row = 0; row < l; row++){
       for(int col = 0; col < w; col++){
         System.out.print("* ");
       }//end inner loop
        System.out.println();//next line
     }//end outer loop
   }//end rectangle method

  
   public static void rightTriangle(int h ){
     for(int row = 0; row < h; row++){
       for(int col = 0; col <= row; col++){
         System.out.print("* ");
      }//end inner loop
        System.out.println();//next line
    }//end outer loop
  }//end rightTriangle method

  
  public static void triangle(int t){
    for(int row = 0; row < t; row++){
       for(int col = 0; col< t - row; col++){
         System.out.print(" ");
      }//end inner loop
      for(int k = 0; k < row; k++){
        System.out.print(" *");
      }// end loop
        System.out.println();//next line
    }//end outer loop
  }//end triangle method
  
  
}//end class
