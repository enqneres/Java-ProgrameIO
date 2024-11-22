package AgendaTelefonica.view;

import AgendaTelefonica.model.Agenda;
import AgendaTelefonica.model.Contato;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato("Celular", "98765-4321");

        Agenda agenda = new Agenda(contato);

        agenda.imprimirDados();
    }
}
