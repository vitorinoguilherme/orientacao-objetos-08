package exercicios;

import exercicios.ControleDeBonificacoes;
import exercicios.Funcionario;
import exercicios.Gerente;

public class GerenteTest {
    public static void main(String[] args) {
        // --------------- Herança --------------
        Gerente gerente = new Gerente();

        // podemos chamar os métodos de funcionário
        gerente.setNome("Bruce Wayne");

        String nome = gerente.getNome();
        System.out.println(nome);

        // podemos chamar os métodos de Gerente
        gerente.setSenha(1234);

        // --------------- Polimorfismo --------------
        // Exemplo 1
        Gerente gerente1 = new Gerente();
        Funcionario funcionario = gerente1;
        funcionario.setSalario(5000.0);

        double salario = funcionario.getBonificacao();
        System.out.println(salario);

        // Exemplo 2
        ControleDeBonificacoes controle = new ControleDeBonificacoes();

        Gerente funcionario1 = new Gerente();
        funcionario1.setSalario(5000.0);
        controle.registra(funcionario1);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setSalario(1000.0);
        controle.registra(funcionario2);

        System.out.println("\n"+ controle.getTotalDeBonificacoes());
    }
}
