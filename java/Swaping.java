class MyFirstJavaClass{
    public static void main(String[] args){
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);

        System.out.println("value before swap:  "+num1+","+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("value after swap:  "+num1+","+num2);
    }
}