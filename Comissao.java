package Ninja;

public class Comissao {
    private Double valComissao;

    /**
     * Metodo para retorno do valor da comissão.
     * @return Double - 5% do valor total do mês, mais o salário.
     */

    public Double vendasDoMes (Double totalVendas, Double salario){
        valComissao = totalVendas/100*5;
        return valComissao+salario;
    }
}
