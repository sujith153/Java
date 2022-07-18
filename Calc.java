package Calculator;
import java.util.Scanner;
public class Calc {
	public int add(int a ,int b)
	  {
	   return a + b;
	  }
	  
	  public int sub(int a,int b)
	  {
	   return a - b;
	  }
	 
	  public int mul(int a, int b)
	  {
	   return a * b;
	  }
	  
	  public float div(float a,float b)
	  {
	   return a / b;
	  }
public static void main(String[] args) {
		 Calc c = new Calc();
		  int a,b,choice;
		  @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Value of A : ");
		  a=sc.nextInt();
		  System.out.println("Enter Value of B : ");
		  b=sc.nextInt();
		  
		  
		  char ch ;
		  do {
		   System.out.println("*Arithmetic Calculator* \n 1.Addition\n 2.Substraction\n 3.Multiplication\n 4.Division\n 5.Exit");
		   System.out.println("Select the option which you need");
		   choice=sc.nextInt();
		   
		  switch(choice)
		  {
		  case 1: {
		   System.out.println("Addition of A and B : "+c.add(a,b));
		   break;
		    }
		  case 2 :{
		   System.out.println("Subtraction of A and B : "+c.sub(a,b));
		   break;
		   }
		  case 3 :{
		   System.out.println("Multiplication of A and B : "+c.mul(a,b));
		   break;
		   }
		  case 4 :{
		   System.out.println("Division of A and B : "+c.div(a,b));
		   break;
		   }
		  default :
		  {
		   System.out.println("You have chosen wrong option. \n please select any one of the given options ");
		   break;
		  }
		  }
		   System.out.println("\nIf you want to continue press Y. If not press n \n");
		         ch = sc.next().charAt(0);
		  }while (ch == 'Y'|| ch == 'y'); 
	}

}
