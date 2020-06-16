package LocadoraCarro;

public class Carro {
	
	private String modelo;
	private String marca;
	private int ano;
	private double diaria;
	private boolean alugado;
	
	public Carro(String modelo, String marca, int ano, double diaria) {
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.diaria = diaria;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public int getAno() {
		return ano;
	}
	
	public double getDiaria() {
		return diaria;
	}
	
	public boolean isAlugado() {
		if(this.modelo.equals(modelo) && this.marca.equals(marca) && this.ano == ano) {
			return true;
		} else {
			return false;
		}
	}
	
	private void SetAlugado(boolean alugado) {
		this.alugado = alugado;
	}

}
