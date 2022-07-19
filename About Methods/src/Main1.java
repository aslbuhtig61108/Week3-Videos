
public class Main1 {

	public static void main(String[] args) {
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Sam", lastName);
		
		System.out.println(fullName);
		System.out.println(fullName2);
		
		/*
		 * method signature
		 * public static Return data type method name (parameters: data type variable name){
		 * parameters are the values that the method takes and are separated by a comma
		 * the parameters passed into the method do not have to match as long as the data type
		 * is the same
		 * 
		 * To call a method, use the method name and include in the parameters
		 * 
		 */
	
		
		
	}
	
	public static String createFullName(String x, String y) {
		String fullName = x + " " + y;
		return fullName;
		// return x + " " + y; is also acceptable  
	}
	
	
	
}


