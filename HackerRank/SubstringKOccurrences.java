package HackerCode;

import java.util.HashMap;
import java.util.Map;

public class SubstringKOccurrences {
	
	
	
	public static void main(String[] args) {
        String s = "aabbcc";
        int k = 2;

        int count = countSubstrings(s, k);
        System.out.println("Number of valid substrings: " + count);
    }

	private static int countSubstrings(String s, int k) {
		
		int n=s.length();
		int result=0;
		for(int i=0;i<n;i++) {
			Map<Character,Integer> map=new HashMap<>();
			for(int j=i;j<n;j++) {
				char ch=s.charAt(j);
				map.put(ch, map.getOrDefault(ch, 0)+1);
				if(map.get(ch)>k) {
					break;
				}
				if(allfreq(map,k)) {
					result++;
				}
							}
			
		}
		
	
		return result;
	}

	private static boolean allfreq(Map<Character, Integer> map, int k) {
		
		for(int freq:map.values()) {
			if(freq!=k)
				return false;
		}
		return true;
	}

}
