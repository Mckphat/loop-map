package helloWorld;
import java.util.*;
/**
 * 
 * @author Kannika Phatsavong. PART 1 LOOPS
 *
 */
public class Numbers {

	public static void main(String[] args) {
		//create scanner 
		Scanner keyboard = new Scanner (System.in);
		//create a int ArrayList
		int [] number = new int[5];

		int sum = 0;
		int min;
		int product = 1;
		int max;
		
		//for loop for user input 
		for(int i =0; i<number.length; i++) {
			System.out.println("Enter numbers: ");
			number[i] = keyboard.nextInt();
			sum = sum + number[i];
			product = product * number[i];
			
		}
		System.out.println("The sum is: " + sum);
		System.out.println("The product is: " + product);
		System.out.println("The max is: " + getMax(number));
		System.out.println("The min is: " + getMin(number));
		
	}

	//create functions to get min and max in an array
	public static int getMax(int[] array) {
		int maxValue = array[0];
		for(int i = 1; i<array.length; i++) {
			if(array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}
	
	public static int getMin(int[] array) {
		int minValue = array[0];
		for(int i = 1; i <array.length; i++) {
			if(array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;
	}
	
	
}
