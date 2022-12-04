class Main {
  public static void main(String[] args) {
    System.out.println(withoutString("cat","bat"));
    System.out.println();
    System.out.println(counthi("hihihihi"));
    System.out.println();
    System.out.println(concat("hi","bye"));
    System.out.println();
    System.out.println(firsthalf("concat"));
  }
    public static String withoutString(String a, String b){
      return a.replaceAll(b,"");
    }
    public static int counthi(String s){
      int count = 0;
      for(int i = 0; i<= s.length()-2; i++){
        if(s.substring(i, i+2).equals("hi")){
          count++;
        }
      }
      return count;
    }
    public static String concat(String x, String z){
      int xlen = x.length();
      int zlen = z.length();
      if (zlen == 0 || xlen == 0){
        String word2 = x+z;
        return word2;
      }
      else{
        String firstz = z.substring(0,1);
        String lastx = x.substring(xlen-1);
        if(lastx.equals(firstz)){
          String word = x+z.substring(1);
          return word;
        }
      else{
        String word1 = x+z;
        return word1;
      }
      }
    }
      public static String firsthalf(String c){
        int clen = c.length();
        if (clen%2 != 0){
          return "Not an even string";
        }
      else{
        return c.substring(0, clen/2);
      }
      }  
    
} 
