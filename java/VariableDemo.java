class VariableDemo{
    int num1AtClassLevel;
    float floatNumAtClassLevel;
    char charVariableAtClassLevel;
    int num1AtClassLevel;
    public static void main(String[] args){
        int num1=10,sum;
        System.out.println("value of num1:"+num1);
        VariableDemo objVariableDemo1=new VariableDemo();

        System.out.println("value of num1AtClassLevel:"+objVariableDemo1.num1AtClassLevel);
        int sum=num1+objVariableDemo1.num1AtClassLevel;
        System.out.println("sum is:"+sum);
        float floatNum=10.5f;
        System.out.println("value of floatNum:"+floatNum);
        double doubleNum=20.5;
        System.out.println("value of doubleNum:"+doubleNum);
        sum=floatNum+doubleNum;
        System.out.println("sum is:"+sum);
    }
}