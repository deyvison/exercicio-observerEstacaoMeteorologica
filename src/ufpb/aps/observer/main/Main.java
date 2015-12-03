package ufpb.aps.observer.main;

import ufpb.aps.observer.central.EstacaoMeteorologica;
import ufpb.aps.observer.central.EstacaoListener;
import ufpb.aps.observer.listener.BoletimMeteorologico;
import ufpb.aps.observer.listener.PrevisaoTempo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EstacaoMeteorologica central = new EstacaoMeteorologica();
		
		EstacaoListener boletim = new BoletimMeteorologico();
		EstacaoListener previsao = new PrevisaoTempo();
		
		central.add(boletim);
		central.add(previsao);
		
		central.novoEvento(40);
	}

}
