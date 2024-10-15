package Queue;
import java.util.Queue;
import  java.util.LinkedList;


public class CreateTheQueue {
    public static void main(String[] args) {
        Queue <String> q= new LinkedList<>();
        q.offer("Anushini");
        q.offer("Amshini");
        q.offer("Harihara sudhan");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q. poll());
        System.out.println(q. poll());
        System.out.println(q.size());
        q.offer("Bazeer");
        q.offer("Krishna");
        q.offer("Goutham");
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q. poll());
        System.out.println(q. poll());
        System.out.println(q. poll());
        System.out.println(q. poll());
        System.out.println(q. size());
        System.out.println(q. poll());
        System.out.println(q. isEmpty());
        q.offer("Goutham");
        System.out.println(q. isEmpty());


    }

}