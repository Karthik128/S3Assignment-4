import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     MathMethods Math=new MathMethods();
     
     System.out.println("Maths Calculator App");
     System.out.println("********************");
     
     Scanner userInput=new Scanner(System.in);
     
     System.out.println("Enter First Nuumber");
     
     Integer num1=userInput.nextInt();
     
     System.out.println("Enter Second Number");
     
     Integer num2=userInput.nextInt();
     
     System.out.println("Please select the operation +,-,*,/");
     
     String operation = userInput.next();
     
     if (operation.equals("+")){
    	  
    	 System.out.println("Adding "+num1+" & "+num2+" gives");
    	 System.out.println(Math.Add(num1, num2));
     }
     
     else if (operation.equals("-")){
    	 
    	 System.out.println("Subsctraction of "+num1+" & "+num2+" gives");
    	 System.out.println(Math.Substract(num1, num2));
     }
     
     else if (operation.equals("*")){
    	 
    	 System.out.println("Multiplication of "+num1+" & "+num2+" gives");
    	 System.out.println(Math.Multply(num1, num2));
     }
     
     else if (operation.equals("/")){
    	 
    	 System.out.println("Division of "+num1+" & "+num2+" gives");
    	 System.out.println(Math.Division(num1, num2));
     }
     else
    	 
    	 System.out.println("This Operation is not valid");
     
     
     
	}

}
