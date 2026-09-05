public class LinkedList {
    //node class
public static class Node{
    int data ;
    Node next ;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

// head and tail
public static Node head;
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

//add last
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
    public int itrSearch(int key){
    Node temp =head ;
    int i =0;

    while(temp != null){
        if (temp.data == key){  // key found
            return i;
        }
        temp = temp.next;
        i++;
    }
    //key not found
        return -1;
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
        ll.print();
//        System.out.println(ll.size);
//
//        ll.removefirst();
//        ll.print();
//
//        ll.removeLast();
//        ll.print();
//        System.out.println(ll.size);

        System.out.println(ll.itrSearch(3));
        System.out.println(ll.itrSearch(10));
    }
}


//add == > addlastt ,addfirst ,  add mid
//remove => removefirst , removelast
//size