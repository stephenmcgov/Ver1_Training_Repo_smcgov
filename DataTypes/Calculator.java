
public class Calculator {
	public static float add(String val1, String val2) {
		float ret = 0f;
		float num1 = Float.parseFloat(val1);
		float num2 = Float.parseFloat(val2);
		ret = num1+num2;
		return ret;
	}
	
	public static float subtract(String val1, String val2) {
		float ret = 0f;
		float num1 = Float.parseFloat(val1);
		float num2 = Float.parseFloat(val2);
		ret = num1-num2;
		return ret;
	}
	
	public static float multiply(String val1, String val2) {
		float ret = 0f;
		float num1 = Float.parseFloat(val1);
		float num2 = Float.parseFloat(val2);
		ret = num1*num2;
		return ret;
	}
	
	public static float divide(String val1, String val2) {
		float ret = 0f;
		float num1 = Float.parseFloat(val1);
		float num2 = Float.parseFloat(val2);
		ret = num1/num2;
		return ret;
	}
}
