/*

Para cada produto informado (nome, preço e
quantidade), escreva o nome do produto
comprado e o valor total a ser pago,
considerando que são oferecidos descontos
pelo número de unidades compradas, segundo
a tabela abaixo:

Até 10 unidades: valor total
de 11 a 20 unidades: 10% de desconto
de 21 a 50 unidades: 20% de desconto
acima de 50 unidades: 25% de desconto

 */

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal(){
        double valorTotal = preco * quantidade;
        if (quantidade > 50){
            valorTotal *= 0.75; // 25% de desconto
        } else if (quantidade >= 21) {
            valorTotal *= 0.80; // 20% de desconto
        } else if (quantidade >= 11) {
            valorTotal *= 0.90; // 10% de desconto
        }
        return valorTotal;
    }

    public void imprimirDetalhes(){
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor total: R$ " + calcularValorTotal());
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3000.00, 15);
        Produto produto2 = new Produto("Mouse", 50.00, 25);
        Produto produto3 = new Produto("Teclado", 100.00, 5);

        produto1.imprimirDetalhes();
        produto2.imprimirDetalhes();
        produto3.imprimirDetalhes();
    }
}