import java.util.Scanner;

public class PreWorkAssignment{
	
	Scanner sc = new Scanner(System.in);
	static int num;
	//To Accept user input
	public void userInput(){
		System.out.println("Please enter a number: ");
		num = sc.nextInt();
	}
	
	//Palindrome Function
	public void checkPalindrome(){
		int temp = num;
		int reversedNum = 0;
		while(num > 0){
			reversedNum = (reversedNum*10)+(num%10);
			num /= 10;
		}
		if(temp == reversedNum)
			System.out.println(temp+" is a Palindrome");
		else
			System.out.println(temp+" is not a palindrome");
		System.out.println();
	}
	
	
	//Print Star Pattern
	public void printStarPattern(){
		if(num <=0 )
			System.out.println("Please enter a valid Input!!!");
		else{
			for(int i = num; i > 0; i--){
				for(int j = i; j > 0; j--){
					System.out.print("*");
				}
				System.out.println();
			}
		}
		System.out.println();
	}
	
	//Print Fibonacci Series
	public void printFibonacciSeries(){
		int[] array = new int[num];
		array[0] = 0;
		array[1] = 1;
		for(int i = 2; i < num; i++){
			array[i] = array[i-1]+array[i-2];
		}
		for(int j = 0; j < num; j++){
			System.out.print(array[j]+" ");
		}
		System.out.println();
	System.out.println();
	}
	
	
	//Prime Number Function
	public void checkPrime(){
		int flag = 0;
		if(num == 1)
			System.out.println(num+" is neither prime nor composite");
		else{
			for(int i = 2; i < num; i++){
				if(num % i == 0){
				flag = 1;
				break;
				}
			}
			if(flag == 1)
			System.out.println(num+" is not a Prime number");
		else
			System.out.println(num+" is a Prime number");
		}
		System.out.println();
	}
		
	
	public static void main(String[] args){
		
		PreWorkAssignment obj = new PreWorkAssignment();
		
		Scanner sc = new Scanner(System.in);
		
		int choice;
		
		do{
			System.out.println("Enter your choice from below list.\n" + 
			"1. Find palindrome of number.\n"+ 
			"2. Print Pattern for a given no.\n" + 
			"3. Check whether the no is a  prime number.\n"+ 
			"4. Print Fibonacci series.\n" +
			"--> Enter 0 to Exit.");
			
			choice = sc.nextInt();
			
			switch(choice){
				case 0: choice=0;
				break;
				case 1:{
					obj.userInput();
					obj.checkPalindrome();
				}
				break;
				case 2:{
					obj.userInput();
					obj.printStarPattern();
				}
				break;
				case 3:{
					obj.userInput();
					obj.checkPrime();
				}
				break;
				case 4:{
					obj.userInput();
					obj.printFibonacciSeries();
				}
				break;
				default: System.out.println("Invalid choice. Enter a valid no.\n");
			}
		}while(choice != 0);
		
		System.out.println("Exited Successfully!!!");
		
		sc.close();
		
	}

}