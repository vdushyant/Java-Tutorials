import java.util.ArrayList;
import java.util.Stack;

public class stack {

//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data=data;
//            this.next=null;
//        }
//    }
//
//    static class Stack{
//        public static Node head;
//
//        public static boolean isempty(){
//            return(head==null);
//        }
//        public static void push(int data){
//            Node newNode= new Node(data);
//            if(isempty()){
//                head= newNode;
//            }
//            else{
//                newNode.next=head;
//                head=newNode;
//            }
//        }
//
//        public static int pop(){
//            if(isempty()){
//                return -1;
//            }
//            int top=head.data;
//            head=head.next;
//            return top;
//        }
//        public static int peek(){
//            if(isempty()){
//                return -1;
//            }
//            int top=head.data;
//            return top;
//        }
//    }
//
//    static class Stack2{
//        public static ArrayList<Integer> list = new ArrayList<>();
//
//        public static boolean isEmpty(){
//            return (list.size()==0);
//        }
//
//        public static void push(int data){
//                list.add(data);
//        }
//
//        public static int pop(){
//            int top = list.get(list.size()-1);
//            list.remove(list.get(list.size()-1));
//            return top;
//        }
//
//        public static int peek(){
//            int top=list.get(list.size()-1);
//            return top;
//        }
//    }
    public static void main(String[] args) {
//        Stack2 s = new Stack2();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}