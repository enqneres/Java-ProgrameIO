/*
1. Crie uma classe Cliente com os atributos nome, cpf, telefone, sexo e ano de nascimento
Crie os métodos para:
- imprimir todos os dados do cliente
- calcular a idade do cliente
- verificar se ele é maior ou menor de idade

 */

import java.time.LocalDate;
import java.time.Period;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String sexo;
    private int anoNascimento;

    public Cliente(String nome, String cpf, String telefone, String sexo, int anoNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.sexo = sexo;
        this.anoNascimento = anoNascimento;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Sexo: " + sexo);
        System.out.println("Ano de Nascimento: " + anoNascimento);
    }

    public int calcularIdade(){
        LocalDate dataAtual = LocalDate.now();
        return Period.between(LocalDate.of(anoNascimento, 1, 1), dataAtual).getYears();
    }

    public boolean isMaiorDeIdade(){
        return calcularIdade() >= 18;
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("João Silva", "009.456.789.00", "(91) 98165-4321", "Masculino", 2000);
        cliente.imprimirDados();
        System.out.println("Idade: " + cliente.calcularIdade());
        System.out.println("Maior de idade: " + (cliente.isMaiorDeIdade() ? "Sim" : "Não"));
    }
}
