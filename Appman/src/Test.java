import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Given input is: ");
		String input = scan.nextLine();
		
		String temp = "";
		
		for(int i =0;i< input.length();i++) {
			switch (input.charAt(i))
			{
				case '0' : temp += input.charAt(i);break;
				case '1' : temp += input.charAt(i);break;
				case '2' : temp += input.charAt(i);break;
				case '3' : temp += input.charAt(i);break;
				case '4' : temp += input.charAt(i);break;
				case '5' : temp += input.charAt(i);break;
				case '6' : temp += input.charAt(i);break;
				case '7' : temp += input.charAt(i);break;
				case '8' : temp += input.charAt(i);break;
				case '9' : temp += input.charAt(i);break;
			}
		}
		
		int answer = 0, factor = 1;
		for (int i = temp.length()-1; i >= 0; i--) {
		    answer += (temp.charAt(i) - '0') * factor;
		    factor *= 10;
		}
		System.out.print("The output should be: " + answer + " in integer.");
	}
	

}
