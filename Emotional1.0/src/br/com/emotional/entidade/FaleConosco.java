package br.com.emotional.entidade;


/*
 * Classe responsável por criar instância de faleconosco
 */
public class FaleConosco {
	private int id_fale_conosco; 
	private String email; 
	private String pergunta; 
	private String resposta; 
	private int id_adm;
	private String nome; 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId_fale_conosco() {
		return id_fale_conosco;
	}
	public void setId_fale_conosco(int id_fale_conosco) {
		this.id_fale_conosco = id_fale_conosco;
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
		return id_adm;
	}
	public void setId_adm(int id_adm) {
		this.id_adm = id_adm;
	} 
}
