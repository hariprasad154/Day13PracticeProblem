package Com.BridgeLabs;
import java.util.Scanner;
import java.lang.reflect.Array;

public class IntListClass {
	  

  Integer maxNumInt;
  Float maxNumFloat;
  void Max(Integer numOne, Integer numTwo, Integer numThree) {
      if (numTwo.compareTo(maxNumInt) > 0) {
          System.out.println(numTwo + " Num Two is greater");
      } else if (numThree.compareTo(maxNumInt) > 0) {
          System.out.println(numThree + " Num Three is greater");
      } else {
          System.out.println(maxNumInt + " Num One is greater");
      }
  }
  
 
 
}


