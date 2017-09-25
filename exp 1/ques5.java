public class ques5{
  int a=10;
  static int d=2;
  public static void main(String[] args){
  System.out.println("differnce between instance and static variable");
  ques5 obj=new ques5();
  obj.m1();
  obj.m2();
  }

  void m1()
  {
  System.out.println("instance variable is a" +a);
  ques5 obj2=new ques5();
  System.out.println(obj2.d);

  }
  static void m2(){
  	System.out.println(ques5.d);
  	ques5 obj3=new ques5();
  	System.out.println(obj3.a);
  }
}