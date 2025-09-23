public class Produto {
    String nome;
    double preco;

    void informarNome(){
        System.out.println("o nome do produto é " + nome);
    }
    void informarPreco() {
        System.out.println("o preço do produto é " + preco);
    }
    void fazerPromocao() {
        preco = preco - 1;
        System.out.println("preço após desconto: ");
    }
}
