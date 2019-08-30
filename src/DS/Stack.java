package DS;

public class Stack {
    /**
     * push()
     * pop()- remove the top object of the stack and return the object from function. And the size will be decreased by one
     * isEmpty()
     * isFull()
     * peek() return top most object of the stack  without removing and modifying the object from stack
     * size()
     */

    private int arr[];
    private int size;
    private int top;
    Stack(int size){
       this.arr= new int[size];
       this.size = size;
       this.top=-1;
    }

public void push(int x){
    System.out.println("inside push method");
    if(isFull()){
        System.out.println("Sorry stack was full with items");
//        throw new StackOverflowError("stack was fully filled with items");
    } else{
        arr[top+1]=x;
        System.out.println("pushed item to stack @"+(top+1));
        top++;
    }
}

public int pop(){
        int x =0;
    if(!isEmpty()){
        x=arr[top];
        arr[top]=0;
        top=top-1;
    } else{
        System.out.println("sorry stack is empty..");
    }
     return x;
}

public int peek(){
        return isEmpty()?0:arr[top];
}

public boolean isEmpty(){
        return top == -1;
}
public boolean isFull(){
    return top == size-1;
}

public static void main(String[] args){
        Stack s = new Stack(3);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(6);
       for(int v :s.arr){
           System.out.println("value : "+v);
       }

    System.out.println("peek element from stack: "+s.peek());

    System.out.println("removed top most element : "+s.pop());
    System.out.println("removed top most element : "+s.pop());
    System.out.println("removed top most element : "+s.pop());
    System.out.println("removed top most element : "+s.pop());
    System.out.println("removed top most element : "+s.pop());

}


}
