package Ninja;

/**
 * @author Plínio Oliveira
 * @version 1.0
 * @since Release 1 da aplicação.
 */

public class Funcionario {
    private String nome;
    private String matricula;
    private Double salario;

    /**
     * Metodo para retorno do nome.
     * @return String - Nome do funcionário.
     */

    public String getNome(){
        return this.nome;
    }

    /**
     * Metodo para cadastrar funcionário.
     * Recebe nome do funcionário.
     */

    public void setNome(String nome){
        this.nome=nome;
    }

    /**
     * Metodo para retorno da matrícula.
     * @return String - Numero da matrícula.
     */

    public String getMatricula() {
        return this.matricula;
    }
    /**
     * Metodo para cadastrar da matrícula.
     * Recebe valor da matrícula.
     */
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }

    /**
     * Metodo para retorno do salário.
     * @return Double - Salário do funcionário.
     */

    public Double getSalario(){
        return this.salario;
    }

    /**
     * Metodo para cadastro do salário.
     * Recebe valor do salário do funcionário.
     */

    public void setSalario(Double salario){
        this.salario=salario;
    }
}
