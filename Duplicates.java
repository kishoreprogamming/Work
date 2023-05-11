
public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
		        String s = "abcdabdzez";
		        String temp = "" + s.charAt(0);
		 
		        for (int i = 1; i < s.length(); i++) {
		            if (!temp.contains(String.valueOf(s.charAt(i))))
		                temp = temp + s.charAt(i);
		        }
		        System.out.println(temp);
		    }
		}

	

}
