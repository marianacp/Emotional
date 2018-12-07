package br.com.emotional.entidade;

/*
 * Classe responsável por criar instância de cliente
 */

public class Cliente extends Usuario{
	private int cod_ouvinte;

	public int getCod_ouvinte() {
		return cod_ouvinte;
	}

	public void setCod_ouvinte(int cod_ouvinte) {
		this.cod_ouvinte = cod_ouvinte;
	} 
}
