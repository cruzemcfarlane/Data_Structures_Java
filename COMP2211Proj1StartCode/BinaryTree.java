/***
 * Class representing the binary tree ADT
 ***/

public class BinaryTree
{
   // data members
   private Node root;     // root of the tree

   // CONSTRUCTOR
   public BinaryTree()
   {
         root = null;
   }

   public BinaryTree(Node n)
   {
        root = n;
   }

   // INSPECTORS

   /***
    * Determines the left subtree of the tree
    *
    * @return the left subtree
    ***/

   public BinaryTree getLeft()
   {
       BinaryTree t = root.getLeftChild();

       return t;
   }

   /***
    * Determines the right subtree of the tree
    *
    * @return the right subtree
    ***/
   public BinaryTree getRight()
   {
       BinaryTree t = root.getRightChild();

       return t;
   }

   /***
    * Determines whether the tree is empty or not
    *
    * @return true if the tree is empty
    ***/
   public boolean emptyTree()
   {
       return (root == null);
   }

   /***
    * Determines whether two trees are identical
    *
    * @param t another tree
    * @return true if the two trees are equal
    ***/
   public boolean equals(BinaryTree t)
   {

       if ( root == null &&  t.emptyTree() )
           return true;

       if ( (t.emptyTree() && root != null) ||
            (root == null && !t.emptyTree()) )
          return false;

       return (   (t.getRoot() == root.getData()) &&
                  t.getLeft().equals(getLeft()) &&
                  t.getRight().equals(getRight()) );
   }

   /***
    * Determines the content of the root of the tree
    *
    * @return the content of the root
    ***/
   public char getRoot()
   {
       return root.getData();
   }

   /***
    * Determines the size of the tree
    *
    * @return the number of nodes in the tree
    ***/
   public int getSize()
   {
       if (root == null)
          return 0;

       return (getLeft().getSize() + getRight().getSize()+1);
   }

    /***
     * produces a string representation of the tree
     *
     * @return a string representation of the tree
     ***/
    public String toString()
    {
        if (root == null)
            return " ";
        else
            return root.getData()+ " ( " + getLeft().toString() + " )   ( "+ getRight().toString()+ " )";
    }

   // MODIFIERS

   /***
    * insert a new node in the tree
    *
    * @param c the character to be inserted in the new node
    * @param flag the position for the insertion (0=left, 1=right)
    ***/
   public void insertNode(char c, int flag)
   {
       BinaryTree b;
       Node n;

       if (flag != 0 && flag != 1)
       {
          System.out.println("ILLEGAL FLAG IN OPERATION");
          return;
       }
    
       n = new Node(c);
       if (root == null)
	   {
	       root = n;
	   }
       else if (flag == 0)
       {
	   if (root.getLeftChild().emptyTree())
	       root.setLeftChild(new BinaryTree(n));
            else
                System.out.println("Left Tree Already Present");
       }
       else 
       {
	   if (root.getRightChild().emptyTree())
	       root.setRightChild(new BinaryTree(n));
            else
                System.out.println("Right Tree Already Present");
       }
   }

   /***
    * delete a subtree
    *
    * @param flag the position for the deletion (0=left, 1=right)
    ***/
   public void deleteSubtree(int flag)
   {
       if (flag != 0 && flag != 1)
       {
           System.out.println("Incorrect Flag");
           return;
       }
       
       if (flag == 0)
       {
           root.setLeftChild(new BinaryTree());
       }
       else

       {
           root.setRightChild(new BinaryTree());
       }
   }

   /***
    * creates a copy of the tree
    *
    * @return a copy of the tree
    ***/
    public BinaryTree copyTree()
    {
        if (root == null)
	    return new BinaryTree();
 
        Node n = new Node(root.getData());
        n.setLeftChild(getLeft().copyTree());
        n.setRightChild(getRight().copyTree());
        return (new BinaryTree(n));
    }
    /*
    public static void main(String[] args){
        BinaryTree t = new BinaryTree(new Node('*'));
        //Node root = new Node('a');
        t.insertNode('a', 0);
        t.insertNode('b', 1);
        //(Node)t.getLeft().setLeftChild('c');
        //t.getLeft().insertNode('d', 1);
        //t.getRight().insertNode('e', 0);
        //t.getRight().insertNode('f', 0);

        //Node n = new Node('b');
        //root.setLeftChild(new BinaryTree(n));
        //t.insertNode('c', 1);
        System.out.println(t.toString());
        t.insertNode('d', 0);
        System.out.println(t.toString());
    }*/
}
