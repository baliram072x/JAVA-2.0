
public class LinkedList {
    // node class
public static class Node{

    int data ;
    Node next ;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

// head and tail
public static Node head;  //belongs to the class itself
public static Node tail;
public static int size;

// add first
public void addFirst(int data){
    // setp 1 =  create new node
    Node  newNode = new Node(data);
    size++;
    if (head == null){
        head = tail = newNode;
        return;
    }
    // step 2 = newNode next = head
    newNode.next = head; // linking

    // step 3 = head = newNode
    head = newNode;
}

// add last
public void addLast(int data){
    Node newNode = new Node(data);
    size++;
    if (head == null){
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    tail = newNode;

}

public void addMid(int idx , int data){
    if (idx == 0 ){
        addFirst(data);
        return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp =  head;
    int i =0;

    while (i<idx-1){
        temp = temp.next;
        i++;
    }

    // i= idx-1 ; temp ==> prev
    newNode.next = temp.next;
    temp.next = newNode;
}

public void print(){
    if (head == null){
        System.out.println("Linked list is empty");
        return;
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+ "-->");
        temp=temp.next;
    }
    System.out.println("null");
}

// Remove first
public int removefirst(){
    if (size == 0){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;

    } else if (size == 1) {
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
    }
    int val = head.data;
    head = head.next;
    size--;
    return val;
}

// remove last


public int removeLast(){
    if (size == 0){
        System.out.println("liked list is empty");
        return Integer.MIN_VALUE;
    } else if (size == 1) {
        int val = head.data;
        head=tail=null;
        size = 0;
        return val;
    }


    // prev : i=size-2
    Node prev  = head;
    for (int i=0; i<size-2; i++){
        prev = prev.next;
    }
    int val = prev.next.data;
    prev.next = null;
    tail =prev;
    size--;
    return val;
}

// searching in array
    public void  itrSearch(int key){
    Node temp =head ;

    for (int i = 0; i<size; i++){
        if (temp.data == key){
            System.out.println("key found at idx : " + i );
            return ;
        }
        temp = temp.next;

    }
        System.out.println("key not found ");
//    int i =0;
//
//    while(temp != null){
//        if (temp.data == key){  // key found
//            System.out.println("key found : ");
//        }
//        temp = temp.next;
//        i++;
//
//    }
//    //key not found
//        System.out.println("key not found ");
    }


    // recursive search
    public int helper(Node head , int key){
    if (head == null){
        return -1;
    }

    if (head.data == key){
        return 0;
    }

    int idx = helper(head.next, key);
    if (idx == -1){
        return -1;
    }

    return idx+1;
    }
public int recSearch(int key){
      return helper(head , key);
}

// reverse a linkedlist
public void reverse(){
    Node prev = null;
    Node curr = tail =head;
    Node next;

    while(curr != null ){
        next = curr.next;
        curr.next =prev;
        prev = curr;
        curr = next;
    }
    head = prev ;

}


// main function
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addMid(2 , 3);
//        ll.print();
//        System.out.println(ll.size);
//
//       int  x =  ll.removefirst();
//        ll.print();
//        System.out.println("val of x : " + x );
//
////        ll.removeLast();
        ll.print();
////        System.out.println(ll.size);
ll.print();
        System.out.println(ll.recSearch(5));
        System.out.println(ll.recSearch(10));
        ll.reverse();
        ll.print();
    }
}
