public class App {
    public static void main(String[] args) throws Exception {
        Symulation sym = new Symulation(100);
        for (int index = 0; index < 10; index++) {
            sym.nextRoll();
            sym.currentState();
        }
    }
}
