package com.array;
import java.util.Scanner;

public class General_array {
	static  void method(int...arr){
		for(int a:arr) {
			System.out.println(a);
		}
	}
 public static void main(String arg[]){
	     //array inputing and printing
//     int mark[]=new int[5];
   Scanner s=new Scanner(System.in);
//   System.out.println("enter the mark");
//   for(int i=0;i<5;i++) {
//   	 mark[i]=s.nextInt();
//   }
//   for(int i=0;i<5;i++) {
//   	System.out.println(mark[i]);
//  }
	 
	   //multi-dimensional array
//	 int arr[][]=new int[3][3];
//	 
//	 Scanner s=new Scanner(System.in);
//	 System.out.println("enter the number");
//	 for(int i=0;i<3;i++) {
//		 for(int j=0;j<3;j++) {
//			 arr[i][j]=s.nextInt();
//		 }
//	 }
//	 for(int i=0;i<3;i++) {
//		 for(int j=0;j<3;j++) {
//        System.out.print(arr[i][j]);
//		 }
//		 System.out.println();
//	 }
              //jaggged arrays
//       int arr[][]=new int[3][];
//       arr[0]=new int[3];
//       arr[1]=new int[2];
//       arr[2]=new int[4];
//       for(int i=0;i<arr.length;i++){ 
//    	  for(int j=0;j<arr[i].length;j++){
//    	     System.out.println("enter the number arr"+i+":"+j);
//    		 arr[i][j]=s.nextInt();  
//    	   }
//    	   System.out.println();
//       }
//       for(int i=0;i<arr.length;i++){
//    	   for(int j=0;j<arr[i].length;j++){
//    		   System.out.print(arr[i][j]);
//    	   }
//    	   System.out.println();
//       }
            //anonymous array
            method(23,23);
 }
}

