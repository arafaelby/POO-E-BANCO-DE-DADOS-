package EXERCICIO2;

public class TestarLivro {
    public static void main(String[] args){
        Livro LivroDracula = new Livro(" Dracula ","Bram Stoker", 1897);
        System.out.println("É lançamento? " + LivroDracula.IsLancamento());
        System.out.println(LivroDracula.getDescricaoCompleta());
    }
}
