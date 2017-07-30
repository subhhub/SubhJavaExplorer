package in.org.subh.shunya;

public class ThreadGroupParentChild
{
    public static void main(String[] args)
    {
        //Creating Parent Thread Group 
 
        ThreadGroup parentGroup = new ThreadGroup("Parent Thread Group");
 
        //Adding threads to ThreadGroup while creating threads itself
 
        Thread t1 = new Thread(parentGroup, "Thread 1");
 
        Thread t2 = new Thread(parentGroup, "Thread 2");
 
        //Creating child thread group
 
        ThreadGroup childGroup = new ThreadGroup(parentGroup, "Child Thread Group");
 
        //Adding a thread to child thread group
 
        Thread t3 = new Thread(childGroup, "Thread 3");
        
        //Printing parent of Child Thread Group
        System.out.println(childGroup.getParent());   //Output : java.lang.ThreadGroup[name=Parent Thread Group ,maxpri=10]
    }
}