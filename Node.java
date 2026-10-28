/*
 * This is thw Node class
 */
package donate4life;

import java.util.*;
public class Node 
{
  Object data;
  Node left;
  Node right;
 // Donation d new 
  
  Node()
  {
      setNode(null,null,null);
    }
  Node(Object data, Node l, Node r)
  {
      setNode(data,l,r);
    }
    
  void  setNode(Object data,Node left, Node right)
    {
        this.data = data;
        this.left = left;
        this.right = right;
    
    }
    
    Object getObject()
    {
        return data;
    }
    
    Node getLeft()
    {
        return left;
    }
    
    Node getRight()
    {
        return right;
    }
    
    
   }
