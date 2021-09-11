package teste;

import agenda.Agenda;
import agenda.Contato;
import exception.ContatoNaoEncontradoException;

public class AgendaTeste {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contato c1 = new Contato("Cláudio", 123, "claudio@gmail.com");
        Contato c2 = new Contato("Clóvis", 1234, "clovis@gmail.com");
        Contato c3 = new Contato("Adalto", 12345, "adalto@gmail.com");
        agenda.adicionaContato(c1);
        agenda.adicionaContato(c2);
        agenda.adicionaContato(c3);
        try {
            agenda.pesquisaNome("Andrey");
        }
        catch(ContatoNaoEncontradoException e) {
            e.printStackTrace();
        }
        finally {
            agenda.removeContato(0);
            agenda.removeContato(1);
            agenda.removeContato(2);
        }
    }
}
