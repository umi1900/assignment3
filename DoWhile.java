import java.util.Random;
import java.util.Scanner;
public class DoWhile {
	public static void main(String args[]){

		Scanner keyboard = new Scanner(System.in);
		Random rd = new Random();
		int size;

		// asking the user to input size of the array and will continue to ask until size is >=10
		do{
			System.out.println("Enter the size for the array(must be at least 10): ");
			size = keyboard.nextInt();
		}while(size<10);

		//creates a new array using the user input and assigns random values from range [10,50]
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++){
			arr[i] = rd.nextInt((50-10)+1)+10;
		}
		printArray(arr);

		// constructs an object of the array class
		Array arrObj = new Array();
		arrObj.setArray(arr,size);
		int searchValue;
		do{
			System.out.println("\nEnter the value you want to search(must be [10,50]):");
			searchValue = keyboard.nextInt();
	    }while(searchValue<10 && searchValue <50);

	    //Pass the search value we get from the user to Array class
	    arrObj.setSearchValue(searchValue);

	    //Get how many times searched value occurs and print to screen
	    int occurence = arrObj.getOccurence();
	    System.out.printf("%d occurs %d time." , searchValue, occurence);
	}

	// Method to print arrays
	public static void printArray(int[] array){
		for(int i = 0; i< array.length; i++){
			System.out.print(array[i] + "");
		}
	}
}
class Array{
	private int[] arr;
	private int searchValue;

	public void setArray(int[] array, int arrSize){
	// Initialize the size of the array that is declared in the class above
	arr = new int[arrSize];

	for(int i=0 ; i<arr.length; i++){
		this.arr[i] = array[i];
	}
   }
   public void setSearchValue(int value){
   	searchValue = value;
   }
   public int getOccurence(){
   	int occurence = 0;

   	for(int i=0; i<arr.length; i++){
   		if(arr[i] == searchValue){
   			occurence += 1;
   		}
   	}
   	return occurence;
   }
}

