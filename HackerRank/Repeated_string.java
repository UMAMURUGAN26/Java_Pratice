package HackerCode;

public class Repeated_string {
	public static void main(String[] args) {

		String s = "abcac";

		long n = 10;

		long result = repeatedString(s, n);

		System.out.println(" Thenumber of letter a's in the first  letters of the infinite string is " + result);
	}

	public static long repeatedString(String s, long n) {
		
		int count_a=0;
		int rem_Count=0;

		int len=s.length();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'){
				count_a++;
			}
		}
		long repeat=n/len;
		long rem=n % len;
		for(int i=0;i<rem;i++){
			if(s.charAt(i)=='a'){
				rem_Count++;
			}
		}
		return count_a*repeat+rem_Count;
	}

}

/****
 * 
 * abc 10 
 * abcabcabca --> length 10 --> a value is 4 
 */

