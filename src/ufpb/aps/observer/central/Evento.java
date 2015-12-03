package ufpb.aps.observer.central;

public class Evento {
	
	private EstacaoMeteorologica source;
	private int temperatura;
	
	public Evento(EstacaoMeteorologica central, int temperatura) {
		this.source = central;
		this.temperatura = temperatura;
	}
	
	public EstacaoMeteorologica getSource(){
		return this.source;
	}
	public int getTemperatura(){
		return this.temperatura;
	}
}
