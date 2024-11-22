package NerdLocadora;

public class FilmeLancamento extends Filme {
    private static final double ACRESCIMO = 3.00;

    public FilmeLancamento(String titulo) {
        super(titulo);
    }

    @Override
    public double calcularPreco(){
        return super.calcularPreco() + ACRESCIMO;
    }
}
