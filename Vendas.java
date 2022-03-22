package Ninja;

/**
 * @author Plínio Oliveira
 * @version 1.0
 * @since Release 1 da aplicação.
 */

public class Vendas {
    private String codVenda;
    private String tipoVenda;

    /**
     * Metodo para retorno do código da venda.
     * @return String - código da venda.
     */

    public String getCodVenda() {
        return codVenda;
    }

    /**
     * Metodo para retorno do tipo da venda. (Crédito, Débito ou Dinheiro).
     * @return String - tipo da venda.
     */

    public String getTipoVenda() {
        return tipoVenda;
    }

    /**
     * Metodo para cadastro do código da venda.
     * Recebe valor do código da venda.
     */

    public void setCodVenda(String codVenda) {
        this.codVenda = codVenda;
    }

    /**
     * Metodo para cadastro do tipo da venda. (Crédito, Débito ou Dinheiro).
     * Recebe valor do tipo da venda.
     */

    public void setTipoVenda(String tipoVenda) {
        this.tipoVenda = tipoVenda;
    }
}
