import java.util.Scanner;
public class ques6{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int arr[]=new int[10];
        System.out.println("enter marks of student");
int i;
    for( i=0;i<10;i++){
        arr[i]=input.nextInt();
          }
          for(i=0;i<10;i++){
            if(arr[i]>40 && arr[i]<50){
          	System.out.println(arr[i]+":PASS");
          }
          	else if(arr[i]>51 && arr[i]<75){
          		System.out.println(arr[i]+":MERIT");
          	          	}
          	 else if(arr[i]>75){
          	 	System.out.println(arr[i]+":DISTINCTION");
          	 }
          	 	else{
          	 		System.out.println(arr[i]+":FAIL");
          	 	}
          	 }
          	          	
        }
}