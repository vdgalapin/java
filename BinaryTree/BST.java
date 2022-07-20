package BinaryTree;

import java.util.*;
import java.io.*;

class Node {
    int data;
    Node right;
    Node left;

    Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }
}

class BinaryTree{   
    Node root;
    
    public boolean search(int value, Node n) {
 
        if(n == null) {
            return false;
        }

        if (n.data == value) {
            return true;
        }
 
        if (n.data < value) {
            return search(value, n.right);
        } else {
            return search(value, n.left);
        }
        
    }

    public boolean contains(int value) {
        
        return search(value, root);
    }

    public Node addRecursive(Node current_node, int value) {
        
        if(current_node ==  null) {
            return new Node(value);
        }

        if(value < current_node.data) {

            current_node.left = addRecursive(current_node.left, value);

        } else if(value > current_node.data) {

            current_node.right = addRecursive(current_node.right, value);

        } else {

            return current_node;

        }
        
        return current_node;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public int findSmallestValue(Node root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }
    
    public Node deleteRecursive(Node current_node, int value) {
        
        if (current_node == null) {
            return null;
        }

        if (current_node.data == value) {
            if(current_node.left == null && current_node.right == null) {
                return null;
            }

            if (current_node.right == null) {
                return current_node.left;
            }
            
            if (current_node.left == null) {
                return current_node.right;
            }

        }

        if (current_node.data > value) {
            current_node.left = deleteRecursive(current_node.left, value);
        } else {
            current_node.right = deleteRecursive(current_node.right, value);
        }
        
        return current_node;
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }


    public void inorder(Node n) {

        if(n != null) {
            inorder(n.left);
            System.out.println(n.data);
            inorder(n.right);
          
        }

    }

    public void printTree(BinaryTree bt) {
        root = bt.root;
        inorder(root);
    }

}

public class BST {
    
    public static void main(String[] args) {
        
        BinaryTree bt = new BinaryTree();
        bt.add(50);
        bt.add(23);
        bt.add(35);
        bt.add(76);
        
        System.out.println("");
        bt.printTree(bt);
        System.out.println(bt.contains(23));

        bt.delete(23);
       
        System.out.println("");
        bt.printTree(bt);
        System.out.println(bt.contains(23));
   

      
    }
}