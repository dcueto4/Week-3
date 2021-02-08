import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// 1. Create an array of int called ages that contains the following values: 3,
		// 9, 23, 64, 2, 8, 28, 93.
		int[] ages = new int[8];
		ages[0] = 10;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;

		// a. Programmatically subtract the value of the first element in the array from
		// the value in the last element of the array (i.e. do not use ages[7]
		// in your code). Print the result to the console.
		System.out.println(ages[0] - ages.length - 1);

		// b. Add a new age to your array and repeat the step above to ensure it is
		// dynamic (works for arrays of different lengths).
		// Added 10 to ages[0]

		// c. Use a loop to iterate through the array and calculate the average age.
		// Print the result to the console.
		int sum = 0;
		for (int number : ages) {
			sum += number;
		}

		int average = sum / ages.length;
		System.out.println(average);

		// 2. Create an array of String called names that contains the following values:
		// “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };

		// a. Use a loop to iterate through the array and calculate the average number
		// of letters per name. Print the result to the console.
		int numberOfLetters = 0;
		for (String name : names) {
			numberOfLetters += name.length();
		}
		int averageLetters = numberOfLetters / names.length;
		System.out.println(averageLetters);

		// b. Use a loop to iterate through the array again and concatenate all the
		// names together, separated by spaces,
		// and print the result to the console.
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
		System.out.println();

		// 5. Create a new array of int called nameLengths. Write a loop to iterate over
		// the previously created names array and add the length of
		// each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		int i = 0;
		for (String name : names) { // for (int i = 0; i < names.length; i ++)
			nameLengths[i] = name.length();
			// nameLength[0] = 3;
			// nameLength[1] = 5;
			i++;
		}

		for (int item : nameLengths) {
			System.out.println(item);
		}

		// 6. Write a loop to iterate over the nameLengths array and calculate the sum
		// of all the elements in the array.
		// Print the result to the console.
		sum = 0;
		for (int x = 0; x < nameLengths.length; x++) {
			sum += nameLengths[x];
		}
		System.out.println(sum);
		
		//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
		//   (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
		System.out.println(copyWord("Hello", 3));
		
		
		//8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
		//   (the full name should be the first and the last name as a String separated by a space).
		
		System.out.println(getFullName("John", "Smith"));
		
		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println(SumGreaterThan100(ages));
		
		//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		double[] doubleArray = new double[4];
		doubleArray[0] = 2.1;
		doubleArray[1] = 3.5;
		doubleArray[2] = 6.7;
		doubleArray[3] = 9.4;
	     
        System.out.println(averageOfDoubleArray(doubleArray));
		
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is 
		//    greater than the average of the elements in the second array.
        double[] secondDoubleArray = new double[4];
        secondDoubleArray[0] = 6.3;
        secondDoubleArray[1] = 9.6;
        secondDoubleArray[2] = 2.6;
        secondDoubleArray[3] = 7.4;
        System.out.println(firstArrayAverageGreater(doubleArray, secondDoubleArray));
		
		//12. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
        // Given a name it prints out Hello my name is and the name you give it.
           name("John");
           name("David");
                  
 
            
		
	

	}
		private static String copyWord(String word, int n) {
			String copyWord = "";
			for (int i = 0; i < n; i++) {
				copyWord += word;
			}
			  return copyWord;
			}
   
    
		private static String getFullName(String firstName, String lastName) {
			return firstName + " " + lastName;
			
	}
    	
    
		private static Boolean SumGreaterThan100(int[] array) {
	        return Arrays.stream(array).sum() > 100;
	        
		}
		
		public static double averageOfDoubleArray(double[] doubleArray) {
			double sum = 0;
			for (double number : doubleArray) {
				sum =+ number;
			}
			return sum / doubleArray.length;
		}
		
		private static boolean firstArrayAverageGreater(double[] firstArray, double[] secondArray) {
	        return averageOfDoubleArray(firstArray) > averageOfDoubleArray(secondArray);
	        
		}
		
		public static void name(String name) {
			System.out.println("Hello my name is," + name);
				
		}
		
			
				
		
		}
    
