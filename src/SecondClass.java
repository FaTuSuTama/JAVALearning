import java.util.Scanner;

public class SecondClass {
		static Scanner myScanner= new Scanner(System.in)
;	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short firstShortNumber;
		int secondIntNumber;
		float myFloatNumber;
		double myDoubleNumber;
		int[] cards={1,2,3,4,8822};
		
		firstShortNumber=20;
		secondIntNumber=10;
		myFloatNumber=10;
		myDoubleNumber=10;
		char myCharacter='a';
		boolean myStatement=procedure(firstShortNumber,secondIntNumber);
		
		secondIntNumber-=4;
		
		int result=firstShortNumber%secondIntNumber; 
		
		System.out.println(firstShortNumber);
		System.out.println(secondIntNumber);
		System.out.println(result);
		System.out.println(myCharacter);
		System.out.println(myStatement);
		System.out.println(cards[4]);

	}
	static public boolean procedure(int firstValue,int secondValue) {
		boolean answer=firstValue>secondValue;
		return answer;
	}

}
