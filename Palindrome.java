
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int input = 2552;
	        String str_input = String.valueOf(input); 
	        String str = new StringBuilder(str_input).reverse().toString(); 
	        if (str.equals(str_input)) 
	        {
	            System.out.println(input + " is Palindrome");
	        }
	        else
	        {
	            System.out.println(input+ " is not Palindrome");
	        }
	}

}
