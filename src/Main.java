
public class Main {

	public static void main(String[] args) {
	//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = new int[8];
		ages[0] = 10;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		

	//a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] 
	//in your code). Print the result to the console.	
		System.out.println(ages[0] - ages.length - 1);
	
	//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).	
	// Added 10 to ages[0]	
	
	//c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int average = sum / array.length;
		System.out.println(average);
		
		
		
}
	
	public static int calculateAverage(ages[] array) {
		int sum = 0;
		for (int number : array) {
			sum =+ number;
		}
		return sum / array.length;
	}	
		
		
	}

}
