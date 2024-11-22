package NerdLocadora;

public class Filme {
    private String titulo;
    private double precoBase = 4.00;

    public Filme(String titulo){
        this.titulo = titulo;
    }

    public double calcularPreco(){
        return precoBase;
    }

    public String getTitulo(){
        return titulo;
    }
}
