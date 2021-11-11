package tarefa023;

import java.util.Objects;

public class Bairro {

	private String nome;
	
	public Bairro(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object bairro) {
		Bairro outro = (Bairro)bairro;
		if(outro.getNome().equalsIgnoreCase(this.nome)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Bairro [nome=" + nome + "]";
	}
	
	
}
