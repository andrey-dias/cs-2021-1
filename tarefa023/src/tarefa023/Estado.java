package tarefa023;

import java.util.Objects;

public class Estado {
	
	private String nome;

	public Estado(String nome) {
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
		Estado other = (Estado) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Estado: [\nnome=" + nome + "]\n\n";
	}
	
}
