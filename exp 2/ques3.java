import java.util.Scanner;
class worker{
	String name;
	int sal_rate,salary=0;
	Scanner input=new Scanner(System.in);
	
	
	    void m1(){
		System.out.println("name is:");
	name=input.nextLine();
		System.out.println("name is:"+name);
	}
	void ComPay(){

		System.out.println("increased");
	}
}
class daily extends worker{
	int days;
  
	void ComPay(){
		System.out.println("for daily worker");
		System.out.println("sal_rate is:");
	sal_rate=input.nextInt();	
		System.out.println("no. of days of work:");
		days=input.nextInt();
		salary=sal_rate*days;
		System.out.println("pay of worker is:"+salary);
	}
	
}
class salaried extends worker{
	void ComPay(){
		System.out.println("for salaries worker");
			
		
		System.out.println("sal_rate is:");
	sal_rate=input.nextInt();	
	salary=2000*sal_rate;
	System.out.println("pay of worker is:"+salary);
    }
}
class ques3{
	public static void main(String args[]){
		worker ob=new worker();
		ob.m1();
		daily ob1=new daily();
		ob1.ComPay();
		salaried ob2=new salaried();
		ob2.ComPay();
	}
}