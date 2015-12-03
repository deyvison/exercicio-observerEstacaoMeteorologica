package ufpb.aps.observer.listener;

import ufpb.aps.observer.central.EstacaoListener;
import ufpb.aps.observer.central.Evento;

public class PrevisaoTempo implements EstacaoListener {

	@Override
	public void novoEvento(Evento e) {
		System.out.println("Previsão recebeu o evento");
		// pega os dados que lhe interessa 
	}

}
