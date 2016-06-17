import java.util.Scanner;

import sun.launcher.resources.launcher;

public class fourthLecture {
	
	static Scanner myScanner=new Scanner(System.in);

	public static void main(String[] args) {
		int a,b;
		a=10;
		b=20;
		
//		int[] numberArray=new int[100];
//		int i=100;
		
		// 2 3 5 6
				// 3 4 6 7
		
		int[][]twoDArray=new int[2][4];
		
		twoDArray[0][0]=2;
		twoDArray[0][1]=3;
		twoDArray[0][2]=5;
		twoDArray[0][3]=6;
		
		twoDArray[1][0]=3;
		twoDArray[1][1]=4;
		twoDArray[1][2]=6;
		twoDArray[1][3]=7;
		//prln("give input: ");
		
		//taking the input
//		for (int row = 0; row <2; row++) {
//			for (int column = 0; column < 4; column++) {
//				pr("twoDArray[" + row+ "]["+column+"] :");
//				twoDArray[row][column]=myScanner.nextInt();
//				
//			}
//			 
//		}
		
		//printing the 2darray
		int userInput=1;
		
		try {
			
//			for (int row = 0; row < 3; row++) {
//				
//				for (int column = 0; column < 4; column++) {
//					pr(twoDArray[row][column]+"\t");
//				}
//				
//				prln("\n");
//			}
//			pr("give number: ");
//			int userInput=myScanner.nextInt();
//			while (userInput!=200) {
//		
//				prln(100/userInput);
//				
//				pr("give number: ");
//				userInput=myScanner.nextInt();
//			}
			pr("give number: ");
			//int userInput=myScanner.nextInt();
			while (userInput<50) {
		
				prln(100/userInput);
				
				pr("give number: ");
				userInput=myScanner.nextInt();
				userInput++;
			}
			
			
		} catch (Exception unknownExpectation) {
			
			unknownExpectation.printStackTrace();
			
		}finally{
			userInput++;
			
			prln("came out try catch "+userInput);
		}
		
//		for (int row = 0; row < 3; row++) {
//			
//			for (int column = 0; column < 4; column++) {
//				pr(twoDArray[row][column]+"\t");
//			}
//			
//			prln("\n");
//		}
		
		prln("thank u");
		
//		for (int j = 2; j <100; j*=2) {
//			prln(j);
//		}
		/*while (i>0) {
			numberArray[i-1]=(i-1)*7;
			i--;
			
		}
		
		while (i<100) {
			prln("array[" +i+"]: " + numberArray[i]);
			i++;
		}*/
		
//		int j=2;
//		do {
//			prln("do");
//			prln(j);
//		} while (j<2&&j>0);
//		j=1;
//		while (j<2) {
//			prln("while loop");
//			prln(j);
//			
//		}
		
//		prln(a<b? a:b);
		
//		prln(compare(a, b));
		
//		b=calculateNumber(a, b);
		
//	    calculateNumber(12, 14);
//		prln(calculateNumber(a, b));
//		prln(a);

	}
	/*static String compare(int a,int b){
		if (a<b) {
			return "A is less than B";
		}else {
			return "B is less than A";
		}
	}
	static int calculateNumber(int number1,int number2){
		number1+=number2;
		//int result=number1+number2;
		return number1;
	}*/
	
	static public void prln(Object anyObject){
		System.out.println(anyObject);
	}
	
	static public void pr(Object anyObject){
		System.out.print(anyObject);
	}

}
