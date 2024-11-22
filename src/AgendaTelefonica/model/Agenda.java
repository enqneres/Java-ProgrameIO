package AgendaTelefonica.model;

public class Agenda {
    private Contato contato;

    public Agenda(Contato contato){
        this.contato = contato;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public void imprimirDados(){
        System.out.println("Dados da Agenda:");
        contato.imprimirDados();
    }
}
