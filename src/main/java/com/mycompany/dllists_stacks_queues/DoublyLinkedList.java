package com.mycompany.dllists_stacks_queues;

/**
 *
 * @author MoaathAlrajab
 */
class Node {
   public int data;
   public Node next;
   public Node previous;

   public Node(int initialData) {
      data = initialData;
      next = null;
      previous = null;
   }
}

public class DoublyLinkedList {
   private Node head;
   private Node tail;
    
   public DoublyLinkedList() {
      head = null;
      tail = null;
   }
    
   public void append(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
   }
   
   public void prepend(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         newNode.next = head;
         head.previous = newNode;
         head = newNode;
      }
   }
  
   public void printList() {
      Node node = head;
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.next;
      }
      System.out.println();
   }
   
      public void printRevList() {
      Node node = tail;
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.previous;
      }
      System.out.println();
   }
//class assignment       
public int max() {
    Node node = head;
    int max = node.data;
    
    while (node != null) {
        if(node.data > max){
            max = node.data;
        }
        node = node.next;
    }
      return max;
}
   
public int min() {
    Node node = head;
    int min = node.data;
    
    while (node != null) {
        if(node.data < min){
            min = node.data;
        }
        node = node.next;
    }
      return min;
}

    public int size() {
       int count = 0;
       Node temp = head;
       while(temp != null){
           count++;
           temp = temp.next;
       }
       return count;
   }

//incomplete function need to get explained(if you can explain this one in the remark area of brightspace please do!
// public int lasttwo(int size){
//       Node current = head;
//       int sum;
//       
//       for(int i = size;;i--){
//
//           
//       
//       }
//       return sum;
//   }

   public void insertAfter(Node currentNode, Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else if (currentNode == tail) {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      else {
         Node successor = currentNode.next;
         newNode.next = successor;
         newNode.previous = currentNode;
         currentNode.next = newNode;
         successor.previous = newNode;
      }
   }
   
   public void remove(Node currentNode) {
      Node successor = currentNode.next;
      Node predecessor = currentNode.previous;
      
      if (successor != null)
         successor.previous = predecessor;
         
      if (predecessor != null)
         predecessor.next = successor;
         
      if (currentNode == head)
         head = successor;
         
      if (currentNode == tail)
         tail = predecessor;
   }
   
//Homework   
//1- toArray
//done in class

public int[] toArray(int size){
       int[] arr = new int[size];
       int index =0;
       Node current = head;
       
       while(current != null){
           
           arr[index++] = current.data;
           current = current.next;
       }
       return arr;
   }
//2- indexOf(object)
//done in class
   
public int indexOf(int x){
    int index =0;
    Node current = head;
    while(current != null){
        if(x==current.data){
            return index;
        }
        current = current.next;
        index++;
    } 
    return -1;
}
//3- the sum of the last m elements of list n. 
//I'm not sure if i did this right can we go over it??

public int sumM(int m)
   {
      int sum = 0;
      Node node = tail;
      while (m > 0 && node != null) {
         m--;
         sum += node.data;
         node = node.previous;
      }
      
      return sum;

   }

}
