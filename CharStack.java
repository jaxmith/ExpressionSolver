/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

/**
 *
 * @author Jack
 */
public class CharStack {
    
    private final int CAPACITY = 100;
    private char[] data;
    private int top;
    
    public CharStack(){
        top = -1;
        data = new char[CAPACITY];
    }
    
    public char pop(){
        char result = ' ';
        if(top != -1){
            result = data[top];
            top--;
        }
        return result;
    }
    
    public char peek(){
        char result = ' ';
        if(top != -1){
            result = data[top];
        }
        return result;
    }
    
    public void push(char c){
        if(top != CAPACITY - 1){
            top++;
            data[top] = c;
        }
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public char[] getData(){
        return data;
    }
    
}
