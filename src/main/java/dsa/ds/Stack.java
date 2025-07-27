package dsa.ds;

//combining OPPs Pillars
public class Stack {
	private int top; 
	private int maxSize; 
	private int[] arr;
	Stack(int maxSize) {
		this.top = -1; //stack is created
		this.maxSize = maxSize;
		arr = new int[maxSize]; 
	}
    public boolean isFull(){
        if(top>=maxSize-1) return true;
        return false;
    }
    public boolean isEmpty(){
        if(top==-1) return true;
        return false;
    }
    public void push(int val){
        if(isFull()){
            System.out.println("Stack overflow");
        } else {
            arr[++top]=val;
        }
    }
    public int pop() {
		if (isEmpty())
			return Integer.MIN_VALUE;
		else
			return arr[top--];
	}
    public int peek(){
        if(top<0) return Integer.MIN_VALUE;
        return arr[top];
    }
    public void display(){
        
        for(int i=top; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}