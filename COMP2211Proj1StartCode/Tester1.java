public class Tester1{
    //count the number of nodes with the letter a
    public static int countA(BinaryTree tree){ 
        if (tree.emptyTree()){
            return 0;
        }
            
        else if(tree.getRoot() == 'A'){
            return 1 + countA(tree.getLeft()) + countA(tree.getRight());
        }
         
        else{
            return countA(tree.getLeft()) + countA(tree.getRight());
        }
    }
    
    //count the number of leavves in the tree
    public static int countLeaves(BinaryTree tree){
        if(tree.emptyTree() == true)
            return 0;
        
        else if(tree.getLeft().emptyTree() || tree.getRight().emptyTree()){
            return 1 + countLeaves(tree.getLeft()) + countLeaves(tree.getRight());
        }
            
        else{
            return countLeaves(tree.getLeft()) + countLeaves(tree.getRight());
        }
    }
    
    //output the tree in post order format
    public static String postOrder(BinaryTree tree){
        if(tree.emptyTree()){
            return "";
        }
        
        else{
            return postOrder(tree.getLeft()) + " " + postOrder(tree.getRight()) + " " + tree.getRoot();
        }
    }
    
    //output the tree in in-order format
    public static String inOrder(BinaryTree tree){
        if(tree.emptyTree() == true){
            return "";
        }
        
        else{
            return inOrder(tree.getLeft()) + " " + tree.getRoot() + " " + inOrder(tree.getRight());
        }
    }
    
    //put the codes above together
    public static void main(String []args){
        BinaryTree t = new BinaryTree(new Node('C')); //will be used to determine # of a
        t.insertNode('A', 0);
        t.insertNode('F', 1);
        t.getLeft().insertNode('A', 0);
        t.getRight().insertNode('Z', 1);
        
        System.out.println("countA = " + countA(t));
        
        BinaryTree tr = new BinaryTree(new Node('+')); //Root
        tr.insertNode('/', 0); //Left Sub-Tree
        tr.getLeft().insertNode('*', 0);
        tr.getLeft().getLeft().insertNode('2', 0);
        tr.getLeft().getLeft().insertNode('3', 1);
        tr.getLeft().insertNode('-', 1);
        tr.getLeft().getRight().insertNode('2', 0);
        tr.getLeft().getRight().insertNode('1', 1);
        tr.insertNode('*', 1); //Right Sub-Tree
        tr.getRight().insertNode('5', 0);
        tr.getRight().insertNode('-', 1);
        tr.getRight().getRight().insertNode('4', 0);
        tr.getRight().getRight().insertNode('1', 1);
                        
        System.out.println("countLeaves = " + countLeaves(tr));
        System.out.println("inOrder = " + inOrder(tr));
        System.out.println("postOrder = " + postOrder(tr));
        System.out.println(tr.toString());         
    }  
}