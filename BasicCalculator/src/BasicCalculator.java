/**
2 * Input:
3 * x - an integer
4 * y - an integer
5 * op - a character representing an arithmetic operator
6 * Output:
7 * 'x op y'
8 *
9 * Constraints:
10 * y != 0 if op == '\%' or op == '/'
11 *
12 * This method takes in 3 parameters: x, y, and op.
13 * It returns the result of evaluating the expression 'x op y' if the expression
14 * is valid. Otherwise, it prints an error message and returns -1.
15 *
16 * Examples)
17 * Ex1) basicCalculator(2, 3, '+') returns 5
18 * Ex2) basicCalculator(7, 3, '\%') returns 1
19 * Ex3) basicCalculator(5, 0, '\%') prints an error message and returns -1
20 */




public class BasicCalculator {

	
	public static int basicCalculator(int x, int y, char op) {
		Character mathsign = op;
		
		if (mathsign.equals('+')) { //this statement adds integers x and y if mathsign is +
			
			return x+y;
			
		}
		if(mathsign.equals('-')) { //this statement subtracts x and y if mathsign is -
			
			return x-y;
			
		}
		if(mathsign.equals('*')) { //this statement multiplies x and y if mathsign is * 
			
			return x*y;
			
		}
		if(mathsign.equals('/')) { //this statement divides x and y if mathsign is / but if y = 0 it returns -1 otherwise if y > 1, x/y
			if(y==0) {
				
				return -1;
				
			}else {
				
				return x/y;
			}
		}
		if(mathsign.equals('%')) { //cannot divide by 0 so returns -1
			if(y==0) {
				return -1;
			}
			else {
				return x%y;
			}
		}
		else {
			return -1;
		}
		
	}
	public static void main(String[] args) {
		System.out.println(basicCalculator(10,4,'+'));
		System.out.println(basicCalculator(11,4,'-'));
		System.out.println(basicCalculator(124,4,'/'));
		System.out.println(basicCalculator(4,4,'*'));
		System.out.println(basicCalculator(4,0,'%'));
		
	}
}