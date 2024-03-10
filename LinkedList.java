import java.util.*;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head==null) {
            head=tail=newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head==null) {
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
    }

    public void printLL() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void add(int index, int data) {
        if(index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<index-1) {
            temp = temp.next;
            i++;
        }
        //i = index-1;  temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size==0) {
            System.out.println("Linked List is Empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data; //Tail Data
        prev.next = null;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        int index = 0;
        Node temp = head;
        while(temp!=null) {
            if(temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);

        if(idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthfronEnd(int n) {
        int sz = 0;
        Node temp = head;
        while(temp!=null) {
            temp = temp.next;
            sz++;
        }

        if(n == sz) {
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    //Slow-Fast Approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //slow is the midNode
    }

    public boolean checkPalindrome() {
        if(head == null || head.next == null) {
            return true;
        }

        //step1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; //right half head
        Node left = head;

        //step3 - check left half & right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean isCycle() {  //Floyd's Cycle Finding Algorithm
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;  //cycle exist
            }
        }
        return false; //cycle doesn't exists
    }

    public static void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle -> last.next = null
        prev.next = null;
    }



    public static void main(String[] args) {
        
        LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.add(2,9);

        // ll.printLL();
        // System.out.println();
        // // System.out.println(ll.size);
        // System.out.println(ll.recSearch(3));
        // System.out.println(ll.recSearch(10));

        // System.out.println();
        // ll.reverse();
        // ll.printLL();
        // ll.deleteNthfronEnd(3);
        // System.out.println();
        // ll.printLL();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.printLL();
        System.out.println(ll.checkPalindrome());
    }

}
