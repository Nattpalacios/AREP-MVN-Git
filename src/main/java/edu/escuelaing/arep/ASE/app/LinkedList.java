package edu.escuelaing.arep.ASE.app;

public class LinkedList {
	public Node head;
	public int tamano;
	
	public LinkedList() {
		tamano = 0;
		head = null;
	}
	  
    
    
    public void insert(double data) { 
    	
        Node new_node = new Node(data); 
        new_node.next = null; 
 
        if (head == null) { 
            head = new_node; 
        } 
        else { 
        	
            Node last = head; 
            while (last.next != null) { 
                last = last.next; 
            } 
 
            last.next = new_node; 
        } 
        tamano += 1;
    }
    
    public double get() {
    	
    	Node temp = head;
    	head = head.next;
    	tamano -= 1;
    	return temp.data;
    }
    
}
