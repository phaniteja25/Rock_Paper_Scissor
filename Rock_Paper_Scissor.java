import java.util.Random;
import java.util.Scanner;
class Rock_Paper_Scissor{

	public static void main(String[] args){
		
		Random random = new Random();
		
		int a = random.nextInt(3);
		Scanner sc = new Scanner(System.in);
		int i=0;
		while(i<=5)
		{

		System.out.println("Let's Play Rock,Paper,Scissors\n\n\n");
		
		System.out.println("0 is Scissors, 1 is Paper , 2 is Rock\n\n\n");
		System.out.println("Computer's choice is\n" + a);
		
		System.out.println("Enter your choice i.e 0 or 1 or 2\n");
		int b = sc.nextInt();
		
		if(a==0 && b==0)
		{
			System.out.println("It is a Draw!");
		}
		
		else if(a==1 && b==1)
		{
			System.out.println("It is a Draw!");
		}
		
		else if(a==2 && b==2)
		{
			System.out.println("It is a Draw!");
		}
		
		else if(a==0 && b==1)
		{
			System.out.println(" A wins as Scissors wins as it can cut paper:)");
		}
		
		else if(a==0 && b==2)
		{
			System.out.println("B wins as it can thrash Scissors:)");
		}

		else if(a==1 && b==0)
		{
			System.out.println("B  wins as it can cut paper:)");
		}

		else if(a==1 && b==2)
		{
			System.out.println("A wins as it can cover a stone:)");
		}

		else if(a==2 && b==0)
		{
			System.out.println("A wins as it can thrash Scissors:)");
		}
		
		else if(a==2 && b==1)
		{
			System.out.println("B wins as it can cover stone:)");
		}

		else
		{
			System.out.println("Wrong Input");
		
		}
		i++;
		}
		

	}
}

		
		