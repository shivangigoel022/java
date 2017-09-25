class employee{
	String name;
	int empid,salary;
	double insalary,rate;
	employee(String x,int y,int z){
		name=x;
		empid=y;
		salary=z;
	}
	void m1(){
		System.out.println("name is:"+name);
		System.out.println("salary is:"+salary);
	}
	void increase( double rate){
		insalary=salary*rate;
		System.out.println("increased salary is:"+insalary);
	}
	public static void main(String args[]){
		employee ob1=new employee("ram",466,34000);
		ob1.m1();
		ob1.increase(1.5);
		manager ob3=new manager(5);
	}

	
}
class manager extends employee{
	int department;
	manager(int a){
		super("ram",466,34000);
		department=a;
		System.out.println("department is"+department);
	}
}