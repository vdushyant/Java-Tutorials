import java.util.LinkedList;

import java.util.Queue;

public class queue {

    //Using an Array
//    static class Queue{
//        static int arr[];
//        static int size;
//        static int rear=-1;
//
//        Queue(int n){
//            this.size=n;
//            arr = new int[n];
//        }
//
//        public static boolean isempty(){
//            return rear==-1;
//        }
////enqueue
//        public static void add(int data){
//            if(rear==size-1){
//                System.out.println("Full Queue");
//                return;
//            }
//            rear++;
//            arr[rear]=data;
//            return;
//        }
////dequeue
//        public static int remove(){
//            if(isempty()){
//                System.out.println("Empty Queue");
//                return -1;
//            }
//            int front=arr[0];
//            for(int i=0;i<rear;i++){
//                arr[i]=arr[i+1];
//            }
//            rear--;
//            return front;
//        }
//
//        public static int peek(){
//            if(isempty()){
//                return -1;
//            }
//            return arr[0];
//        }
//
//        public void printQueue(){
//            for(int i=0;i<=rear;i++){
//                System.out.print(arr[i]);
//            }
//            System.out.println();
//        }
//    }
//

    public static void main(String[] args) {

//
//        Queue q = new Queue(5);
//        q.add(1);
//        q.add(2);
//        q.add(3);
//
//        q.printQueue();
//
//        while(!q.isempty()){
//            System.out.println(q.peek());
//            q.remove();
//        }

        Queue<Integer> q=new LinkedList<Integer>();//Queue<Integer> q = new ArrayDeque<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}