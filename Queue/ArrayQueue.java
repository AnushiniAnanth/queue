package Queue;
import java.util.Queue;

public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueue(int capacity){
        this.capacity=capacity;
        queue=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }

public void enqueue(int element){
    if(isFull()){
        System.out.println("Queue is full , can't add the element");
        return;
    }
    rear=(rear+1) % capacity;
    queue[rear]=element;
    size++;
}
public int dequeue(){
    if(isEmpty()){
        System.out.println("Queue is Empty, can't delete the element");
      return -1;
    }
    int element= queue[front];
    front=(front+1)%capacity;
    size--;
    return element;
}

public int peek(){
    if(isEmpty()){
        System.out.println("Queue is Empty, It can't hava any element");
        return -1;

    }
    return queue[front];
}


public boolean isFull(){
    
    return size== capacity;

}
public boolean isEmpty(){
  return size==0;

}
public int getSize(){
    return size;
  
  }



public static void main(String[] args) {
    ArrayQueue queue= new ArrayQueue(5);// int []  q= new int[5];
    queue.enqueue(10);
    queue.enqueue(15);
    queue.enqueue(20);
    System.out.println("The dequeue element is  "+queue.dequeue());

    queue.enqueue(8);
    queue.enqueue(9);
    queue.enqueue(14);
    System.out.println("The size  element is  "+queue.getSize());
    for (int i = 0; i < queue.getSize(); i++) {
        int index = (queue.front + i) % queue.capacity;
        System.out.println(queue.queue[index] + " ");
    }
    System.out.println("The peek element is  "+queue.peek());
    System.out.println("The size  element is  "+queue.getSize());

   

}

}
