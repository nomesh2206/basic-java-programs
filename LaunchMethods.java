class Calculator{
    int num1, num2, result;
    void add(){
        num1 = 10;
        num2 = 20;
        result = num1 + num2;
        System.out.println("adding 10 and 20 you get : " + result);
    }

    void sub(int a, int b){
        num1 = a;
        num2 = b;
        result = num1 - num2;
        System.out.println("Subtracting two number gets you : " + result);
    }

    int multiply(){
        num1 = 10;
        num2 = 6;
        result = num1*num2;
         return result;
    }

    int division(int a, int b){
        num1 = a;
        num2 = b;
        result = num1/num2;
        return result;
    }

    static void disp(){
        System.out.println("Static Method");
    }
}

public class LaunchMethods {
    public static void main(String[] args) {
        Calculator.disp();
        Calculator calc =  new Calculator();
       // calc.disp();
        calc.add();
        calc.sub(30, 10);
        int result1 = calc.multiply();
        System.out.println("multiplication of 2 numbers is : " + result1);
        int x = calc.division(120, 8);
        System.out.println("dividing two numbers you get : " + x);
    }
}
