package edu.escuelaing.arep.ASE.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Esta clase ejecuta todo el programa, calculando la media y la desviacion estandar.
 * 
 * @author Natalia Palacios
 *
 */
public class App {
	
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
    	LinkedList list1 = new LinkedList();
    	LinkedList list2 = new LinkedList();
    	BufferedReader br = new BufferedReader(new FileReader("prueba.txt"));
        String s = null;
        while((s = br.readLine()) != null) {
        	double numero = Double.parseDouble(s);
        	list1.insert(numero);
        	list2.insert(numero);
		}
		double media = media(list1);
		double desviacion = desviacion(list2,media);
		System.out.println("Media: " + String.format("%.1f", media));
		System.out.println("Desviacion: " + String.format("%.6f",desviacion));
	}
    
    /**
     * Calcula la media de una lista de numeros.
     * @param list Lista donde estan los numeros para calcular la media.
     * @return La media de la lista.
     */
    public static double media(LinkedList list) {
    	int size = list.tamano;
    	double suma = 0; double promedio;
    	for(int i = 0; i < size; i++) {
    		suma += list.get();
    	}
    	promedio = suma/(double)size;
    	return promedio;
    }
    
    /**
     * Calcula la desviacion estandar de una lista de numeros.
     * @param list Lista donde estan los numeros para calcular la desviacion.
     * @param med Media hallada anteriormente.
     * @return Desviacion estandar de la lista de numeros.
     */
    public static double desviacion(LinkedList list, double med) {
    	double sumatoria = 0;
    	int size = list.tamano;
    	for(int i = 0; i < size; i++) {
    		sumatoria += Math.pow(list.get() - med, 2);
    	}
    	double division = sumatoria/(double)(size-1);
    	double desviacion = Math.pow(division, (double)1/2);
    	return desviacion;
    }
}
