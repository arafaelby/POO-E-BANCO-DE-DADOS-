public class interruptor {
    boolean ligado = false;

    void pressionar() {
        ligado = !ligado;
    }

    void verificarLampada() {
        if (ligado == true) {
            System.out.println("A luz está acesa");
        } else {
            System.out.println("A luz está apagada");

        }
    }
}