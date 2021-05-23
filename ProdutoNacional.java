
public class ProdutoNacional extends Produto {
	
	private String nomeFornecedor;
	
	public ProdutoNacional(String nome, float valorDeCompra, float valorDeVenda, int qtdEstoque, int qtdVendido, float imposto, float taxaImportacao, String nomeFornecedor) {
        super(nome, valorDeCompra, valorDeVenda, qtdEstoque, qtdVendido, imposto);
        this.nomeFornecedor = nomeFornecedor;
    }
	
	public ProdutoNacional(int id, String nome, float valorDeCompra, float valorDeVenda, int qtdEstoque, int qtdVendido,
			float imposto, String nomeFornecedor) {
		super(id, nome, valorDeCompra, valorDeVenda, qtdEstoque, qtdVendido, imposto);
		this.nomeFornecedor = nomeFornecedor;
	}

	// METODOS GETTERS E SETTER	

	public String getNomeFornecedor() {
		return nomeFornecedor;
	}

	public void setNomeFornecedor(String nomeFornecedor) {
		this.nomeFornecedor = nomeFornecedor;
	}
	
	
	@Override
	public float obterLucro() {
		return this.getValorDeVenda() - this.getImposto() - this.getValorDeCompra();
	}
}
