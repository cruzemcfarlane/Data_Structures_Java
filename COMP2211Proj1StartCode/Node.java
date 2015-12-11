/***
 * Class used to represent one node of a binary tree
 * the node can store a character
 ***/

public class Node
{
   // data members (private)
   private char data;            // the character stored in the node
   private BinaryTree left;            // left child
   private BinaryTree right;           // right child

   // OPERATIONS

   // CONSTRUCTOR
   /***
    * Creates a new node, storing a given data
    *    the new node has no children to start with
    *
    * @param d the character to be stored in the node
    ***/
   public Node(char d)
   {
      data = d;
      left = new BinaryTree();
      right = new BinaryTree();
   }

   // INSPECTORS

   /***
    * Read the data stored in the node
    *
    * @return the character stored in the node
    ***/
   public char getData()
   {
       return data;
   }

   /***
    * Read the left child of the node
    *
    * @return the reference to the left child
    ***/
   public BinaryTree getLeftChild()
   {
       return left;
   }

   /***
    * Read the right child of the node
    *
    * @return the reference to the right child
    ***/
   public BinaryTree getRightChild()
   {
       return right;
   }

   // MODIFIERS

   /***
    * Modify the data part of the node
    *
    * @param d the new character to be stored in the node
    ***/
   public void setData(char d)
   {
       data = d;
   }

   /***
    * Modify the left child part of the node
    *
    * @param l the new left child
    ***/
   public void setLeftChild(BinaryTree l)
   {
       left = l;
   }

   /***
    * Modify the right child part of the node
    *
    * @param r the new right child
    ***/
   public void setRightChild(BinaryTree r)
   {
       right = r;
   }
}