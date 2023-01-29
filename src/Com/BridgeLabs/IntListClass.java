package Com.BridgeLabs;
import java.util.Scanner;
import java.lang.reflect.Array;

public class IntListClass {

	int Max ;//TOget the Max i
	
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


	


}


