package Com.BridgeLabs;
import java.util.Scanner;
import java.lang.reflect.Array;

public class IntListClass {

	int Max ;//TOget the Max i
	float Max2 ;
	static Scanner src=new Scanner(System.in);
	//we have to create the instace cariables here 
	static {
		System.out.println(String.format("Enter the number of elemnts want to add into the Array {}"));
	}
	static Integer len=src.nextInt();
	static Integer[] arr2= new Integer[len];
	public void IntNum() {//Method to add the elements into the list
		//the loop for the iterations how many numbers we want to addd to the list
		for (Integer i =0;i<len;i++) {
			System.out.println(String.format("Enter the %d th element in the Int format ",i));
			arr2[i]=src.nextInt();			
		}
	}
	public void GetMax() {
		Max =arr2[0];
		for (int j=0;j<len-1 ;j++ ) {
			Integer temp=arr2[j];
			Integer nxt=arr2[j+1];
			Integer out = nxt.compareTo(temp);//compare method to compare the elements
			if (out >=1 && Max < nxt   ) {//Conditinal statments to pass the biggest one to max
				Max=nxt;
			}
		}
		System.out.println("The Largest number in the given numbers is - "+Max);
	}


	//For the Floot



	//we have to create the instace cariables here 
	static {
		System.out.println(String.format("Enter the number of elemnts want to add into the Floot Array{}"));
	}
	static Integer len2=src.nextInt();
	static float[] arr3= new float[len2];
	public void FloatNum() {//Method to add the elements into the list
		//the loop for the iterations how many numbers we want to addd to the list
		for (int i =0;i<len2;i++) {
			System.out.println(String.format("Enter the %d th element int the Flooat Format ",i));
			arr3[i]=src.nextFloat()	;	
		}
	}
	public void GetMaxFloat() {
		Max2 =arr3[0];
		for (int j=0;j<len2-1 ;j++ ) {
			Float temp1=arr3[j];
			Float nxt1=arr3[j+1];
			Float out = (float) nxt1.compareTo(nxt1);//compare method to compare the elements
			if (out >1 && Max2 < nxt1   ) {//Conditinal statments to pass the biggest one to max
				Max2=nxt1;
			}
		}
		System.out.println("The Largest number in the given numbers is - "+Max2);
	}


}



