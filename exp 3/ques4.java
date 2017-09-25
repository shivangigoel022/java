interface a{
	public void module(double a,double b);
	public void division(double a,double b);

}
class abc implements a{
	public void module(double a,double b){}
	public void division(double a,double b){}
}
class b extends abc{
	double x,y;
	public void module(double a,double b){
		x=a%b;
		System.out.println("value of module of a and b:"+x);
	}
	public void division(double a,double b){
		y=a/b;
		System.out.println("value of division of a and b:"+y);
	}
	public static void main(String[] args){
		b obj=new b();
		obj.module(3,6);
		obj.division(5,6);
	}
	}
