package edu.escuelaing.arep.ASE.app;

/**
 * Esta clase crea una LinkedList.
 * 
 * @author Natalia Palacios.
 *
 */
public class LinkedList {
	public Node head;
	public int tamano;
	
	/**
	 * Constructor de la LinkedList.
	 */
	public LinkedList() {
		tamano = 0;
		head = null;
	}
	  
    /**
     * Inserta numeros reales a la LinkedList.
     * 
     * @param data Numero real que se va a insertar en la LinkedList.
     */
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
    
    /**
     * Retorna la cabeza de la LinkedList
     * 
     * @return el dato de la lista.
     */
    public double get() {
    	
    	Node temp = head;
    	head = head.next;
    	tamano -= 1;
    	return temp.data;
    }
    
}
