package calculator;
import java.util.Scanner;

public class calculator {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please, Enter your name: ");
		String username = input.nextLine();
		System.out.println("Hellow "+ username +" Welcome!! \nYou are using our Calculator"
				+ "\nWhat kind of calculator you want? \nPlease, Select a nemaric value that"
				+ "you want \n1.General Calculator \n2.Geomatric Calculator \n3.Trigonometry"
				+ "\n4.Tempareture");
		
		int option = input.nextInt();
        
        if (option == 1) {
            performNormalCalculator();
        }
        else if (option ==2) {
        	ParformGeomatricCalculator();
        }
        else if (option == 3) {
        	performTrigonomitryCalculator();
        }
        else if (option == 4) {
        	performTemparetureCalculator();
        }
        else {
            System.out.println("Invalid key, \nPlease select one (1 or 4).");
        }
    }

    private static void performNormalCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select the operator in neumaric number that you want \n1. for addition "
                + "\n2. for subtraction \n3. for multiplication\n4. for division"
                + "\n5. for modulo");
        int operation = input.nextInt();
        System.out.println("Enter the first number: ");
        float num1 = input.nextFloat();
        System.out.println("Enter the second number: ");
        float num2 = input.nextFloat();

        switch (operation) {
            case 1:
                System.out.println("The addition value is: " + (num1 + num2));
                break;
            case 2:
                System.out.println("The subtraction value is: " + (num1 - num2));
                break;
            case 3:
                System.out.println("The multiplication value is: " + (num1 * num2));
                break;
            case 4:
                System.out.println("The division value is: " + (num1 / num2));            
                
                break;
            case 5:
                System.out.println("The modulo value is: " + (num1 % num2));
                break;
            default:
                System.out.println("Invalid operator \nPlease select one (1 to 5).");
           }
        }
       private static void ParformGeomatricCalculator() {
    	   System.out.println("What do you want? \nPlease select one by using numeric value"
       	   		+ "\n1.Area of triangel \n2.Area of Rectangle\n3.Area of square\n4.Area of "
       	   		+ "circle"); 
    	   Scanner input = new Scanner(System.in);
    	   int area = input.nextInt();
    	   switch (area) {
    	   case 1:
    		   triangle();
    		   break;
    	   case 2:
    		   rectangle();
    		   break;
    	   case 3:
    		   square();
    		   break;
    	   case 4:
    		   circle();
    		   break;
    	   default:
    		   System.out.println("You select wrong keyward.\nPlease run it again");
    	   }
       }
       public static void triangle() {
    	   Scanner input = new Scanner(System.in);
    	   System.out.println("Enter the height: ");
    	   int h = input.nextInt();
    	   System.out.println("Enter the base: ");
    	   int w = input.nextInt();
    	   float area =(float) (0.5*(h*w));
    	   System.out.println("The area of triangel is :"+area);
       }
       public static void rectangle() {
    	   Scanner input = new Scanner(System.in);
    	   System.out.println("Enter the height: ");
    	   int h = input.nextInt();
    	   System.out.println("Enter the weight: ");
    	   int w = input.nextInt();
    	   float area = h*w;
    	   System.out.println("The area of rectangle is :"+area);
       }
       public static void square() {
    	   Scanner input = new Scanner(System.in);
    	   System.out.println("Enter a arm of the square: ");
    	   int h = input.nextInt();
    	   float area = h*h;
    	   System.out.println("The area of square is :"+area);
    	   }
       public static void circle() {
    	   Scanner input = new Scanner(System.in);
    	   System.out.println("Enter the value of radius of circle: ");
    	   int r = input.nextInt();
    	   float area = (float) 3.1416 *(r*r);
    	   System.out.println("The area of circle is :"+area);
       }
       public static void performTrigonomitryCalculator() {
    	   System.out.println("Waht do you want? \nPlease select a numeric value "
    	   		+ "\n1.sin \n2.cos \n3.tan");
    	   Scanner input = new Scanner(System.in);
    	   int value = input.nextInt();
    	   switch (value) {
    	   case 1:
    		   sin();
    		   break;
    	   case 2:
    		   cos();
    		   break;
    	   case 3:
    		   tan();
    		   break;
    	   default:
    		   System.out.println("You select wrong keyward.\nPlease run it again");
    	   
    	   }
       }
       public static void sin() {
    	   Scanner input = new Scanner(System.in);
    	   System.out.println("Enter the value of angle");
    	   int value = input.nextInt();
    	   float result = (float) Math.sin(Math.toRadians(value));
    	   System.out.println("The value of sin: "+result);
       }
       public static void cos() {
    	   Scanner input = new Scanner(System.in);
    	   System.out.println("Enter the value of angle");
    	   int value = input.nextInt();
    	   float result = (float) Math.cos(Math.toRadians(value));
    	   System.out.println("The value of cos: "+result);
    	}
       public static void tan() {
    	   Scanner input = new Scanner(System.in);
    	   System.out.println("Enter the value of angle");
    	   int value = input.nextInt();
    	   float result = (float) Math.tan(Math.toRadians(value));
    	   System.out.println("The value of tan: "+result);
       }
       public static void performTemparetureCalculator() {
    	   System.out.println("Please select one by using numaric value \n1.Celsius to Fahrenheit"
    	   		+ "\n2.Fahrenheit to Celsius");
    	   Scanner input = new Scanner(System.in);
    	   int option = input.nextInt();
    	   if (option ==1) {
    		   System.out.println("Enter the value of Celsius: ");
    		   int tem = input.nextInt();
    		   float result = tem * (9/5)+32;
    		   System.out.println("The value to Fahrengeit is: "+result);
    		}
    	   else if (option ==2) {
    		   System.out.println("Enter the value of Fahrengeit");
    		   int tem = input.nextInt();
    		   float result = (tem - 32)*5/9;
    		   System.out.println("The value to Celsius is: "+result);
    		   }
    		else {
    			System.out.println("You select wrong keyward.\nPlease run it again");
    		   }	 
       }
}
		

		
		
