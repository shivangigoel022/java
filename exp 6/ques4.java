class ques4{
  public static void main(String args[]){
    int count = 0;
    String a = new String("asdFg");
    System.out.println("Lenght of "+a+" is "+a.length()+" .");
    System.out.println("Char a present at following locations of "+ a +" :");
    for(int i = 0 ;i<a.length();i++){
      if(a.charAt(i)=='a'){
        System.out.println(i);
        count++;
      }
    }
    System.out.println("Char a occured "+count+" times.");
  }
}
