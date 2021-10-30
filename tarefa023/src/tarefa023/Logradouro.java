package tarefa023;

import java.util.Objects;

public class Logradouro {

	private TipoLogradouro tipoLogradouro;
    private String nomeLogradouro;
    private int numero;
    private String complementoNumero;
    
    public Logradouro(TipoLogradouro tipoLogradouro, String nomeLogradouro, int numero, String complementoNumero) {
		super();
		this.tipoLogradouro = tipoLogradouro;
		this.nomeLogradouro = nomeLogradouro;
		this.numero = numero;
		this.complementoNumero = complementoNumero;
	}

	public TipoLogradouro getTipoLogradouro() {
		return this.tipoLogradouro;
	}
	
	public String getNomeLogradouro() {
		return this.nomeLogradouro;
	}
	
	public void setTipoLogradouro(TipoLogradouro tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	
	public void setNomeLogradouro(String nomeLogradouro) {
		this.nomeLogradouro = nomeLogradouro;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getComplementoNumero() {
		return this.complementoNumero;
	}
	
	public void setComplementoNumero(String complementoNumero) {
		this.complementoNumero = complementoNumero;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(complementoNumero, nomeLogradouro, numero, tipoLogradouro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Logradouro other = (Logradouro) obj;
		return Objects.equals(complementoNumero, other.complementoNumero)
				&& Objects.equals(nomeLogradouro, other.nomeLogradouro) && numero == other.numero
				&& tipoLogradouro == other.tipoLogradouro;
	}

	@Override
	public String toString() {
		return "Logradouro: [\ntipoLogradouro=" + tipoLogradouro + "\nnomeLogradouro=" + nomeLogradouro + "\nnumero="
				+ numero + "\ncomplementoNumero=" + complementoNumero + "]\n\n";
	}
}
