package ae;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int n = 5;
		int i=0;
	    ArrayList<Prova> lista = new ArrayList<Prova>(n);
	    Prova p1 = new Prova();
	    p1.setNota(30);
	    p1.setNome("Prova1");
	    p1.setAutor("Jose");
	    lista.add(p1);
	    Prova p2 =  new Prova();
	    p2.setAutor("Maria");
	    p2.setNome("Prova dificil");
	    p2.setNota(80);
	    Prova p3 = new Prova();
	    p3.setAutor("Eu");
	    p3.setNome("Minha prova");
	    p3.setNota(50);
	    lista.add(p2);
	    lista.add(p3);
	    QuickSort ob = new QuickSort(); 
	    ob.sort(lista, 0, lista.size()-1);
	    } 
	}
