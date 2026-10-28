/*
 * This is thw linkedlist class
 */
package donate4life;

/**
 *
 * @author User
 */
public class linkedlist {
    
  String name;
  int age;
  
  linkedlist()
  {
   setItem(null,0);
}

 linkedlist(String name, int age)
 {
     setItem(name,age);
}

 void setItem(String name, int age)
 {
     this.name = name;
     this.age = age;
    }
    
  public String getName()
  {
      return name;
    }
    int getAge()
    {
        return age;
    }
    
  public String toString()
{
  return "\nName : " + name + "Age : " + age;
}

   
}


