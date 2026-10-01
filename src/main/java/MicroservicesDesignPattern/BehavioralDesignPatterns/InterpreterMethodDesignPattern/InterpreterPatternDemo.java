package MicroservicesDesignPattern.BehavioralDesignPatterns.InterpreterMethodDesignPattern;

public class InterpreterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Representing the expression: (10 + 20) - 5
		Expression ten = new NumberExpression(10);
		Expression twenty = new NumberExpression(20);
		Expression five = new NumberExpression(5);
		
		 // 10 + 20
		Expression addition = new AddExpression(ten,twenty);
		
		// (10 + 20) - 5
		Expression substraction = new SubtractExpression(addition,five);
		System.out.println("reult :"+substraction);
	}

}
//Step 2: Implement Terminal Expression (Number Expression)
class NumberExpression implements Expression {
	private int number;
	public NumberExpression(int number) {
		this.number=number;
	}
	public int interpret(){
		return number;
	}
}
//Step 3: Implement Non-Terminal Expressions (Add and Subtract Expressions)

class AddExpression implements Expression{
	private Expression left,right;
	
	public AddExpression(Expression left,Expression right) {
		this.left=left;
		this.right=right;
		
	}
	public int interpret() {
		return left.interpret() + right.interpret();
	}
}

class SubtractExpression implements Expression {
	private Expression left, right;
	
	public SubtractExpression(Expression left,Expression right) {
		this.left=left;
		this.right=right;
	}
	public int interpret() {
		return left.interpret()-right.interpret();
	}
}















