package br.com.emotional.entidade;

public class AmigoUsuario {
	private boolean confirmado; 
	private int cd_solicitante;
	private int cd_solicitado;
	public boolean isConfirmado() {
		return confirmado;
	}
	public void setConfirmado(boolean confirmado) {
		this.confirmado = confirmado;
	}
	public int getCd_solicitante() {
		return cd_solicitante;
	}
	public void setCd_solicitante(int cd_solicitante) {
		this.cd_solicitante = cd_solicitante;
	}
	public int getCd_solicitado() {
		return cd_solicitado;
	}
	public void setCd_solicitado(int cd_solicitado) {
		this.cd_solicitado = cd_solicitado;
	} 
	
	@Override
	public String toString() {
		String saida = "Amigo: " + cd_solicitante + "Confirmado: " + confirmado; 
		return saida;
	}
}
