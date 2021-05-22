public class ProdutoImportado extends Produto {
    private float taxaImportacao;
    
    public ProdutoImportado(String nome, float valorDeCompra, float valorDeVenda, int qtdEstoque, int qtdVendido, float imposto, float taxaImportacao) {
        super(nome, valorDeCompra, valorDeVenda, qtdEstoque, qtdVendido, imposto);
        this.taxaImportacao = taxaImportacao;
    }

    public ProdutoImportado(int id, String nome, float valorDeCompra, float valorDeVenda, int qtdEstoque, int qtdVendido, float imposto, float taxaImportacao) {
        super(id, nome, valorDeCompra, valorDeVenda, qtdEstoque, qtdVendido, imposto);
        this.taxaImportacao = taxaImportacao;
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public float obterLucro() {
        return this.getValorDeVenda() - this.getImposto() - this.getTaxaImportacao() - this.getValorDeCompra();
    }

}
