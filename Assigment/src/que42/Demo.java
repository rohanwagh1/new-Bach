package que42;

//42.
public class Demo {
	
	public static void main(String[] args) {
		String str = "Hello how are you shyam?";
		//here print number of occurrences of 'o' character from str string
		int occurance=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i) == 'o'){
				occurance++;
			}
		}
		System.out.println(occurance);
	}
}


