import java.util.Scanner;

public class NonRepeated {

	public static void main(String[] args) {
		//Reading the input string
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		System.out.println(firstNonRepeated(inputString));
	}
	
	public static String firstNonRepeated(String inputString) {
		int[] countArray = new int[26]; 
        	char[] chars = inputString.toCharArray();
	  //Adding the count of the characters in the count array
        for (char c : chars) {
            char lowerChar = Character.toLowerCase(c);
            countArray[lowerChar - 'a']++;
        }

        for (char c : chars) {
            char lowerChar = Character.toLowerCase(c);
            if (countArray[lowerChar - 'a'] == 1) {
                return String.valueOf(c);
            }
        }

        return "";
	}

}
