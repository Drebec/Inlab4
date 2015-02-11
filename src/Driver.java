/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Drew
 */
public class Driver {

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        stack1.push("Drew");
        stack1.push("Austin");
        stack1.push("Megan");
        stack1.push(8);
        stack1.push(-4);
        stack1.push(4.56);
        stack1.push('A');

        stack2.push("Sean");
        stack2.push("Watson");
        stack2.push("Joe");
        stack2.push(-3);
        stack2.push(12);
        
        mergeStacks(stack1, stack2);
    }

    public static void mergeStacks(Stack s1, Stack s2) {
        Stack temp1 = new Stack();
        Stack temp2 = new Stack();

        while (s1.getSize() != 0) {
            temp1.push(s1.pop());
        }
        
        while(s2.getSize() != 0) {
            temp2.push(s2.pop());
        }

        while (temp2.getSize() != 0) {
            s1.push(temp2.pop());
        }

        while (temp1.getSize() != 0) {
            s1.push(temp1.pop());
        }
        
        s1.printStack();
    }
}
