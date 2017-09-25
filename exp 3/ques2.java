interface a{
	public void meth1();
	public void meth2();
}
class myclass implements a{
	public void meth1(){
		System.out.println("welcom");
	}
	public void meth2(){
		System.out.println("to upes");
	}
	public static void main(String[] args){
		myclass obj=new myclass();
		obj.meth1();
		obj.meth2();
	}
}