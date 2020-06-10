import java.util.Scanner;
public class IfElse{
	public static void main(String args[]){

	// store data in appropriate arrays
	String [] sports = {"Baseball","Basketball","Football", "Hockey", "Volletyball" , "Waterpolo"};
	int [] players = {9,5,11,6,6,7};


	Scanner input = new Scanner(System.in);

	for( int i=0; i< sports.length ;i++ )
	{
		System.out.println(sports[i] + "\t" + players[i]);
	}

	System.out.println("Provide the number of friends in your sport");
	int userInput = input.nextInt();

	if(userInput > 5)
	{
		System.out.println("Here is/are the suggested team sports");
		for(int i=0; i< players.length;i++ )
		{
			if( userInput >= players[i])
			System.out.println(sports[i] + " needs " + players[i] );
		}

   }

   else{
	   System.out.println("Your group is less than 5 people. There is no suggested team sport");
   		}
   }
}





