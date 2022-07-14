package telran.text;

public class RegularExpressions {

	public static String javaVariableRegex() {
		
		return "[a-zA-Z$][\\w$]*|_[\\w$]+";
	}
	
    private static String ipOctetRegex() {
		//string expression of number 0-255 with possible leading zeros
		return "\\d\\d?|[0,1]\\d\\d|2[0-4]\\d|25[0-5]";
	}
public static String ipV4Regex() {
	
	return String.format("((%s)\\.){3}(%s)", ipOctetRegex(),ipOctetRegex());
}
public static String arithmeticExpression() {
	String operator = "[-+*/]";
	String operand = operandRegex();
	return String.format("\\(*%1$s\\)*(%2$s\\(*%1$s\\)*)*", operand, operator);
}
/*************************************************************************/
private static String operandRegex() {
	String number = "(\\d+.?\\d*|.\\d+)";
	return String.format("(%1$s|%2$s)", number, javaVariableRegex());
}

}
