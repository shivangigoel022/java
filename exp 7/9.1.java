class P{
public static void main(String[] args){
Integer i=new Integer(10);
System.out.println("int to Int:"+i);
 
 String str= i.toString();
System.out.println("Integer to String:"+str);

String s=new String("10");
int in=Integer.parseInt(s);
System.out.println("String to int:"+in);

String st=Integer.toString(in);
System.out.println("int to String:"+st);

Integer iob=new Integer("10");
System.out.print("String to Integer:"+iob);

Integer iobj=new Integer("10");
int it=iobj.intValue();
System.out.print("Integer to int:"+it);
}
}