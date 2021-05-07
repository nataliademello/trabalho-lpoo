public abstract class Produto{
    private int id;
    private String nome;
    private float valor;
    private int qtdEstoque;
    private float imposto;

    public Produto(int id, String nome, float valor, int qtdEstoque, float imposto){
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;
        this.imposto = imposto;
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public float getValor(){
        return this.valor;
    }

    public void setValor(float valor){
        this.valor = valor;
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

    public abstract float obterLucro();


}

