class S{
public static void main(String[] args){
float f=10.56f;
Float fobj=new Float(f);
System.out.println("float to Float:"+f);

String s=fobj.toString();
System.out.println("Float to String:"+s);

float num=Float.parseFloat(s);
System.out.println("String to float:"+num);

String str=String.valueOf(num);
System.out.println("float to String:"+str);

Float fo=Float.valueOf(str);
System.out.println("String to Float:"+fo);

}
}