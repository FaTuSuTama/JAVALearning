import java.util.Scanner;

public class SecondClassExample {
	static Scanner myScanner=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userShortNum=11;
		
		System.out.print("Please put a integer number: ");
		userShortNum=myScanner.nextInt();
		
		 int newResult=process(userShortNum);
		 
		 System.out.println(newResult);

	}
	
	static public int process(int firstValue){
		firstValue*=100;
		return firstValue;
	}

}
