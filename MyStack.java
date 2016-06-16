
package stacks;

/**
 *
 * @author Jack Smith
 * ID: 110366081
 */
public class MyStack<T> {
    
    private final int CAPACITY = 100;
    private T[] data;
    private int top;
    
    public MyStack(){
        top = -1;
        data = (T[])new Object[CAPACITY];
    }
    
    public T pop(){
        T result = null;
        if(top != -1){
            result = data[top];
            top--;
        }
        return result;
    }
    
    public T peek(){
        T result = null;
        if(top != -1){
            result = data[top];
        }
        return result;
    }
    
    public void push(T data){
        if(top != CAPACITY - 1){
            top++;
            this.data[top] = data;
        }
    }
    
    public T[] getData(){
        return data;
    }
    
}
