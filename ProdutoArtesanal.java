
public class ProdutoArtesanal extends Produto{
    private double comissao;   
    public ProdutoArtesanal(int id, String nome, float valor, int qtdEstoque, float imposto){
        super(id, nome, valor, qtdEstoque, imposto);
        this.comissao = 0.02;

    }
    public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
    @Override
    public float obterLucro() {
        // TODO Auto-generated method stub
        return 0;
    }
}