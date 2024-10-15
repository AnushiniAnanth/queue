package Queue;
class Node{
    int data;
    Node next;

    public Node(int data){
        this. data=data;
        this.next= null;

    }

}
public class LinkedlistQueue {
    private Node front,rear;
    private int size;

     public LinkedlistQueue(){
        this.front= front;
        this. rear= rear;
        this.size= 0;

     }
     public void enqueue(int data){
       Node newNode =new Node(data);
       if(isEmpty()){
        front=rear= newNode;
       }
       else{
        rear.next=newNode;
        rear=newNode;
       }
       size++;
     }

     public int dequeue(){
        if(isEmpty()){
            System.out.println("queue is empty, can't pop the element");
            return -1;
        }
        int dequeueValue= front.data;
        front=front.next;
        if(front== null){
            rear= null;
        }
        size--;
        return dequeueValue;

     }
     public boolean isEmpty(){
        
        return front ==null;
     }
     public int peek(){
        if(isEmpty()){
            System.out.println("queue is empty, can't pop the element");
            return -1;
        }
        return front.data;

     }
     public int getSize(){
        return size;
      
      }

     



    public static void main(String[] args) {
        LinkedlistQueue queue=new LinkedlistQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("The size  element is  "+queue.getSize());
       

        
    }

}
