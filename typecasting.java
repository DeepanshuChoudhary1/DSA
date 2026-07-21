class Typecasting{
    public static void main(String args[]){

// automatic typecasting=> byte->short->char->int->long->float-> double  short tick=> bsc i lfd
        
        // chat to integer
        char ch = 'B';
        int i =ch;
        System.out.println("type casting example "+i);

        // int to char
        int number=70;
        char c= (char)number;
        System.out.println("the char of "+ number + " is = "+c);

         float f=(float)number;
          System.out.println("the float of "+ number + " is =  "+f);

    }
}