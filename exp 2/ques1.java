 public class ques1{
 	int a;
 	private int b;
 	void set_b(int a){
 		this.b = b;
 	}

}
class A extends ques1{
	A(int x,int y){
		set_b(x);
		a=y;
		
		System.out.println("value");
	}
}
class B{
	public static void main(String[] args){
		A obj=new A(1,2);

	}
}