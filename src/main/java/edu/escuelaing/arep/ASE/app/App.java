package edu.escuelaing.arep.ASE.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
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
		System.out.println("Desviación: " + String.format("%.6f",desviacion));
	}
    
    public static double media(LinkedList list) {
    	int size = list.tamano;
    	double suma = 0; double promedio;
    	for(int i = 0; i < size; i++) {
    		suma += list.get();
    	}
    	promedio = suma/(double)size;
    	return promedio;
    }
    
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
