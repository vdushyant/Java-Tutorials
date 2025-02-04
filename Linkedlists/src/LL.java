import java.util.*;

public class LL {

    Node head;
    int size;

    LL(){
       this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data =data;
            this.next=null;
            size++;
        }
    }

    //add first
    public void addFirst(String data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
        return;
    }

    //add last
    public void addLast(String data){
        Node newNode=new Node(data);
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        return;
    }

    //print list
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    //delete first
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
        }
        size--;
        head =head.next;
        return;
    }

    //delete Last
    public void deleteLast(){
        if(head==null){
            System.out.println("The lis is empty");
            return;
        }
        size--;
        if(head.next==null){
            head= null;
            return;
        }
        Node secondLast=head;
        Node last = head.next;
        while(last.next!=null){
            last=last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public void reverseIterate(){

        if(head==null || head.next == null){
            return;
        }


        Node prevNode = head;
        Node currNode = prevNode.next;

        while(currNode !=null){
            Node nextNode = currNode.next;
            currNode.next=prevNode;
            //update
            prevNode  = currNode;
            currNode = nextNode;
        }
        head.next=null;
        head = prevNode;
        return;
    }

    public Node reverseRecursive(Node head){
        if(head == null || head.next==null){
            return head;
        }
        Node newhead =reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public static void main(String[] args) {

        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();

        list.reverseIterate();
        list.printList();

        list.head= list.reverseRecursive(list.head);
        list.printList();

//        list.deleteFirst();
//        list.printList();
//        list.deleteLast();
//        list.printList();
//
//        System.out.println(list.size);
//        list.addFirst("this");
//        System.out.println(list.size);

//        LinkedList<String> list =new LinkedList<>();

//        list.addFirst("a");
//        list.addFirst("is");
//        list.addLast("list");
//        list.addFirst("this");
//        System.out.println(list);
//
//        System.out.println(list.size());
//
//        for(int i=0;i<list.size();i++){
//            System.out.print(list.get(i)+"->");
//        }
//        System.out.println("Null");

//        list.removeFirst();
//        System.out.println(list);
//        list.removeLast();
//        System.out.println(list);

//        list.remove(3);
//        System.out.println(list);


    }
}