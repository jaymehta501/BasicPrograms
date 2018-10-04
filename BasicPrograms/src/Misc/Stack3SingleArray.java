package Misc;

import java.util.Arrays;

public class Stack3SingleArray {
	 private static final int STACK_SIZE = 50;
	    private static final int STACK_NUM = 3;

	    private static int[] stackPointers = new int[STACK_NUM];
	    static { Arrays.fill(stackPointers, -1); }
	    private int[] buffer = new int[STACK_SIZE * STACK_NUM];

	    public void push(int stackNum, int item) {
	        if (isFull(stackNum))
	            throw new IllegalArgumentException("Stack " + stackNum + " is full!");
	        stackPointers[stackNum]=1+stackPointers[stackNum];
	        buffer[getBufferIndex(stackNum)] = item;
	    }

	    public int pop(int stackNum) {
	        int val = peek(stackNum);
	        --stackPointers[stackNum];
	        return val;
	    }

	    public int peek(int stackNum) {
	        if (isEmpty(stackNum))
	            throw new IllegalArgumentException("Stack " + stackNum + " is empty!");
	        return buffer[getBufferIndex(stackNum)];
	    }

	    public boolean isFull(int stackNum) {
	        if (stackNum < 0 || stackNum >= STACK_NUM)
	            throw new IllegalArgumentException("Stack " + stackNum + " doen't exist!");
	        return stackPointers[stackNum] >= STACK_SIZE - 1;
	    }

	    public boolean isEmpty(int stackNum) {
	        if (stackNum < 0 || stackNum >= STACK_NUM)
	            throw new IllegalArgumentException("Stack " + stackNum + " doen't exist!");
	        return stackPointers[stackNum] <= -1;
	    }

	    public void printStack(int stackNum) {
	        if (stackNum < 0 || stackNum >= STACK_NUM)
	            throw new IllegalArgumentException("Stack " + stackNum + " doen't exist!");
	        int top = getBufferIndex(stackNum);
	        int btm = stackNum * STACK_SIZE;
	        System.out.println("Stack " + stackNum + ": ");
	        for (int i = btm; i <= top; ++i) {
	        	System.out.println(buffer[i] + " ");
	        }
	        System.out.println("[TOP]");
	    }

	    public void printStacks() {
	        for (int i = 0; i < STACK_NUM; ++i) {
	            printStack(i);
	        }
	    }

	    private int getBufferIndex(int stackNum) {
	    	System.out.println(stackPointers[stackNum] + stackNum * STACK_SIZE);
	        return stackPointers[stackNum] + stackNum * STACK_SIZE;
	    }

	    //TEST----------------------------------
	    public static void main(String[] args) {
	    	Stack3SingleArray stack = new Stack3SingleArray();
	        stack.printStacks();
	        System.out.println();
	        stack.push(0, -1); stack.push(0, -2); stack.push(0, -3);
	        stack.push(1, 1); stack.push(1, 2); stack.push(1, 3);
	        stack.push(2, 10); stack.push(2, 20); stack.push(2, 30); stack.push(2, 40);
	        stack.printStacks();
	        System.out.println();
	        System.out.println("Pop Stack 0: " + stack.pop(0));
	        System.out.println("Pop Stack 1: " + stack.pop(1));
	        System.out.println("Pop Stack 1: " + stack.pop(1));
	        System.out.println("Pop Stack 2: " + stack.pop(2));
	        System.out.println();
	        stack.printStacks();
	    }
}
