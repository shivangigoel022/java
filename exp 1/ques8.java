import java.util.Scanner;
public class ques8{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int arr[]=new int[10];
        System.out.println("enter 10 numbers");
int i,sum=0;
    for( i=0;i<10;i++){
                      arr[i]=input.nextInt();
          } 
            for(i=0;i<10;i++){
            	sum=sum+(arr[i]*arr[i]);

             }
             System.out.println("sum of square of 10 numbers are:"+sum);
            }
         }

