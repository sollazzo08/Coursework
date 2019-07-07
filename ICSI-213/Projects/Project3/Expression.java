package project3;

import java.util.ArrayList;

/**
 * This class takes an expression and converts it to post fix than evaluates it.
 * @author Michael
 *
 */
public class Expression{
	/**
	 * The numeric expression representation
	 */
	private String expression;
	/**
	 * Constructs an expression 
	 * @param str an expression
	 */
	public Expression(String str) {

		this.expression = str;
	}
	
	/**
	 * Help method to find precedence in the , higher the number the higher the
	 * precedence
	 * 
	 * @param c character
	 * @return value of 1, 2, or -1
	 */
	
	private int precedence(String s) {
		switch (s) {
		case "+":
		case "-":
			return 1;
		case "*":
		case "/":
			return 2;
		}
			return -1;
	}
	
	/**
	 * Converts this infix expression to post fix
	 * 
	 * @return tokens stored in an array list in post fix form 
	 */
	public ArrayList<String> infixToPostfix() {
	
	  ArrayList<String> postFixStr = new ArrayList<>();
		
	  GenericStack<String> stk = new GenericStack<>();

	  String[] arr = this.expression.split(("((?<=[+])|(?=[+]))|((?<=[-])|(?=[-]))|((?<=[/])|(?=[/]))|((?<=[*])|(?=[*]))|((?<=[)])|(?=[)]))|((?<=[(])|(?=[(]))"));		
		
	
		for (int i = 0; i < arr.length; i++) {
			
			// if the token is an operand then add it to the array list
			if (isNumber(arr[i]))
				
				postFixStr.add(arr[i]);
			
			// if "(" is encountered push to stack
			else if (arr[i].contains("(")) {
				
				stk.push(arr[i]);
			}
			
		
			
			else if (arr[i].contains(")")) {

				while (!stk.isEmpty() && !stk.peek().contains("(")) {
					
					postFixStr.add(stk.pop());
					
				}	
						stk.pop(); 
				}
			
			else {
				while (!stk.isEmpty() && precedence(arr[i]) <= precedence(stk.peek()) ) {
					
					postFixStr.add(stk.pop());
				}
					stk.push(arr[i]);
				}
				
		}//end of for loop

		while (!stk.isEmpty()) {
			
			postFixStr.add(stk.pop());
		}
		
		return postFixStr;
	}
	
	/**
	 * Evaluates the post fix expression
	 * @return the result from this method
	 */
	public int evaluatePostfix() {
			
	 Expression exp = new Expression(this.expression);
		
	 ArrayList<String> kim = exp.infixToPostfix();
	
	 GenericStack<Integer> stk = new GenericStack<>();
	
		for (int i = 0; i < kim.size(); i++) {
			
			String s = kim.get(i);
			
			if (isNumber(s))
				stk.push(Integer.parseInt(s));
		
			else {
				int num1 = stk.pop();
				int num2 = stk.pop();

				switch (s) {
				case "*":
					stk.push(num1 * num2);
					break;
				case "/":
					stk.push(num2 / num1);
					break;
				case "+":
					stk.push(num1 + num2);
					break;
				case "-":
					stk.push(num2 - num1);
					break;

			}
		}
	}

	return stk.pop();
	
	}
	
	/**
	 * Checks if the String is a number 
	 * @param str a string 
	 * @return a true or false value 
	 */
	private boolean isNumber(String str) {
	    try {
	        Integer.parseInt(str);
	        return true;
	    } catch (NumberFormatException nfe) {
	    }
	    return false;
	}
	

}
