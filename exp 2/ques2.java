import java.util.Scanner;
class player{
	 String name,country;
	 int age;
	Scanner input=new Scanner(System.in);
public static void main(String args[]){
	  
	
	cricket obj =new cricket();
	hockey ob1=new hockey();
	
}
}
	
class cricket extends player{
	
	int runs;
     cricket(){
     	System.out.println("name is:");
	name=input.nextLine();
	System.out.println("country is");
	country=input.nextLine();
	System.out.println("age is");
	age=input.nextInt();
    	
	System.out.println("no. of runs");
	runs=input.nextInt();
}


}
class hockey extends player{
	
	int goals;
     hockey(){
     	System.out.println("name is:");
	name=input.nextLine();
	System.out.println("country is");
	country=input.nextLine();
	System.out.println("age is");
	age=input.nextInt();
    	
	System.out.println("no. of goals");
	goals=input.nextInt();
}
}