package tarefa023;

import java.util.List;

public class TestaEndereco {

	public static void main(String[] args) {
		EnderecoService enderecoService = new EnderecoService();
		
		Logradouro logradouro1 = new Logradouro(TipoLogradouro.AVENIDA, "Avenida 1", 1, "A");
		Logradouro logradouro2 = new Logradouro(TipoLogradouro.AVENIDA, "Avenida 2", 2, "B");
		Logradouro logradouro3 = new Logradouro(TipoLogradouro.AVENIDA, "Avenida 3", 3, "C");
		
		Pais pais1 = new Pais("Brasil");
		Pais pais2 = new Pais("EUA");
		
		Estado estado1 = new Estado("Goiás");
		Estado estado2 = new Estado("São Paulo");
		
		Cidade cidade1 = new Cidade("Goiânia");
		Cidade cidade2 = new Cidade("Petrópolis");
		
		
		Bairro bairro1 = new Bairro("Centro"); 
		Bairro bairro2 = new Bairro("Setor Oeste");
		
		Endereco endereco1 = new Endereco(TipoEndereco.RESIDENCIAL, logradouro1, "Complemento", bairro1, 123, cidade1, estado1, pais1); 
		Endereco endereco2 = new Endereco(TipoEndereco.RESIDENCIAL, logradouro2, "Complemento", bairro1, 12345, cidade2, estado2, pais1); 
		Endereco endereco3 = new Endereco(TipoEndereco.RESIDENCIAL, logradouro1, "Complemento", bairro2, 123, cidade2, estado1, pais2);
		Endereco endereco4 = new Endereco(TipoEndereco.COMERCIAL, logradouro3, "Complemento", bairro2, 981, cidade2, estado2, pais1);
		Endereco endereco5 = new Endereco(TipoEndereco.COMERCIAL, logradouro1, "Complemento", bairro2, 678, cidade2, estado1, pais2);
		Endereco endereco6 = new Endereco(TipoEndereco.INDUSTRIAL, logradouro2, "Complemento", bairro2, 654, cidade1, estado2, pais2);
		
		enderecoService.saveEndereco(endereco1);
		enderecoService.saveEndereco(endereco2);
		enderecoService.saveEndereco(endereco3);
		enderecoService.saveEndereco(endereco4);
		enderecoService.saveEndereco(endereco5);
		enderecoService.saveEndereco(endereco6);
		
		System.out.println("CONSULTA POR TIPO DE LOGRADOURO\n");
		List<Logradouro> lista1 = enderecoService.consultaPorTipo(TipoLogradouro.AVENIDA);
		for(Logradouro l : lista1) {
			System.out.println(l);
		}
		System.out.println("-------------------------------------------------\n");
		
		System.out.println("CONSULTA POR TIPO DE ENDERECO");
		List<Endereco> lista2 = enderecoService.consultaPorTipo(TipoEndereco.RESIDENCIAL);
		for(Endereco e : lista2) {
			System.out.println(e);
		}
		System.out.println("-------------------------------------------------\n");
		
		System.out.println("CONSULTA POR CEP");
		List<Endereco> lista3 = enderecoService.consultaPorCep(123);
		for(Endereco e : lista3) {
			System.out.println(e);
		}
		System.out.println("-------------------------------------------------\n");
		
		System.out.println("CONSULTA POR LOGRADOURO");
		List<Endereco> lista4 = enderecoService.consultaPorLogradouro(logradouro1);
		for(Endereco e : lista4) {
			System.out.println(e);
		}
		System.out.println("-------------------------------------------------\n");
		
		System.out.println("CONSULTA POR BAIRRO");
		List<Endereco> lista5 = enderecoService.consultaPorBairro(bairro1);
		for(Endereco e : lista5) {
			System.out.println(e);
		}
		System.out.println("-------------------------------------------------\n");
		
		System.out.println("CONSULTA POR CIDADE");
		List<Endereco> lista6 = enderecoService.consultaPorCidade(cidade1);
		for(Endereco e : lista6) {
			System.out.println(e);
		}
		System.out.println("-------------------------------------------------\n");
		
		System.out.println("CONSULTA POR ESTADO");
		List<Cidade> lista7 = enderecoService.listaCidadesPorEstado(estado1);
		for(Cidade c : lista7) {
			System.out.println(c);
		}
		System.out.println("-------------------------------------------------\n");
		
		System.out.println("CONSULTA POR PAÍS");
		List<Estado> lista8 = enderecoService.consultaPorPais(pais1);
		for(Estado e : lista8) {
			System.out.println(e);
		}
		System.out.println("-------------------------------------------------\n");
	}
	

}
