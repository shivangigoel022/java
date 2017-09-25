interface test{
	public void square(int a);
}
class arithmetic implements test{
	int a,x;
	public void square(int a){
    x=a*a;
    System.out.println("square is:"+x);
    return;
	}
}
class totestint{
	public static void main(String[] args){
		arithmetic obj=new arithmetic();
		obj.square(2);
	}
}