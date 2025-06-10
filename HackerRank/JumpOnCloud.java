public class JumpOnCloud {

	public static void main(String[] args) {

		int arr[]= {0 ,0 ,1 ,0 ,0 ,1, 0};

		int result = jumpingOnClouds(arr);

		System.out.println(" The number of valleys walked through  is " + result);
	}


	static int jumpingOnClouds(int[] arr) {
		// Write your code here
		int jump=0;
		int i=0;
		int n=arr.length;
		while(i<n-1){
			if(i+2<n &&arr[i+2]==0){
				i+=2;

			}
			else
			{
				i+=1;
			}
			jump++;
		}
		return jump;
	}

}


