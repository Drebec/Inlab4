/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Drew
 */
public class Stack<E> {

    private ArrayList<E> array;
    private int size;

    public Stack() {
        array = new ArrayList();
    }
    
    public int getSize() {
        return size;
    }

    public void push(E element) {
        array.add(element);
        size++;
    }

    public E pop() {
        if (size != 0) {
            E popped = array.get(size - 1);
            array.remove(size - 1);
            size--;
            return popped;
        }
        return null;
    }

    public E peek() {
        if (size != 0) {
            return array.get(size - 1);
        }
        return null;
    }   
    
    public void printStack() {
        while(size != 0) {
            System.out.println(pop());
        }
    }
}
