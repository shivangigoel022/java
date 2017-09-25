import java.util.Scanner;
public class ques1{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int a,b,c;
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		if(a>b && a>c){
			System.out.println(" greatest no. is a:"+a);
		}
		if(b>a && b>c){
			System.out.println(" greatest no is b:"+b);
		}
		if(c>a && c>b){
			System.out.println(" greatestno is c:"+c);
		}
             


	}

}