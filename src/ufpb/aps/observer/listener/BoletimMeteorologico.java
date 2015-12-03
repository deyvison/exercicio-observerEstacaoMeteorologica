package ufpb.aps.observer.listener;

import ufpb.aps.observer.central.EstacaoListener;
import ufpb.aps.observer.central.Evento;

public class BoletimMeteorologico implements EstacaoListener {

	@Override
	public void novoEvento(Evento e) {
		System.out.println("Boletim recebeu o evento");
		// pega os dados que lhe interessa
	}

}
