package ae;

import java.util.ArrayList;

public class QuickSort {
	int partition(ArrayList<Prova> lista, int primeiro, int topo) 
    { 
        Prova pivo = lista.get(topo);
        int i = (primeiro-1);
        for (int j=primeiro; j<topo; j++) 
        { 
            if (lista.get(j).nota <= pivo.nota){ 
                i++; 
                Prova temp = lista.get(i); 
                lista.set(i,lista.get(j)); 
                lista.set(j, temp);
            } 
        } 
        Prova temp = lista.get(i+1); 
        lista.set(i+1, lista.get(topo)); 
        lista.set(topo, temp); 
        return i+1; 
    } 
    void sort(ArrayList<Prova> lista, int base, int topo){ 
        if (base < topo){ 
            int pi = partition(lista, base, topo); 
            sort(lista, base, pi-1); 
            sort(lista, pi+1, topo); 
        } 
    } 
}
