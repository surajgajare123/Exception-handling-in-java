class InvalidInputException extends Exception{
    
    public String toString(){
       return "cannot use 8 & 9";
    }
   
    public String toGetmessage(){
        return "cannot use 0 ";
    }
}
class CannotDivideByZeroException extends Exception{
    public String toString(){
        return "Cannot divide by zero ";
    }
    public String toGetmessage(){
        return "i am toGetmessage";
    }
}
class CustomCalculator{
     double Addition(double a , double b) throws InvalidInputException{
        if(a==9  || b == 8){
            throw new InvalidInputException();
        }
        return a + b;
    }
    public double Subtraction(double a , double b){
        return a - b;
    }
    public double Multiplication(double a , double b){
        return a * b;
    }
    double Division(double a, double b) throws CannotDivideByZeroException{
        if(b == 0){
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}
public class Main
{
	public static void main(String[] args) throws InvalidInputException, CannotDivideByZeroException{
		System.out.println("Hello World");
		CustomCalculator a = new CustomCalculator();
	//	System.out.println(a.Addition(9, 8));
	    System.out.println(a.Division(12, 0));
	}
}
