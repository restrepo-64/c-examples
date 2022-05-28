import java.util.*;
import java.util.Scanner;

class Tree {
  
  class treeNode {
   public int dupes; //number of duplicates
   public Integer data;
   public Node left;
   public Node right;
   public Node parent;
   
   public treeNode(Integer x) {
      data = x;
      left = null;
      right = null;
      parent = null;
   }
}

  
   public treeNode root;
   
   public int numnodes;
   
   public Tree() {
      treeNode root = new treeNode(null);
      numnodes = 0;
   }
   
   public void setLeft(treeNode x, Integer num) {
      
      if (root==null) {
         root= new treeNode(num);
      }
      else {
         x.left = new treeNode(num);
      }
      
   }
    public void setRight(treeNode x, Integer num) {
      
      if (root==null) {
         root= new treeNode(num);
      }
      else {
         x.right = new treeNode(num);
      }
      
   }

   public Tree buildTree (Integer[] array) {
      Tree hickory = new Tree();
      int index=0;
      Integer s = array[index];
      int compares= 0;
      
      //while there is data in list
      while(index <= array.length) {
        // index = getIntData();
        
        //empty tree exception
        if (root == null) {
         root = new treeNode(index);
        }
        //find numbers position in tree
        else {
         treeNode curr = root;
         boolean searching = true;
         while (searching = true) {
            if(s < curr.data) {
               compares++;
               if(curr.left!=null) {
               compares++;
                  curr = curr.left;
               } 
               else {
               compares++;
                  searching = false;
               }
               
            }
            else {
               if(curr.right != null) {
               compares++;
                  curr = curr.right;
               }
               else {
               compares++;
                  searching = false;
               }
            }
            
         }//end while searching
         
         //add number to tree
         if(s < curr.data){
         compares++;
            setLeft(curr, s);
                     }
         else {
         compares++;
            setRight(curr, s);
         }
         
        }//end else
      index++;
      }//end while data in list
      System.out.println("number of comparisons: " + compares);
      return hickory;
   }
   
  public void inOrder(treeNode t){
      if(t.left != null){
         inOrder(t.left);
      }
      System.out.print(t.data + " ");
      if(t.right!=null) {
         inOrder(t.right);
      }
   }
   
}


public class TreeDooHickey {
   
    public static void main(String args[]){
      //Tree hickory = new Tree();
      
      Scanner reader = new Scanner(System.in);
      System.out.println("How many nodes in tree?");
      int size = reader.nextInt();
      System.out.println("you have typed in: " + size);
      System.out.println("what " + size + "  numbers would you like in tree? Separate with spaces please " );
      Integer[] list = new Integer[size];
      for(int j=0; j<=size; j++) {
         list[j] = reader.nextInt();
         //System.out.println("list location " + j + " is now " + list[j]);
      }
        Tree.buildTree(list);
        
        
        hickory.inOrder(root);
      
      
     // System.out.print("node is: " + root.data + ", and # of nodes is " + numnodes);
   }
}