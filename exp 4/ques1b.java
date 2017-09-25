package pack2;
import pack1.ques1a;
class abc{
	int x;
	public void method(int a){
		x=a*a;
		System.out.println("value of a:"+x);
	}
		public static void main(String[] args){
         abc obj=new abc();
         obj.method(5);
		
	}
}