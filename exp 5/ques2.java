class ques2{
	public static void main(String[] args){
		try{
			int a;
			a=45/0;
		}
		catch(ArithmeticException e){
			System.out.println("divion by 0!!");
		}
	}
}