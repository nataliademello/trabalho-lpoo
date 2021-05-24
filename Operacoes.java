import java.util.ArrayList;

public interface Operacoes {
    
    public void inserir(Produto produto) throws ProdutoJaExistenteException;
    public ArrayList<Produto> buscarTodos();
    public Produto buscarPorId(int id) throws ProdutoNaoExistenteException;
    public void remover(int id) throws ProdutoNaoExistenteException;

}
