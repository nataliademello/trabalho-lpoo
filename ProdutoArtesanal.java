
public class ProdutoArtesanal extends Produto{
    private static double comissao = 0.2;

    public ProdutoArtesanal(String nome, float valorDeCompra, float valorDeVenda, int qtdEstoque, int qtdVendido, float imposto, float taxaImportacao) {
        super(nome, valorDeCompra, valorDeVenda, qtdEstoque, qtdVendido, imposto);
    }

    public ProdutoArtesanal(int id, String nome, float valorDeCompra, float valorDeVenda, int qtdEstoque, int qtdVendido, float imposto, float taxaImportacao) {
        super(id, nome, valorDeCompra, valorDeVenda, qtdEstoque, qtdVendido, imposto);
    }

    public double getComissao() {
		return comissao;
	}

    @Override
    public float obterLucro() {
        // TODO Auto-generated method stub
        return 0;
    }
}