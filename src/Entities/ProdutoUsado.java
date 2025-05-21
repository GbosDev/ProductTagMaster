package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataManufatura;

    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(String nome, Double preco, Date dataManufatura) {
        super(nome, preco);
        this.dataManufatura = dataManufatura;
    }

    public Date getDataManufatura() {
        return dataManufatura;
    }

    public void setDataManufatura(Date dataManufatura) {
        this.dataManufatura = dataManufatura;
    }

    @Override
    public String etiqueta() {
        return getNome() + "(Usado)" + "R$ " + getPreco() + " (Data de manufatura: " + getDataManufatura() + ")";
    }
}
