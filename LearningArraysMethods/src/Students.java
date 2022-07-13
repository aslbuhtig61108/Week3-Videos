
public class Students {

	public static void main(String[] args) {
		// In Weeek 1, I learned how to create variables that can hold one type of data at a time
		// But you may be asked to create a program where you need to save students names or grades
		// or personal information
		// You may be asked to hold more data. Metadata of data 
		// (e.g., personal information of a person
		
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";
		
		// If I have more students to add resulting in a long list of variables (student names)
		// and if I need to print the above list out. It wouldn't be an issue at this time
		// the list is short, right?
		
		System.out.println(studentName1);
		System.out.println(studentName2);
		System.out.println(studentName3);
		
		// in time, I or a teacher or a user needs to add more students
		// 2-3 additional names won't be an issue, but what about 100 student names or 1,000??
		// What then? What if you need to associate unique data with each student name?
		
		// It gets out of hand. We have a tool/construct that helps group similar data
		// Example: If you have a grocery list, you wouldn't list each item on a separate
		// sheet of paper. Rather you would list all items on the list on ONE sheet of paper
		// When you refer to the one paper you see each item on each line
		// The tool to use is an ARRAY
		
		String[] students = new String[3];
		
		// the above is the SYNTAX for an Array
		// where: [] = denotes that the data type is an array
		// we have to use 'new' key word
		// ARRAY is an object THAN a priminitive data type
		// [n] = the number of ELEMENTS in an Array
		
		// To access an element in an array
		// An array is zero based. This means the first index is 0 and the last element
		// in the array is "n-1"
		// Example: an array of 3 elements would inlclude element at location 0 and the last
		// element in the area is located at 2 = [3-1]
		
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
		// To print out an array or the elements of an array
		System.out.println(students[0]);
		System.out.println(students[1]);
		System.out.println(students[2]);
		
		
		// Printing to console an array has the same results as using a direct sysout command
		// Comparing the previous example and the above. Array is one code more
		// The smaller arrays are the less code lines saving you'll have
		// but larger arrays (e.g, 100 elements), you would have to explicitly access each element
		// which would not be efficient
		// Using a FOR LOOP helps alleviate this
		
		
		for (int i = 03; i < students.length; i++) {
		System.out.println(students[i]);
		}
		
		// Another construct we can use if we want to print out every element in an array
		// An ENHANCED FOR LOOP the syntax is easier 
		// Performs an iteration for each element inside our array
		// : refers to 'in'. so "for each 'student' in the students array
		
		System.out.println("Enhanced for Loop Example");
		
		for (String student : students) {
			System.out.println(student);
		}
		
	}

}
