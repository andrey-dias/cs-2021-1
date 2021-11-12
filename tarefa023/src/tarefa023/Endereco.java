package tarefa023;

public class Endereco {
	private TipoEndereco tipoEndereco;
	private Logradouro logradouro;
	private String complementoEndereco;
	private Bairro bairro;
	private Integer CEP;
	private Cidade cidade;
	private Estado estado;
	private Pais pais;
	
	public Endereco(TipoEndereco tipoEndereco, Logradouro logradouro, String complementoEndereco, Bairro bairro,
			Integer cep, Cidade cidade, Estado estado, Pais pais) {
		super();
		this.tipoEndereco = tipoEndereco;
		this.logradouro = logradouro;
		this.complementoEndereco = complementoEndereco;
		this.bairro = bairro;
		this.CEP = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.pais = pais;
	}
	
	public TipoEndereco getTipoEndereco() {
		return tipoEndereco;
	}
	public void setTipoEndereco(TipoEndereco tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}
	public Logradouro getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplementoEndereco() {
		return complementoEndereco;
	}
	public void setComplementoEndereco(String complementoEndereco) {
		this.complementoEndereco = complementoEndereco;
	}
	public Bairro getBairro() {
		return bairro;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	public Integer getCEP() {
		return CEP;
	}
	public void setCEP(Integer cEP) {
		CEP = cEP;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Endereco: [\ntipoEndereco=" + tipoEndereco + "\nlogradouro=" + logradouro + "\ncomplementoEndereco="
				+ complementoEndereco + "\nbairro=" + bairro + "\nCEP=" + CEP + "\ncidade=" + cidade + "\nestado="
				+ estado + "\npais=" + pais + "]\n\n";
	}
	
	
}
