package NerdLocadora;

public class FilmeInfantil extends Filme {
    private static final double ACRESCIMO = 2.00;

    public FilmeInfantil(String titulo) {
        super(titulo);
    }

    @Override
    public double calcularPreco(){
        return super.calcularPreco() + ACRESCIMO;
    }
}
