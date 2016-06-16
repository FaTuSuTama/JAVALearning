import java.util.Scanner;

public class ThridClass {
	
	static Scanner myScanner=new Scanner(System.in);

	public static void main(String[] args) {
		String myName;
		pr("Plz put your name: ");
		myName=myScanner.nextLine();
		//System.out.println(myName);
		prln("the number of characters is your name is:"+myName.length());
		prln("\n\n"+myName);
		
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
		
		twoDArray[1][2]+=(twoDArray[0][2]+twoDArray[0][3]);
		prln(twoDArray[1][2]);
		
		int a=3;
		int b=9;
		
		a+=(++b);
		prln("A:" +a+" "+"B:"+b);
		
//		if(myName.length()>15){
//			prln("your name is too long");
//		}else if (myName.length()<3) {
//			prln("your name is too short");
//		}else {
//			switch(myName.length()){
//			
//			case 7:
//				prln("you have a lucky name :)");
//				break;
//			case 4:
//				prln("you have a 4 name :)");
//				break;
//			case 14:
//				prln("you have a 14 name :)");
//				break;
//			default:
//				prln("your namr is ok");
//				break;
//			}
////			if (myName.length()==7) {
////				prln("you have a lucky name :)");
////			}else{
////			prln("your namr is ok");
////			}
//		}
	}
	
	static public void prln(Object anyObject){
		System.out.println(anyObject);
	}
	
	static public void pr(Object anyObject){
		System.out.print(anyObject);
	}

}
