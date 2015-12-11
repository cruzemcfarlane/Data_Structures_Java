class BST extends BinaryTree{
   
    //insert a variable in tree
    public static void insert(BinaryTree t, char value){
        //Node key = new Node(value);
        //BinaryTree temp;
        if(t.emptyTree()){
           t.insertNode(value, 0); //insert at node or root        
        }
        
        else{
            if(value == t.getRoot()){
                return;
            }
            else if(value < t.getRoot()){
               if(t.getLeft().emptyTree()){
                   t.getLeft().insertNode(value, 0);
               }
                
               else{
                   insert(t.getLeft(), value); 
               }
            }
            
            else{
                if(t.getRight().emptyTree()){
                   t.getRight().insertNode(value, 1);
                }
                
                else{
                    insert(t.getRight(), value); 
                }
            }           
        }
    }
    
    //get the largest variable
    public static char getLargest(BinaryTree t){
      if(t.getRight().emptyTree()){        
            return t.getRoot();
      }
        
       else{
            return getLargest(t.getRight());       
       }
    }
       
    //get the smallest variable
    public static char getSmallest(BinaryTree t){
       if(t.getLeft().emptyTree()){        
            return t.getRoot();
       }
        
       else{
            return getSmallest(t.getLeft());       
       }
    }
    
    //search for a node in a tree
    public static String search(BinaryTree t, char key){
        if(t.emptyTree() && t.getRoot() != key){
            return "NULL";
        }
        
        else if((t.getRoot() == key)){            
            return ""+t.getRoot();
        }
        
        else if((t.getRoot() > key)){
            return search(t.getLeft(), key);
        }
        
        else if((t.getRoot() < key)){
            return search(t.getRight(), key);
        }
        
        else{
            return "NULL";
        }
    }
    
    public static void delete(BinaryTree t, char key){
        t = null;
        /*
        if(t.emptyTree() && t.getRoot() != key){
             return;
        }
        
        else if((t.getRoot() == key)){
            t.getRoot() = null;
        }
        
        else if((t.getRoot() > key)){
            delete(t.getLeft(), key);
        }
        
        else if((t.getRoot() < key)){
            delete(t.getRight(), key);
        }
        
        else{
            return;
        }*/
    }
    
    //output tree in In-order format
    public static String inOrder(BinaryTree t){
        if(t.emptyTree()){
            return "";
        }
        
        else{
            return inOrder(t.getLeft()) + " " + t.getRoot() + " " + inOrder(t.getRight());
        }
    }    
}
