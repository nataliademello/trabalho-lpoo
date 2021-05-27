import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Loja implements Operacoes {
    private String nome;
    private String cnpj;
    private ArrayList<Produto> produtos;

    public Loja(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.produtos = new ArrayList<Produto>();
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

    public void relatorioGeral() {
        ArrayList<Produto> produtos = this.buscarTodos();
        Collections.sort(produtos, Produto.comparaPorNome());
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void relatorioPorTipo() {
        ArrayList<ProdutoImportado> importados = new ArrayList<ProdutoImportado>();
        ArrayList<ProdutoNacional> nacionais = new ArrayList<ProdutoNacional>();
        ArrayList<ProdutoArtesanal> artesanais = new ArrayList<ProdutoArtesanal>();
        for (Produto produto : this.buscarTodos()) {
            if (produto instanceof ProdutoImportado) {
                importados.add((ProdutoImportado) produto);
            }

            else if (produto instanceof ProdutoNacional) {
                nacionais.add((ProdutoNacional) produto);
            }

            else {
                artesanais.add((ProdutoArtesanal) produto);
            }
        }

        Collections.sort(importados, Produto.comparaPorQtdVendidos());
        Collections.sort(nacionais, Produto.comparaPorQtdVendidos());
        Collections.sort(artesanais, Produto.comparaPorQtdVendidos());
        Collections.reverse(importados);
        Collections.reverse(nacionais);
        Collections.reverse(artesanais);

        for (ProdutoImportado produto : importados) {
            System.out.println(produto);
        }
        for (ProdutoNacional produto : nacionais) {
            System.out.println(produto);
        }
        for (ProdutoArtesanal produto : artesanais) {
            System.out.println(produto);
        }

    }

    public void relatorioPorLucro(float lucro) {
        ArrayList<Produto> produtos = this.buscarTodos();
        Collections.sort(produtos, Produto.comparaPorLucro());
        Collections.reverse(produtos);
        for (Produto produto : produtos) {
            if (produto.obterLucro() >= lucro) {
                System.out.println(produto);
            }
            else {
                break;
            }
        }
    }
    
}
