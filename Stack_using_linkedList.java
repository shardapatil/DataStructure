package com.nm.linkedliststack;

import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int e)
    {
        data=e;
        next=null;
    }
}

public class DynamicStackExample {

	 Node tos;   
	  void createStack()
	  {
	     tos=null;
	  }
	  void Push(int e)
	  {
	      Node n=new Node(e);
	      if(tos==null)
	         tos=n;//only for 1st
	      else
	      {
	          n.next=tos;//1
	          tos=n;//2
	          System.out.println("Pushed");
	      }
	  }
	  void Pop()
	  {
	      if(tos==null)
	          System.out.println("Empty Stack");
	      else
	      {
	          Node t=tos;
	         tos=tos.next;
	          System.out.println("Element Poped:"+t.data);
	      }
	  }
	  
	  void printStack()
	  {   if(tos==null)
	          System.out.println("Empty Stack");
	      else
	      {   Node t=tos;//1
	          while(t !=null)//2
	          {
	              System.out.println(t.data);
	              t=t.next;
	          }
	      }
	  }
	  
	  public boolean isStackEmpty()
		{
			if(tos == null)
				return true;
			else
				return false;
		}
		
	  int peek()
	    {
		    Node t=tos;
	        return(t.data);
	    }
	  
	  public static void main(String args[])
	    {
	        int ch,e,size;
	       // StackMenuDriven obj=new StackMenuDriven();
	        DynamicStackExample ob = new DynamicStackExample();
	        Scanner in=new Scanner(System.in);
	        do
	        {
	           System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n:");
	           ch=in.nextInt();
	           switch(ch)
	           {
	               case 1:
	            	   
	            	   System.out.println("Enter element:");
                       e=in.nextInt();
                       ob.Push(e);
	                       break;
	                case 2:
	                       if(ob.isStackEmpty()!=true)//not Empty
	                       {
	                           ob.Pop();
	                           //System.out.println("Element poped:");
	                       }
	                       else
	                       {
	                           System.out.println("Stack Empty");
	                       }
	                       break;
	                case 3:
	                       if(ob.isStackEmpty()!=true)//not Empty
	                       {
	                           e=ob.peek();
	                           System.out.println("Element @ peek is:"+e);
	                       }
	                       else
	                       {
	                           System.out.println("Stack Empty");
	                       }
	                       break;
	                case 4:
	                       if(ob.isStackEmpty()!=true)//not Empty
	                       {
	                          System.out.println("Elements on stack");
	                          ob.printStack();
	                       }
	                       else
	                       {
	                           System.out.println("Stack Empty");
	                       }
	                       break;  
	                default:
	                    System.out.println("Wrong option");
	                    break;
	                case 0:
	                    System.out.println("Exiting ");
	                    break;
	           }//switch         
	           }while(ch!=0);
	    }
}
