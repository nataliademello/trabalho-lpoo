public class ProdutoJaExistenteException extends RuntimeException {
    
    @Override
    public String getMessage() {
        return "Já existe um produto com este id.";
    }
}
