package edu.escuelaing.arep.ASE.app;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class AppTest{
	@Test
	public void deberianCalcularseBienLaMediayDesviacionDeLaPrimeraColumna() throws IOException {
		LinkedList list1 = new LinkedList();
    	LinkedList list2 = new LinkedList();
    	BufferedReader br = new BufferedReader(new FileReader("primerTest.txt"));
        String s = null;
        while((s = br.readLine()) != null) {
        	double numero = Double.parseDouble(s);
        	list1.insert(numero);
        	list2.insert(numero);
		}
		double media = App.media(list1);
		double desviacion = App.desviacion(list2,media);
		assertEquals(String.format( "%.2f", media),"550.60");
        assertEquals(String.format( "%.2f", desviacion),"572.03");
        br.close();
	}
	
	@Test
	public void deberianCalcularseBienLaMediayDesviacionDeLaSegundaColumna() throws IOException {
		LinkedList list1 = new LinkedList();
    	LinkedList list2 = new LinkedList();
    	BufferedReader br = new BufferedReader(new FileReader("segundoTest.txt"));
        String s = null;
        while((s = br.readLine()) != null) {
        	double numero = Double.parseDouble(s);
        	list1.insert(numero);
        	list2.insert(numero);
		}
		double media = App.media(list1);
		double desviacion = App.desviacion(list2,media);
        assertEquals(String.format( "%.2f", media),"60.32");
        assertEquals(String.format( "%.2f", desviacion),"62.26");
        br.close();
	}
}
