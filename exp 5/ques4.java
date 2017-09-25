import java.util.Scanner;
class ques4{
	public static void main(String[] args){
		
		int a,b;
		  System.out.println("for going forward enter 0");
          System.out.println("for going backward enter 1");

		Scanner input=new Scanner(System.in);
		System.out.println("first driver enter your direction");
		a=input.nextInt();
				System.out.println("second driver enter your direction");
		b=input.nextInt();

		if(a==b){
			System.out.println("no collision");
		}
		
		try{
			if(a!=b){
					throw new Exception();
			}
           }
           catch(Exception e){
           	System.out.println("here we can say collision may occur");
           }

	}
}