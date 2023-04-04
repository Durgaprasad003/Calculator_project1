import java.util.Scanner;
public class calculatorproject {
    public static void main(String[] args) {
    
        String operator;
        Double num1,num2,result;
        Scanner input=new Scanner(System.in);
        System.out.println("enter your numbers to perform calculations\t\n");
        System.out.println("Enter your first value:");
        num1=input.nextDouble();
        System.out.println("choose an operator:+,_,*,/,%");
        operator=input.next();//.charAt(0);
        System.out.println("Enter your second values:");
        num2=input.nextDouble();
        switch(operator)
        {
            case "+":
            result=num1+num2;
            System.out.println("The result is"+ " "+result);
            break;
            case "-":
            result=num1-num2;
            System.out.println("The result is"+ " "+result);
            break;
            case "*":
            result=num1*num2;
            System.out.println("The result is"+ " "+result);
            break;
            case "/":
            result=num1/num2;
            System.out.println("The result is"+ " "+result);
            break;
            case "%":
            System.out.println("The result is"+ " "+num1%num2);
            break;
            default:
            System.out.println("You entered an  Invalid operator");
            System.out.println("Please enter a valid operator");
            break;




        }



    }
    
}

