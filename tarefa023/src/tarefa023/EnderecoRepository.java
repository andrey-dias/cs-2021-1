package tarefa023;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EnderecoRepository {
	private static List<CadastroEndereco> enderecosCadastrados = new ArrayList<CadastroEndereco>();
	
	public void saveEndereco(CadastroEndereco endereco) {
		enderecosCadastrados.add(endereco);
	}
	
	public List<Logradouro> consultaPorTipoDeLogradouro(TipoLogradouro tipoLogradouro) {
		return enderecosCadastrados.stream()
							.filter(e -> e.getEndereco().getLogradouro().getTipoLogradouro() == tipoLogradouro)
							.map(e -> e.getEndereco().getLogradouro())
							.collect(Collectors.toList());
	}
	
	
	public List<Endereco> consultaPorTipoDeEndereco(TipoEndereco tipoEndereco) {
		return enderecosCadastrados.stream()
									.filter(e -> e.getEndereco().getTipoEndereco() == tipoEndereco)
									.map(e -> e.getEndereco())
									.collect(Collectors.toList());
	}

	public List<Endereco> consultaPorLogradouro(Logradouro logradouro) {
		return enderecosCadastrados.stream()
									.filter(e -> e.getEndereco().getLogradouro().equals(logradouro))
									.map(e -> e.getEndereco())
									.collect(Collectors.toList());
	}

	public List<Endereco> consultaPorBairro(Bairro bairro) {
		return enderecosCadastrados.stream()
									.filter(e -> e.getEndereco().getBairro().equals(bairro))
									.map(e -> e.getEndereco())
									.collect(Collectors.toList());
	}

	public List<Endereco> consultaPorCidade(Cidade cidade) {
		return enderecosCadastrados.stream()
				.filter(e -> e.getEndereco().getCidade().equals(cidade))
				.map(e -> e.getEndereco())
				.collect(Collectors.toList());
	}

	public List<Cidade> consultaPorEstado(Estado estado) {
		return enderecosCadastrados.stream()
				.filter(e -> e.getEndereco().getEstado().equals(estado))
				.map(e -> e.getEndereco().getCidade())
				.collect(Collectors.toList());
	}

	public List<Estado> consultaPorPais(Pais pais) {
		return enderecosCadastrados.stream()
				.filter(e -> e.getEndereco().getPais().equals(pais))
				.map(e -> e.getEndereco().getEstado())
				.collect(Collectors.toList());
	}

	public List<Endereco> consultaPorCep(int cep) {
		return enderecosCadastrados.stream()
				.filter(e -> e.getEndereco().getCEP() == cep)
				.map(e -> e.getEndereco())
				.collect(Collectors.toList());
	}
	
}
