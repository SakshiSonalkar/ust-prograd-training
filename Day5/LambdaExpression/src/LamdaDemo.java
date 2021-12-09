interface Addition{
    int add(int a,int b);
}
interface Subtraction{
    int sub(int a, int b);
}
interface Multiplication{
    int mul(int a,int b);
}


class LambdaDemo{
    public static void main(String[] args) {
        Addition addition=(int a,int b) ->{
            return (a+b);
        };
        Subtraction subtraction=(int a,int b) ->{
            return (a-b);
        };
        Multiplication multiplication=(int a,int b) ->{
            return (a*b);
        };
        System.out.print("Addition :");
        System.out.println(addition.add(20,30));
        System.out.print("Subtraction :");
        System.out.println(subtraction.sub(10,5));
        System.out.print("Multiplication :");
        System.out.println(multiplication.mul(2,4));


    }
}