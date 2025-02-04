import java.util.Queue;

public class CircularQueue {

    static class Circularqueue{
        static int size;
        static int arr[];
        static int rear=-1;
        static int front=-1;

        Circularqueue(int n){
            this.size=n;
            arr = new int[n];
        }

        public static boolean isempty(){
            return rear==-1 && front==-1;
        }

        public static boolean isfull(){
            return (rear+1)%size==front;
        }

        public static void add(int data){
            if(isfull()){
                System.out.println("Full Queue");
                return;
            }
            //1st element add
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        public static int remove(){
            if(isempty()){
                System.out.println("Empty Queue");
                return-1;
            }
            int result=arr[front];
            if(front==rear){
                front=rear=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }

        public static int peek(){
            if(isempty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {

        Circularqueue q = new Circularqueue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);

        while(!q.isempty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}