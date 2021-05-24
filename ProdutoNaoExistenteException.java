public class ProdutoNaoExistenteException extends RuntimeException {
    
    @Override
    public String getMessage() {
        return "Não existe um produto com este id.";
    }
}