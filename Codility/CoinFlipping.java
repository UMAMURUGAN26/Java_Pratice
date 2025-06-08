public class CoinFlipping {
	
	/**There are N coins, each showing either heads or tails. We would like all the
	coins to form a sequence of alternating heads and tails. What is the
	minimum number of coins that must be reversed to achieve this?*/

    public static int minFlipsToAlternate(int[] A) {
    	
    	int n=A.length;
    	
    	int head=0;
    	int tail=0;
    	
    	for(int i=0;i<n;i++) {
    		if(i%2==0) {
    			if(A[i]!=0)
    				head++;
    		}
    		else {
    			if(A[i]!=1)
    				head++;
    		}
    		
    		if(i%2==0) {
    			if(A[i]!=1)
    				tail++;
    		}
    		else {
    			if(A[i]!=0)
    				tail++;
    		}	
    			
    		
    	}
    	
    	
		return Math.min(head, tail);
    	
    	
    }

    public static void main(String[] args) {
        // Example input
        int[] A = {0, 1, 0, 1, 1, 0};
        System.out.println("Minimum flips required: " + minFlipsToAlternate(A));  // Output: 2
    }
}
