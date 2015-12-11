import java.util.Scanner;

public class Test2{
    public static void main(String[] args){
        BST tr = new BST();//(new Node('11')); //Root
        boolean bool = false;
        Scanner scan = new Scanner(System.in);
        String value;
        
        //prompt user to enter values
        while(! bool){
            System.out.println("Insert values (or press 'q' to quit): ");
            value = scan.nextLine();
            
            if(value.charAt(0) == 'q'){
                bool = true;
                break;
            }
            
            else{                
                BST.insert(tr, value.charAt(0));
            }
        }
        
        System.out.println();
        System.out.println("Largest = " + BST.getLargest(tr));
        System.out.println("Smallest = " + BST.getSmallest(tr));
        System.out.println("Search (#2) = " + BST.search(tr, '2'));
        System.out.println("Deleting (#4)"); //BST.delete(tr, '4');
        System.out.println("In-Order = " + BST.inOrder(tr));
    }
}