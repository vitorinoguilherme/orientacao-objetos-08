package exercicios;

public class Funcionario {
    // Modificar de Acesso protected atributo pode ser acessado pela própria
    // Classe, por suas subclasses e pelas classes que se encontram no mesmo pacote.
    protected String nome;
    protected String cpf;
    protected double salario;

    // Método que foi reescrito em Gerente.
    public double getBonificacao() {
        return this.salario * 0.10;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
