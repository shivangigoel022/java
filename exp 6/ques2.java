 class ques2{
 	public static void main(String args[]){
 		StringBuffer s=new StringBuffer();
 		for( String e : args){
 			s.append(e+" ");
 		}
 		for(int i=0;i<s.length();i++){
 			int ch= s.charAt(i);
 			if(ch>96&&ch<123){
               ch=ch-32;
               System.out.print((char) ch);
 			}else{
 				System.out.print(s.charAt(i));
 			}
 			if(ch==32)
 				System.out.print(" ");
 			}
 			System.out.println();
 	}
}