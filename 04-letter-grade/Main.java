import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("enter your grade for comp sci: ");
    int grade = s.nextInt();
    String g = String.valueOf(grade);
    int gm =Integer.parseInt( g.substring(g.length()-1));
      
     if (grade >= 90){
       if(gm  >=7){
         System.out.println("your grade is an A+");
       }
       else if(gm >=4){
         System.out.println("your grade is an A");
      }
      else{
        System.out.println("your grade is an A-");
       }
      
     }
    if (grade < 90 && grade >= 80){
      if(gm >=7){
         System.out.println("your grade is an B+");
      }
       else if(gm>=4){
         System.out.println("your grade is an B");
       }
       else{
         System.out.println("your grade is an B-");
       }
  
     }
     if (grade < 80 && grade >= 70){
       if(gm >=7){
         System.out.println("your grade is an C+");
       }
       else if(gm>=4){
         System.out.println("your grade is an C");
       }
       else{
         System.out.println("your grade is an C-");
       }
      
     }
     if (grade < 70 && grade >= 60){
       if(gm >=7){
         System.out.println("your grade is an D+");
       }
       else if(gm>=4){
         System.out.println("your grade is an D");
       }
       else{
         System.out.println("your grade is an D-");
       }
     }
    
       if (grade < 60){
         System.out.println("your grade is an F");
     }
  }
}
    //String gradeVHans = "";
    //if (grade >= 90){
      //gradeVHans += "A";
    //}
    //else if (grade >= 80) {
      //gradeVHans += "B";
   // }

    //if (gm >= 7) {
      //gradeVHans += "+";
    //}
    //else if (gm <= 3) {
      //gradeVHans += "-";
    //}
    //System.out.println(gradeVHans);
  //}
//}
