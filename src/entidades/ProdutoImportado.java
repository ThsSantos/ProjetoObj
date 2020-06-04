package entidades;

public class ProdutoImportado extends Produto{
	
	private Double taxaAl;
	
	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double taxaAl) {
		super(nome, preco);
		this.taxaAl = taxaAl;
	}

	public Double getTaxaAl() {
		return taxaAl;
	}

	public void setTaxaAl(Double taxaAl) {
		this.taxaAl = taxaAl;
	}
	
	private Double precoTotal() {
		 return preco = preco + taxaAl;

	}
	
	@Override
	public String etPreco() {
		return  super.getNome() + ", $" + String.format("%.2f", precoTotal()) + " (Valor da taxa alfândegaria: $" + String.format("%.2f", taxaAl) + ")";
	}
}
