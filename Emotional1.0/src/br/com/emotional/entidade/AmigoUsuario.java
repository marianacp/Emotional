package br.com.emotional.entidade;

public class AmigoUsuario {
	private boolean confirmacao; 
	private int id_solicitante;
	private int id_solicitado;
	
	public boolean isConfirmacao() {
		return confirmacao;
	}
	public void setConfirmacao(boolean confirmacao) {
		this.confirmacao = confirmacao;
	}
	public int getid_solicitante() {
		return id_solicitante;
	}
	public void setid_solicitante(int id_solicitante) {
		this.id_solicitante = id_solicitante;
	}
	public int getid_solicitado() {
		return id_solicitado;
	}
	public void setid_solicitado(int id_solicitado) {
		this.id_solicitado = id_solicitado;
	} 
	
	@Override
	public String toString() {
		String saida = "Amigo: " + id_solicitante + "confirmacao: " + confirmacao; 
		return saida;
	}
}
