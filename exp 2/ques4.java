 import java.util.Scanner;
 class trunkcall{
	int time;
	Scanner input=new Scanner(System.in);
void charge(){
	System.out.println("your charge is");

}	
}
class ordinary extends trunkcall{
	int duration,cost;
	void charge(){
		System.out.println("duration");
         time=input.nextInt();
		cost=1*time;
		System.out.println("your charge is:"+cost);

	}
}
class urgent extends trunkcall{
	int duration,cost;
	void charge(){
		System.out.println("duration");
         time=input.nextInt();
		cost=2*time;
		System.out.println("your charge is:"+cost);

	}
}
class lightning extends trunkcall{
	int duration,cost;
	void charge(){
		System.out.println("duration");
         time=input.nextInt();
		cost=3*time;
		System.out.println("your charge is:"+cost);

	}
}
class ques4{
	
	public static void main(String args[]){
		int n;
		System.out.println("1.ordinary");
		System.out.println("2.urgent");
		System.out.println("3.lightning");
		Scanner input=new Scanner(System.in);
        n=input.nextInt();
        ordinary obj1=new ordinary();
        urgent obj2=new urgent();
        lightning obj3=new lightning();

        if(n==1){
        	obj1.charge();
        }
        if(n==2){
  	        obj2.charge();
        }
        if(n==3){
  	        obj3.charge();
        }
    }
}