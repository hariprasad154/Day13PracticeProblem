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
	void Max(Float numOne, Float numTwo, Float numThree) {

		if (numTwo.compareTo(maxNumFloat) > 0) {
			System.out.println(numTwo + " Num Two is greater");
		} else if (numThree.compareTo(maxNumFloat) > 0) {
			System.out.println(numThree + " Num Three is greater");
		} else {
			System.out.println(maxNumFloat + " Num One is greater");
		}
	}





}



