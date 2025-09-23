package EXERCICIO1;
public class MainProduto {
    public static void main(String[] args) {
        Produto produtoEspelho = new Produto();
        produtoEspelho.nome = "espelho";
        produtoEspelho.preco = 70.99;
        produtoEspelho.informarNome();
        produtoEspelho.informarPreco();
        produtoEspelho.fazerPromocao();
        produtoEspelho.informarPreco();
    }
}


