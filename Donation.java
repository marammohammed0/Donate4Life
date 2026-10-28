/*
 * This is the Donation class 
 */
package donate4life;

public class Donation {
     private Node root;
 
  
public Node getRoot()
{
return root;
}

public void insert(Object item)
 { 
	
	Node pwalk, parent;
 
    Node newNode = new Node(item,null,null);
    
 
    if ( root == null)
     root = newNode;
     else
    {
        
     pwalk = root;
     parent = root;
     while ( pwalk != null) 
    {  
        parent = pwalk; 
        if ( newNode.compareTo(pwalk) < 0)
         pwalk = pwalk.left; 
       else
        pwalk = pwalk.right; 
     }
    
     if (newNode.compareTo(parent)< 0 ) 
            parent.left = newNode;
      else parent.right = newNode;
    } 
} 


}
