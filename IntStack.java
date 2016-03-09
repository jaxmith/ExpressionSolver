
package stacks;

/**
 *
 * @author Jack
 */
public class IntStack {
    
    private final int CAPACITY = 100;
    private int[] data;
    private int top;
    
    public IntStack(){
        top = -1;
        data = new int[CAPACITY];
    }
    
    public int pop(){
        int result = -1;
        if(top != -1){
            result = data[top];
            top--;
        }
        return result;
    }
    
    public int peek(){
        int result = 0;
        if(top != -1){
            result = data[top];
        }
        return result;
    }
    
    public void push(int i){
        if(top != CAPACITY - 1){
            top++;
            data[top] = i;
        }
    }
    
    public int[] getData(){
        return data;
    }
    
}
