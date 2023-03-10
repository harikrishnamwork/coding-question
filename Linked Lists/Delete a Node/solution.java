import java.io.IOException;
import java.util.Scanner;

public class solution {
        //Class for Node
        static class SinglyLinkedListNode {
            public int data;
            public SinglyLinkedListNode next;
            public SinglyLinkedListNode(int nodeData) {
                this.data = nodeData;
                this.next = null;
            }
        }

        //Class for Linked List
        static class SinglyLinkedList {
            public SinglyLinkedListNode head;
            public SinglyLinkedList() {
                this.head = null;
            }

        }

        //Member method to print the data of the nodes of singlyLinkedList
        public static void printSinglyLinkedList(SinglyLinkedListNode node) throws IOException {
            while (node != null) {
                System.out.print(node.data + " -> ");
                node = node.next;
            }
            System.out.println("NULL");
        }


        //Member method to insert node at tail
        static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
            //Create the node to be inserted in the Linked List
            SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
            //If head is null simply point head to temp and return head
            if (head == null) {
                head = temp;
                return head;
            }
            //If head is not null iterate through the Linked List using a temp Node: curr
            SinglyLinkedListNode curr = head;
            //Exit the while loop when curr.next points to null
            while (curr.next != null) {
                curr = curr.next;
            }
            //Add the temp node at curr.next
            curr.next = temp;
            //Return the head
            return head;
        }


        //Member method to delete a Node at a specific position
        static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
            //Iterate through the list if head is not null
            if(head != null){
                //Create a copy of head
                SinglyLinkedListNode temp;
                temp = head;
                //If position of node to be deleted is 0 simply return head.next
                //that is the element to which head is pointing
                if(position == 0)
                    head = head.next;
                    //If position is not 1 than iterate to position - 1
                else {
                    for(int i=0; i<position-1; i++)
                        temp = temp.next;
                    //Now remove the next node by derefrencing it
                    // that is pointing the next of current node to next of next of current node
                    temp.next = (temp.next).next;
                }
            }
            return head;
        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            //Creating Singly Linked List
            SinglyLinkedList llist = new SinglyLinkedList();
            //Code for adding node at tail of Linked List
            int llistCount = scanner.nextInt();
            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, llistItem);
                llist.head = llist_head;
            }
            
            //Code to delete a node at a specific position
            position = scanner.nextInt();
            llist.head = deleteNode(llist.head, position);

            //Call to Method to print out the Linked List
            printSinglyLinkedList(llist.head);
            scanner.close();
        }
    }
}
