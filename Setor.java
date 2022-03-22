package Ninja;

/**
 * @author Plínio Oliveira
 * @version 1.0
 * @since Release 1 da aplicação.
 */

public class Setor {
    private String codSetor;
    private String nomSetor;

    /**
     * Metodo para retorno do código do setor.
     * @return String - Código do setor.
     */

    public String getCodSetor() {
        return codSetor;
    }

    /**
     * Metodo para retorno do nome do setor.
     * @return String - Nome do setor.
     */

    public String getNomSetor() {
        return nomSetor;
    }

    /**
     * Metodo para cadastrar código do setor.
     * Recebe código do setor.
     */

    public void setCodSetor(String codSetor) {
        this.codSetor = codSetor;
    }

    /**
     * Metodo para cadastrar nome do setor.
     * Recebe nome do setor.
     */

    public void setNomSetor(String nomSetor) {
        this.nomSetor = nomSetor;
    }
}
