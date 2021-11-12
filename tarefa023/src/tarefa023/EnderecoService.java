package tarefa023;

import java.util.List;

public class EnderecoService implements IEnderecoService{

	private EnderecoRepository repository = new EnderecoRepository();

	@Override
	public List<Logradouro> consultaPorTipo(TipoLogradouro tipoLogradouro) {
		return repository.consultaPorTipoDeLogradouro(tipoLogradouro);
	}

	@Override
	public List<Endereco> consultaPorTipo(TipoEndereco tipoEndereco) {
		return repository.consultaPorTipoDeEndereco(tipoEndereco);
	}

	@Override
	public List<Endereco> consultaPorCep(int cep) {
		return repository.consultaPorCep(cep);
	}

	@Override
	public List<Endereco> consultaPorLogradouro(Logradouro logradouro) {
		return repository.consultaPorLogradouro(logradouro);
	}

	@Override
	public List<Endereco> consultaPorBairro(Bairro bairro) {
		return repository.consultaPorBairro(bairro);
	}

	@Override
	public List<Endereco> consultaPorCidade(Cidade cidade) {
		return repository.consultaPorCidade(cidade);
	}

	@Override
	public List<Cidade> listaCidadesPorEstado(Estado estado) {
		return repository.consultaPorEstado(estado);
	}

	@Override
	public List<Estado> consultaPorPais(Pais pais) {
		return repository.consultaPorPais(pais);
	}

	public void saveEndereco(Endereco endereco) {
		repository.saveEndereco(new CadastroEndereco(endereco));
	}
}
