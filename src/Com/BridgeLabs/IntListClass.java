package Com.BridgeLabs;
import java.util.Scanner;
import java.lang.reflect.Array;

public class IntListClass {


	int Max ;//TOget the Max i
	float Max2 ;
	String Max3;
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
			Float out = (float) nxt1.compareTo(temp1);//System.out.println("@@@"+out);//compare method to compare the elements
			if (out >=1 && Max2 < nxt1   ) {//Conditinal statments to pass the biggest one to max
				Max2=nxt1;
				//System.out.println("!!!!!"+Max2);
			}		
		}
		System.out.println("The Largest number in the given numbers is - "+Max2);
	}
	//For String
	static {
		System.out.println(String.format("Enter the elemnts in String Array{}"));
	}
	static Integer len3=src.nextInt();
	static String[] arr4= new String[len3];
	public void String() {//Method to add the elements into the list
		//the loop for the iterations how many numbers we want to addd to the list
		for (int i =0;i<len3;i++) {
			System.out.println(String.format("Enter the %d th String in the String Array ",i));
			arr4[i]=src.next();	
		}

	}
	public void GetMaxString() {
		Max3 =arr4[0];
		for (int j=0;j<len3-1 ;j++ ) {
			String temp2=arr4[j];
			String nxt2=arr4[j+1];
			Integer out = nxt2.compareTo(temp2);//System.out.println("@@@"+out);//compare method to compare the elements
			if (out >=1 ) {//Conditinal statments to pass the biggest one to max
				Integer out2 =(Integer)Max3.compareTo(nxt2);
				if (out2<=0) {
					System.out.println("###\n");
					Max3=nxt2;
					System.out.println("@@@@");
				}
				
				//System.out.println("!!!!!"+Max2);
			}		
		}
		System.out.println("The Largest String is - "+Max3);
	}//4 2 3 8 7 2
}



