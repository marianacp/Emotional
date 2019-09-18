package br.com.emotional.entidade;


/*
 * Classe responsável por criar instância de faleconosco
 */
public class FaleConosco {
	private int idFaleConosco; 
	private String email; 
	private String pergunta; 
	private String resposta; 
	private int idAdm;
	private String nome; 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId_fale_conosco() {
		return idFaleConosco;
	}
	public void setId_fale_conosco(int idFaleConosco) {
		this.idFaleConosco = idFaleConosco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	public int getId_adm() {
		return idAdm;
	}
	public void setId_adm(int idAdm) {
		this.id_adm = idAdm;
	} 
}
