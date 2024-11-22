package NerdLocadora;

public class FilmePromocao extends Filme {
    private static final double DESCONTO = 2.00;

    public FilmePromocao(String titulo) {
        super(titulo);
    }

    @Override
    public double calcularPreco(){
        return super.calcularPreco() - DESCONTO;
    }
}
