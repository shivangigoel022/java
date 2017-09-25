public class ques4{
    public static void main(String[] args){
        int a,b;
        a=(Integer.parseInt(args[0]));
        b=(Integer.parseInt(args[1]));
        System.out.println("enter first number"+a);
        System.out.println("enter second number"+b);
        char c=args[2].charAt(0);
        if(c=='+'){
            System.out.println("sum is:"+(a+b));
        }
        else if(c=='-'){
            System.out.println("difference is:"+(a-b));

        }
        else if(c=='*'){
            System.out.println("multiplication is:"+(a*b));

        }
        else if(c=='/'){
            System.out.println("divison is:"+(a/b));
        }

    }
}