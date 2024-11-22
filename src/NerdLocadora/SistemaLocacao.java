package NerdLocadora;

public class SistemaLocacao {
    public static void main(String[] args) {
        Filme filmeGeral = new Filme("DeadPool 2");
        Filme filmeInfantil = new FilmeInfantil("Divertidamente");
        Filme filmeLancamento = new FilmeLancamento("Deadpool 3");
        Filme filmePromocao = new FilmePromocao("Click");

        System.out.println(filmeGeral.getTitulo() + ": R$ " + filmeGeral.calcularPreco());
        System.out.println(filmeInfantil.getTitulo() + ": R$ " + filmeInfantil.calcularPreco());
        System.out.println(filmeLancamento.getTitulo() + ": R$ " + filmeLancamento.calcularPreco());
        System.out.println(filmePromocao.getTitulo() + ": R$ " + filmePromocao.calcularPreco());
    }
}
