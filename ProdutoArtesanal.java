import java.util.Comparator;

public class ProdutoArtesanal extends Produto{
    private static float comissao = 0.2f;

    public ProdutoArtesanal(String nome, float valorDeCompra, float valorDeVenda, int qtdEstoque, int qtdVendido, float imposto, float taxaImportacao) {
        super(nome, valorDeCompra, valorDeVenda, qtdEstoque, qtdVendido, imposto);
    }

    public ProdutoArtesanal(int id, String nome, float valorDeCompra, float valorDeVenda, int qtdEstoque, int qtdVendido, float imposto, float taxaImportacao) {
        super(id, nome, valorDeCompra, valorDeVenda, qtdEstoque, qtdVendido, imposto);
    }

    public float getComissao() {
		return comissao;
	}

    @Override
	public String toString() {
		String str = super.toString();
		str += String.format("\nComissão: %s", this.getComissao());

		return str;
	}

    @Override
    public float obterLucro() {
        return (this.getValorDeVenda() - this.getImposto() - this.getValorDeCompra()) * (1 - this.getComissao());
    }
}