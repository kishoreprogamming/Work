import java.io.*;
public class Vowels {		
		static void   countCharacterType(String str)
		 {
		        int vowels=0,consonant=0,specialChar=0,digit=0;
		        for (int i = 0; i < str.length(); i++) {         
		            char ch = str.charAt(i);
		            if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) 
		            {	               
		                ch = Character.toLowerCase(ch);
		                if (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u')
		                {
		                    vowels++;
		                }
		                else
		                {
		                    consonant++;
		                }
		            }
		            else if (ch >= '0' && ch <= '9')
		            {
		                digit++;
		            }
		            else
		            {
		                specialChar++;
		            }
		        }   
		        System.out.println("Vowels: " + vowels);
		        System.out.println("Consonant: " + consonant);
		        System.out.println("Digit: " + digit);
		        System.out.println("Special Character: " + specialChar);
		    }
public static void main(String[] args) {
		    {
		    	// TODO Auto-generated method stub
		        String str = "ineuron for the best class ";  
		        
		        countCharacterType(str);
		    }
		}
}


