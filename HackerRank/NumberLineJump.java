public class NumberLineJump {

	public static void main(String[] args) {

		String result = lineJump(2,1,1,2);

		
	}



	public static String lineJump(int x1, int v1, int x2, int v2) {

		if(v2==v1){
			return (x1==x2)? "YES":"NO";
		}

		if( (x2-x1) % (v1-v2)==0 && (x2-x1)*(v1-v2)>0){
			return "YES";
		}
		else{
			return "NO";
		}
	}

}

