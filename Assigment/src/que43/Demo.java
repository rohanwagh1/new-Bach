package que43;

public class Demo {
	public static int calculateLength(String str){
		//calculate length here and don't use length function of string class
		int len=str.length();
		return len;
	}
	public static void main(String[] args) {
		String str = "Hello how are you shyam?";
		int len = calculateLength(str);
		System.out.println(len);
	}
}
