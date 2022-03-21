package Ninja;

/**
 * @author Plínio Oliveira
 * @version 1.0
 * @since Release 1 da aplicação.
 */

public class Produto {
    private String codProduto;
    private String NomProduto;

    /**
     * Metodo para retorno do código do produto.
     * @return String - Código do produto.
     */

    public String getCodProduto() {
        return codProduto;
    }

    /**
     * Metodo para retorno do nome do produto.
     * @return String - Nome do produto.
     */

    public String getNomProduto() {
        return NomProduto;
    }

    /**
     * Metodo para cadastrar código do produto.
     * Recebe código do produto.
     */

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    /**
     * Metodo para cadastrar nome do produto.
     * Recebe nome do produto.
     */

    public void setNomProduto(String nomProduto) {
        NomProduto = nomProduto;
    }
}
