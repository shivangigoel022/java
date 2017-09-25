import java.util.Scanner;
public class ques7{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter value of a");
		a=input.nextInt();
		System.out.println("enter value of b");
		b=input.nextInt();
		System.out.println("enter value of c");
		c=input.nextInt();
		System.out.println(""+a+""+b+""+c);
		System.out.println(""+a+""+c+""+b);
		System.out.println(""+b+""+a+""+c);
		System.out.println(""+b+""+c+""+a);
		System.out.println(""+c+""+a+""+b);
		System.out.println(""+c+""+b+""+a);
	}
}

