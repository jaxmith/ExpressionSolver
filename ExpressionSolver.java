package stacks;
import java.util.Scanner;
/**
 *
 * @author Jack
 */
public class ExpressionSolver {

  
    public static void main(String[] args) {
        
        IntStack nums = new IntStack();
        CharStack ops = new CharStack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a fully parenthesized expression.");
        String input = scanner.nextLine();
        
        for(int i = 0; i < input.length(); i++){
            if(Character.isDigit(input.charAt(i)))
                nums.push(Integer.parseInt(input.substring(i, i+1)));
            else if(input.charAt(i) == ')'){
                nums.push(solve(nums.pop(), nums.pop(), ops.pop()));
            }
            else if(input.charAt(i) != '(')
                ops.push(input.charAt(i));         
        }
        
        System.out.println("The answer to the expression is: " + nums.pop());      
    }
    
    public static int solve(int i, int j, char c){
        
        if(c == '-')
            return j - i;
        else if(c == '*')
            return i * j;
        else if(c == '/')
            return j / i;
        else if(c == '+')
            return i + j;
        else
            return -1;
        
    }
    
}
