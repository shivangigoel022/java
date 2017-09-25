import java.util.Scanner;
public class ques3{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int a,first,second,next,i;
		System.out.println("enter no. of fibnoci numbers");
		a=input.nextInt();
		first=0;
		second=1;
		for(i=0;i<a;i++){
			if(i<=1)
				next=i;
			else{
				next=first+second;
				first=second;
				second=next;
			}
			System.out.println(next);




	}
		}
}