package br.com.emotional.Pattern;

import java.util.ArrayList;
import java.util.List;

import br.com.emotional.entidade.Musica;

public abstract class OrdernadorTemplate {
	public abstract boolean isPrimeiro(Musica musica1, Musica musica2);
	
	public List<Musica> ordenarMusica(List<Musica> lista) {
        List<Musica> novaLista = new ArrayList<Musica>();
        for (Musica musicaMP3 : lista) {
            novaLista.add(musicaMP3);
        }
 
        for (int i = 0; i < novaLista.size(); i++) {
            for (int j = i; j < novaLista.size(); j++) {
                if (!isPrimeiro(novaLista.get(i), novaLista.get(j))) {
                	Musica temp = novaLista.get(j);
                    novaLista.set(j, novaLista.get(i));
                    novaLista.set(i, temp);
                }
            }
        }
 
        return novaLista;
    }
}
