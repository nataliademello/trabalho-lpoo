import java.util.ArrayList;
import java.util.Iterator;

public class Loja implements Operacoes {
    private String nome;
    private String cnpj;
    private ArrayList<Produto> produtos;

    public Loja(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public void inserir(Produto produto) throws ProdutoJaExistenteException {
        for (Produto prod : this.produtos) {
            if (produto.getId() == prod.getId()) {
                throw new ProdutoJaExistenteException();
            }
        }

        this.produtos.add(produto);
        
    }

    @Override
    public ArrayList<Produto> buscarTodos() {
        return this.produtos;
    }

    @Override
    public Produto buscarPorId(int id) throws ProdutoNaoExistenteException{
        Produto produto = null;
        for (Produto prod : this.produtos) {
            if (id == prod.getId()) {
                produto = prod;
            }
        }

        if (produto == null) {
            throw new ProdutoNaoExistenteException();
        }

        return produto;

    }

    @Override
    public void remover(int id) throws ProdutoNaoExistenteException {
        boolean encontrou = false;
        Iterator<Produto> it = this.produtos.iterator();
        while (it.hasNext()) {
            Produto prod = it.next();
            if (id == prod.getId()) {
                it.remove();
                encontrou = true;
                break;
            }
        }

        if (encontrou == false) {
            throw new ProdutoNaoExistenteException();
        }
    }
    
}
