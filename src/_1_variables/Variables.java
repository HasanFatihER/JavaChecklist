// This examples are for Java Students

package _1_variables;

public class Variables {
		// Variable in Java is a data container that
		// saves the data values during Java program execution.
    public static void main(String[] args) {

        // 1- Create 3 different data type

        String word = "Hello"; // You must use ; sign at the end of the line

        System.out.println(word); // This code use for writing variable's value

        System.out.println("Hasan"); // Writing-> Hasan


        int number = 1000;

        System.out.println(number); // 1000
        // Not important this voids in the 	parenthesis. This code interest only variable
		// If you want to explanation before variable you can write this.
        // "explanation" + variableName
		// "" The program write what you writedown In the Quotation marks.
		// We can use Quotation marks for String


        System.out.println("The number: " + number);

        boolean isHeHoliday = true;

        System.out.println(isHeHoliday);

        // Write a code Did he go on vacation ? = true


        System.out.println("Did he go on vacation ? = " + isHeHoliday);
		
		/*
		 2- Create two variables for name and surname and write like below

				Your Name : Hasan
				Your Surname : ER

		 */

        String name = "Hasan";
        String surname = "ER";

        System.out.println("Your Name : " + name);
        System.out.println("Your Surname : " + surname);


        // 3- Create two different type variable and write them's sum

        int number1 = 10;
        byte number2 = 5;


        System.out.println(number1 + number2);


        // If you want to write an explanation before sum
        // When we write String and integer or another numerical data type
        // we use parenthesis for mathematical operation

        System.out.println("Two numbers' total = " + (number1 + number2));




        // 4- Create an integer and double variable and sum


        int number3 = 19;
        double number4 = 5.14;

        System.out.println(number3 + number4);

        // sum : 24.14

        System.out.println("Two numbers' total " + (number3 + number4));


        // 5 - Create char data types variable and write

        char character = '?';

        System.out.println(character);
        System.out.println("Noted Character : " + character);


        // 6- Create a integer and char variable and sum


        int number5 = 40;
        char character2 = 'M';

        System.out.println(character2 + number3); //96
        // When we use char data type for mathematical operation Java accept ASCII for char variables
        // Check  ASCII table.


    }

}
