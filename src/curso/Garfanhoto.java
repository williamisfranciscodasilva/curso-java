package curso;

public class Garfanhoto extends Pessoa{
	
	public Garfanhoto(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}
	
	private String login;
	private int totAssistido;
	
	public void viuMasUm() {}

	
	

	public String getLogin() {
		return login;
	}




	public void setLogin(String login) {
		this.login = login;
	}




	public int getTotAssistido() {
		return totAssistido;
	}




	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}




	@Override
	public String toString() {
		return "Garfanhoto [" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + "]";
	}





}
