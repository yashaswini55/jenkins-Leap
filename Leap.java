public class Leap {

  public static void main(String[] args) {

    
    int year = 1998;
    boolean leap = false;
    System.out.println("Loop based execution - CICD Demo");

    if (year % 4 == 0) {

      if (year % 100 == 0) {

        if (year % 400 == 0)
          leap = true;
        else
          leap = false;
      }
      
      else
        leap = true;
    }
    
    else
      leap = false;

    if (leap)
      System.out.println(year + " is a leap year.");
    else
      System.out.println(year + " is not a leap year.");


  }
}