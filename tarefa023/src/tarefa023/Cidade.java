package tarefa023;

import java.util.Objects;

public class Cidade {

	

	private String nome;
	
	public Cidade(String nome) {
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
		Cidade other = (Cidade) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Cidade: [\nnome=" + nome + "]\n\n";
	}
}
