package Entities;

public class ProdutoImportado extends Produto {

    private Double taxaAlfandegaria;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, Double preco, Double alfandega) {
        super(nome, preco);
        this.taxaAlfandegaria = alfandega;
    }

    public Double getAlfandega() {
        return taxaAlfandegaria;
    }

    public void setAlfandega(Double taxaAlfandegaria) {
        this.taxaAlfandegaria = taxaAlfandegaria;
    }


    @Override
    public String etiqueta() {
        return getNome() + " R$ " + (getPreco() + taxaAlfandegaria) + " (Taxa alfandegária: R$ " + String.format("%.2f", taxaAlfandegaria) + ")";
    }
}
