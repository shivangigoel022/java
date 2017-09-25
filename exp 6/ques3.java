class ques3
{
    static int i;

    static void changecase(String s)
    {
        for(i=0;i<s.length();i++)
        {
            int ch=s.charAt(i);
            if(ch>64&&ch<91)
            {
                ch=ch+32;
                System.out.print( (char) ch);
            }
            else{
                System.out.print((char)ch);  }
           
        }
    }

    public static void main (String args[])
    {

       
    }
}
