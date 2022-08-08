package com.pack.validstring;

import java.util.EmptyStackException;

public class Stack {
	
	
	
	
	private static Node top;
	private  int size;
	
	Stack min;
	
	public Stack(Node top)
	{
		super();
		this.top = null;
	}
	
	public Stack() 
	{
		
	}
	
	public void push(char data)
	{
	   Node newNode = new Node();
	   newNode.setData(data);
	   newNode.setNext(top);
	   top = newNode;  
	   size++;
	}
	
	public char top()
	{
		if(top==null)
		{
		   throw new EmptyStackException();
		}
		return top.getData();
	}
    
    public int pop()
    {
    	if(top==null)
    	{
    		throw new EmptyStackException();
    	}
    	else
    	{
    		top = top.getNext();
    		size--;
    	}
    	return size;
    }
    
	public void display() 
	{
		Node node = top;
		while(node!=null)
		{
			System.out.print(node.getData()+" ");
			node = node.getNext();
		}
	}
	
      public int size()
      {
    	  return size;
      }
         
      public boolean isEmpty()
      {
    	  if(top!=null)
    		  return false;
    	return true;
      }

	public char peek() {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
}

	


