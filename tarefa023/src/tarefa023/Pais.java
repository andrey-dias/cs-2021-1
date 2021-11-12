package tarefa023;

import java.util.Objects;

public class Pais {

	private String nome;
	
	public Pais(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Pais [nome=" + nome + "]";
	}
	
}
