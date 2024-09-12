package strings;

import java.util.Objects;
public class StringCompareWays {
	public static void main(String[] args) {
		String Input1 = "Scaler";
		String Input2 = "InterviewBit";


//			Output= false

		String Input3 = "Scaler";
		String Input4 = "Scaler";

		
//			Output= true

		String Input5 = "Scaler";
		String Input6 = "scaler";
		
		String Input7 = "Scaler";
		String Input8= null;
		
		String Input9 = null;
		String Input10= null;
		
		//way 1
		System.out.println("================way 1=================");
		System.out.println(Input1.equals(Input2));
		System.out.println(Input3.equals(Input4));
		System.out.println(Input5.equals(Input6));
		System.out.println(Input7.equals(Input8));
//		System.out.println(Input9.equals(Input10));//exception



		//way 2
		System.out.println("================way 2=================");

		System.out.println(Input1.equalsIgnoreCase(Input2));
		System.out.println(Input3.equalsIgnoreCase(Input4));
		System.out.println(Input5.equalsIgnoreCase(Input6));
		System.out.println(Input7.equalsIgnoreCase(Input8));
//		System.out.println(Input9.equalsIgnoreCase(Input10));//exception
		
		//way 3
		
		System.out.println("================way 3=================");

		
        boolean result1 = Objects.equals(Input1, Input2); 
        boolean result2 = Objects.equals(Input3, Input4); 
        boolean result3 = Objects.equals(Input5, Input6); 
        boolean result4 = Objects.equals(Input7, Input8); 
        boolean result5 = Objects.equals(Input9, Input10); //no exception



        
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        
//        way 4
		System.out.println("================way 4=================");

        System.out.println(Input1.compareTo(Input2));
        System.out.println(Input3.compareTo(Input4));
        System.out.println(Input5.compareTo(Input6));//based on the unoicode value83-115=-32
//        System.out.println(Input7.compareTo(Input8));both excapeion here
//        System.out.println(Input9.compareTo(Input10));





		
//			Output= false

	}
}
