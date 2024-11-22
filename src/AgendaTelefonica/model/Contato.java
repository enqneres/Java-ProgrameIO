package AgendaTelefonica.model;

public class Contato {
    private String tipo;
    private String numero;

    public Contato(String tipo, String numero){
        this.tipo = tipo;
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void imprimirDados(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Número: " + numero);
    }
}
