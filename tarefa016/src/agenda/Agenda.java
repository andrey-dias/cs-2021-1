package agenda;

import agenda.Contato;
import exception.ContatoNaoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    List<Contato> contatos = new ArrayList<>();
    public void adicionaContato(Contato contato) {
        contatos.add(contato);
    }
    public void removeContato(int index) {
        contatos.remove(index);
    }
    public Contato pesquisaNome(String nome) throws ContatoNaoEncontradoException {
        for(Contato c: contatos ) {
            if(c.nome.equals(nome)) {
                return c;
            }
        }
        throw new ContatoNaoEncontradoException();
    }

}
