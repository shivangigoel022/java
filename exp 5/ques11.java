import java.util.Scanner;
class ques11{
	public static void main(String[] args){
		
		int a, b;
		int[][] arr=new int[2][3];
		Scanner input=new Scanner(System.in);
		try{
		arr[4][4]=500;
           }
           catch(ArrayIndexOutOfBoundsException e){
           	System.out.println("here we caught the exception");
           }

	}
}