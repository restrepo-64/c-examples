import java.util.*;
import java.util.Scanner;

class LinkedList {
   //dynamic size
   //set up node and next
  class Node{
      public Integer data;
      public Node next;
      
      public Node(Integer datavalue) {
         next = null;
         data = datavalue;
      }
   }

  int listsize;
   public Node front;
  public LinkedList() {
      front=null;
      listsize=0;
       //System.out.println("here is front");
   }
   
  public boolean isEmpty() {
      boolean empty = false;
      if(front == null) {
         empty = true;
         System.out.println("list is empty yo");
      }
      return empty;
  }   
   
   /*make front null
  public void init() {
     
      
   }*/
   /*
   //make new node(change front and null)
      public Node makeNode(int n){
      Node newNode= new Node(n);
      System.out.println("here is node " + newNode);
      return newNode;
   }*/
   
   public void addToFront(int n) {
      if (front == null) {
         front = new Node(n);
         //listsize++;
         //System.out.println("here is first node " + front.data);
      }
      else {
      Node temp;
      temp = front;
      front = new Node(n);
      front.next = temp;
      
      //System.out.println("here is first node " + front.data);
      listsize++;
      }
   }
   
   public void removeFront() {
      front = front.next;
      listsize--;
   }
   
   public void printList() {
      Node current;
      current=front;
      int j=0;
      System.out.print("here is linked list contents: ");
            
      for(j=0; j<=listsize; j++) {
         System.out.print(current.data + ", ");
         current=current.next;
      }
      System.out.print("\n");
   }
   public Node findTail(){
      Node current;
      current = front;
      while(current.next != null) {
         current=current.next;
      }
     
      //System.out.println("this is tail: " + current.data);
       return current;
   }
   
    public void addLast(int n) {
          if (front == null) {
         front = new Node(n);
         //listsize++;
        // System.out.println("here is first node " + front.data);
      }

        else{   
         Node tail=findTail();
         Node newNode = new Node(n);
         tail.next = newNode;
         newNode.next = null;
         listsize++;
      }
   } //YASSSS
   
   public void removeLast() {
      Node tail = findTail();
      Node um = null;
      Node current = front;
      while(current.next != null) {
         if(current.next == tail) {
            um = current;
         }
         current = current.next;
      }
      um.next = null;
      listsize--;
   }
   
  //insert in middle
  public void insertAfter(int position, Integer value) {
      if(position == 0) {
         addToFront(value);
      }
      else if(position == (listsize)) {
         addLast(value);
      }
      else {
         int j;
         for (j=0; j<= listsize-1; j++) {
             Node current = front; //print out current node as you're iterating //trace the code and write it out
            if ((j+1) == position) {
               Node temp;
              
               Node newNode = new Node(value);
               temp = current.next;
               current.next = newNode;
               newNode.next = temp;
               listsize++;
               //System.out.println("here is insert: " + current.data);
            }
         
         else {
               current=current.next;
         }
         }
      }
  }
  
   public void deleteAt(int position) {
               int j;
               
         if(position==0) {
            removeFront();
         }
         else if(position == listsize) {
            removeLast();
         }
         else{
         for (j=0; j<= listsize-1; j++) {
             Node current = front;
            if ((j+1) == position) {
              // Node temp;
               System.out.println("here is going bye bye: " + (current.next).data + " at position " + position + ", " + j);
              current.next=(current.next).next;
               
               listsize--;
              
            }
         
         else {
               current=current.next;
         }
         }
      }
  }

   
   
   //find tail to find length
 /* public Node findTail(Node front){
      //start at front and iterate until next is null
      Node index;
      index = front;
      while(index.next!=null){
         index=index.next;
      }
      return index;
   }
   */
   
   //use tail to populate list
 /* public void showList(Node front){
      
      Node index;
      index=front;
      while(index.next!=null){
         System.out.print(index + " ");
         index=index.next;
      }
      System.out.print(index + " ");
   }
   */
   
}//


public class FunWithLists {
   public static void main(String args[]){
      LinkedList hello = new LinkedList();
     /* hello.addToFront(0);
      hello.addToFront(1);
      hello.addToFront(12);
      hello.printList();
      hello.findTail();
      hello.addLast(4);
      hello.removeFront();
      hello.removeLast();
      hello.insert(1,5);
      hello.printList();*/
      int j;
      for( j=0; j<10; j++) {
         hello.addLast(j);
    }
      hello.printList();
     hello.insertAfter(5,99);
     hello.printList();
     hello.deleteAt(2);
     hello.printList();
      
      //want to add a node?
     /* Scanner reader= new Scanner(System.in);
         System.out.println("How many nodes?");
         
         int q= reader.nextInt();
         System.out.println("you chose: " + q); */
      
      //want to delete a node?
      
      
      
    /*  Node current = new Node(front.data);
      int j=0;
      System.out.print("here is linked list contents: ");
            
      for(j=0; j<listsize; j++) {
         System.out.print(current.data);
         current=current.next;
      } */
      //how to initialize list? LinkedList lettucesee = new LinkedList
   }
}

//} //here