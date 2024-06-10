package LambdaExpressionExample;

@FunctionalInterface
interface  Calculator{
     int calculator(int a, int b,String operator);
}

public class CalculatorExample {

    public static void main(String[] args) {
        Calculator calculator =(a, b,operator) ->{
            int result =0;
            switch (operator){

                    case "+":
                        result= a+b;
                    break;

                    case "-":
                        result= a-b;
                    break;
                    case "*":
                        result= a*b;
                    break;
                    case "/":
                        result= a/b;
                    break;
                }
              return result;
        };

        System.out.println("Your Result >>> " +calculator.calculator(10,20,"+"));
    }
}
