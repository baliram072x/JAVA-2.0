
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

//-------------------------------------------------------------------------------------------------------------------------------------------------------
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

// --------------------------------------------------------------------------------------------------------------------------------------------------------------
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

//--------------------------------------------------------------------------------------------------------------------------------------------------------------
// adding elemet in middle of linked list
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

//-----------------------------------------------------------------------------------------------------------------------------------------------------
// printing the linkedlist
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

//-------------------------------------------------------------------------------------------------------------------------------------------------------
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

//------------------------------------------------------------------------------------------------------------------------------------------------------
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

//---------------------------------------------------------------------------------------------------------------------------------------------------------
// searching in linkedlist
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


    //--------------------------------------------------------------------------------------------------------------------------------------------------
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

//---------------------------------------------------------------------------------------------------------------------------------------------------
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

//-----------------------------------------------------------------------------------------------------------------------------------------------------------
// finding mid in LinkedList by slow fast approach
public Node findMid(Node head){
    Node slow = head ;
    Node fast = head;

    while (fast != null && fast.next != null){
        slow = slow.next; // +1
        fast = fast.next.next; //+2

    }
    return slow;
}

//----------------------------------------------------------------------------------------------------------------------------------------
// check weather linklist is palindrome or not
public Boolean cheakPalindrome (){

    if (head == null || head.next == null){
        return true ;

    }
    // step 1 - find mid
    Node midNode = findMid(head);

    // step 2 reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next ;

    while (curr != null){
        next = curr.next;
        curr.next =prev;
        prev = curr;
        curr = next;
    }

    Node right = prev; // right half head
    Node left   =head ;

    // step 3 cheak left half and right half
    while (right !=  null){
        if (left.data != right.data){
            return  false;
        }
        left = left.next;
        right = right.next;
    }
    return true;
}

// detect a loop / cycle in a linkedlist
    public static boolean isCycle(){
     Node slow = head;
     Node fast = head;

     while(fast != null && fast.next != null) {
         slow = slow.next; // +1
         fast = fast.next.next; // +2

         if(slow == fast){
             return true ; //  cycle exists
         }

     }
     return false;
    }

    // Removing a cycle in a LinkedList

    public static void removeCycle(){
     // detect cycle
        Node slow = head ;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow){
                cycle =  true;
                break;
            }
        }
        if (cycle == false){
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast){
            prev = fast ;
            slow =slow.next;
            fast= fast.next;

        }

        // remove cycle = last.next = null
        prev.next = null;

    }


// main function
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
//        ll.print();
//        ll.addFirst(1);
//        ll.addFirst(2);
//        ll.addLast(1);
//        ll.addLast(2);
//
//        ll.print();
//        System.out.println(ll.recSearch(5));
//        System.out.println(ll.recSearch(10));
//        ll.reverse();
//        ll.print();
//        ll.itrSearch(2);

        ll.head = new Node(3);
        Node temp = new Node(6);
        ll.head.next =temp;
        ll.head.next.next = new Node(5);
        ll.head.next.next.next = temp ;

//        ll.print();
        System.out.println(ll.isCycle());
        ll.removeCycle();

        System.out.println(ll.isCycle());
    }
}
