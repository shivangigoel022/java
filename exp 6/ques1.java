import java.util.Scanner;
class ques1{
  public static int subStr(String a,String b){
    return a.indexOf(b);
  }
  public static void main(String args[]){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a string : ");
   String a = input.nextLine();
   System.out.print("Enter chars to search in "+a+" : ");
   String b = input.nextLine();
   System.out.println(b+" occurs at "+subStr(a,b)+" in "+a);
  }
}
