public class ques10{
	public static void main(String args[]){
		int i,count=0;
		System.out.println("no. divisible by 5 are:");
		for(i=40;i<=250;i++){
			if(i%5==0){
				System.out.println(""+i);
				count++;
			}
		}
		System.out.println("no. of numbers divisible by 5 are"+count);
	}
}