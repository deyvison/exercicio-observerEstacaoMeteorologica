package ufpb.aps.observer.central;

import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica {

	private List<EstacaoListener> listeners;
	
	public EstacaoMeteorologica(){
		this.listeners = new ArrayList<EstacaoListener>();
	}
	
	public void add(EstacaoListener e){
		this.listeners.add(e);
	}
	
	public void novoEvento(int temperatura){
		notificar(temperatura);
	}
	
	private void notificar(int temperatura){
		Evento evento = new Evento(this,temperatura);
		for(EstacaoListener e : this.listeners){
			e.novoEvento(evento);
		}
	}
}
