class ques3{
	public static void main(String[] args){
		int a,b,c;
		try{
		a=(Integer.parseInt(args[0]));
		b=(Integer.parseInt(args[1]));
		System.out.println("number 1:"+a);
		System.out.println("number 2:"+b);
		c=a%b;
		System.out.println("value is:"+c);
		throw new Exception() ;
	}
	catch(Exception e){
		System.out.println("int value needed!!");
	}
	}
}