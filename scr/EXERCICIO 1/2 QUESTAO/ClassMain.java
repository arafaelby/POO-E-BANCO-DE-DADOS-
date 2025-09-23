public class ClassMain {
    public static void main(String[] args) {
        interruptor testarInterruptor= new interruptor();

        testarInterruptor.pressionar();
        testarInterruptor.verificarLampada();

        testarInterruptor.pressionar();
        testarInterruptor.verificarLampada();
    }
}
