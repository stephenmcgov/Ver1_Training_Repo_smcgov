import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num:");
		String val1 = sc.nextLine();
		System.out.println("Enter operator:");
		String op = sc.nextLine();
		System.out.println("Enter second num:");
		String val2 = sc.nextLine();
				
		float num1 = Float.parseFloat(val1);
		float num2 = Float.parseFloat(val2);
		float ans = 0f;
				
		if (op.equals("+")) ans = num1+num2;
		else if (op.equals("-")) ans = num1-num2;
		else if (op.equals("/")) ans = num1/num2;
		else if (op.equals("*")) ans = num1*num2;
		else if (op.equals("%")) ans = num1%num2;
		else if (op.equals("^")) ans = (float) Math.pow(num1, num2);
				
		System.out.println(val1 + op + val2 + " = " + ans);
	}

}
