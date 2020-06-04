package entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	
	private Date dataFabricacao;
	SimpleDateFormat stf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ProdutoUsado() {
		super();
	}

	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String etPreco() {
		return super.getNome() + " (used), $" + String.format("%.2f", super.getPreco()) + " (Data de Fabricação: " + stf.format(dataFabricacao)+ ")";
	}
}
