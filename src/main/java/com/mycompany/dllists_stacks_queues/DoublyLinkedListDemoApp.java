package com.mycompany.dllists_stacks_queues;
import java.util.Scanner; 
/**
 *
 * @author MoaathAlrajab
 */
public class DoublyLinkedListDemoApp {
    public static void main(String[] args) {
        DoublyLinkedList numList = new DoublyLinkedList();
        Node nodeA = new Node(14);
        Node nodeB = new Node(2);
        Node nodeC = new Node(20);
        Node nodeD = new Node(31);
        Node nodeE = new Node(16);
        Node nodeF = new Node(55);

        numList.append(nodeA);   // Add 14
        numList.append(nodeB);   // Add 2, make the tail
        numList.append(nodeC);   // Add 20, make the tail

        numList.prepend(nodeD);  // Add 31, make the head

        numList.insertAfter(nodeB, nodeE);  // Insert 16 after 2
        numList.insertAfter(nodeC, nodeF);  // Insert 55 after tail, 55 becomes new tail

        // Output list
        System.out.print("List after adding nodes: ");
        numList.printList();

        // Remove the tail node, then the head node
        numList.remove(nodeF);
        numList.remove(nodeD);

        // Output final list
        System.out.print("List after removing nodes: ");
        
        //Homework
        //Answer 1 Result ??Had to use a loop to get this to work properly?? is this how its supposed to be done or were we supposed to create an additional function...
        numList.printList();
        int[] arr = numList.toArray(numList.size());
        System.out.print("This is the array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        
        System.out.println();
        
        //Answer 2 Result
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number your looking for?");
        int num = scn.nextInt();
        
        if(numList.indexOf(num) != -1){
            System.out.print(numList.indexOf(num));
        }else{
            System.out.print(num + " was not in the array");
        }
        
        
        System.out.println();
        
        
        //Answer 3
        System.out.println("Out of " + numList.size()  + " numbers, How many would you like to add together?");
        int size = scn.nextInt();
        System.out.print(numList.sumM(size));
    }
}