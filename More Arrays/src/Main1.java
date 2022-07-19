
public class Main1 {

	public static void main(String[] args) {
		String[] products = new String[5];
		
		products[0] = "Carrots";
		products[1] = "Pineapples";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		for (String product : products) {
			System.out.println("Products :" + product);
		}
		
		
		int[] multiplesOf3 = new int[10];
		
		for (int i = 1; i <= multiplesOf3.length; i++) {
			multiplesOf3[i-1] = i * 3;
			System.out.println("number : " + multiplesOf3[i-1]);
			
		/*
		 * alternative solution for the above	
		 */
			
		int[] multiplesOf5 = new int[10];
			
		for (int k = 0; k < multiplesOf5.length; k++) {
			multiplesOf5[k] = (k + 1) * 5;
			System.out.println("number : " + multiplesOf5[k]);
		}
				
		
		}
	}

}
