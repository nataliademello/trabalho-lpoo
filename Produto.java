import java.util.Comparator;

public abstract class Produto {
    private static int contId = 0;
    private int id;
    private String nome;
    private float valorDeCompra;
    private float valorDeVenda;
    private int qtdEstoque;
    private int qtdVendido;
    private float imposto;

    public Produto(String nome, float valorDeCompra, float valorDeVenda, int qtdEstoque, int qtdVendido, float imposto){
        this.id = Produto.contId++;
        this.nome = nome;
        this.valorDeCompra = valorDeCompra;
        this.valorDeVenda = valorDeVenda;
        this.qtdEstoque = qtdEstoque;
        this.qtdVendido = qtdVendido;
        this.imposto = imposto;
    }

    public Produto(int id, String nome, float valorDeCompra, float valorDeVenda, int qtdEstoque, int qtdVendido, float imposto){
        this.id = id;
        this.nome = nome;
        this.valorDeCompra = valorDeCompra;
        this.valorDeVenda = valorDeVenda;
        this.qtdEstoque = qtdEstoque;
        this.qtdVendido = qtdVendido;
        this.imposto = imposto;
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public float getValorDeCompra() {
        return valorDeCompra;
    }

    public void setValorDeCompra(float valorDeCompra) {
        this.valorDeCompra = valorDeCompra;
    }

    public float getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(float valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    public int getQtdVendido() {
        return qtdVendido;
    }

    public void setQtdVendido(int qtdVendido) {
        this.qtdVendido = qtdVendido;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQtdEstoque(){
        return this.qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque){
        this.qtdEstoque = qtdEstoque;
    }

    public float getImposto(){
        return this.imposto;
    }

    public void setImposto(float imposto){
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        String str = String.format("id: %d\n", this.getId());
        str += String.format("Nome: %s\n", this.getNome());
        str += String.format("Valor de compra: %.2f\n", this.getValorDeCompra());
        str += String.format("Valor de venda: %.2f\n", this.getValorDeVenda());
        str += String.format("Quantidade em estoque: %d\n", this.getQtdEstoque());
        str += String.format("Quantidade vendido: %d\n", this.getQtdVendido());
        str += String.format("Imposto: %.2f", this.getImposto());

        return str;
    }

    public abstract float obterLucro();

}

