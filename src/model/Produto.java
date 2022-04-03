package model;

public class Produto {

	private String nomeProduto;
	private double tamanhoProduto;
	private double pesoProduto;
	
	public String getNomeProduto() {
		return this.nomeProduto;
	}
	
	public double getTamanhoProduto() {
		return this.tamanhoProduto;
	}
	
	public double getPesoProduto() {
		return this.pesoProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public void setTamanhoProduto(double tamanhoProduto) {
		this.tamanhoProduto = tamanhoProduto;
	}
	
	public void setPesoProduto(double pesoProduto) {
		this.pesoProduto = pesoProduto;
	}
	
}
