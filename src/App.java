public class App {
    public static void main(String[] args) throws Exception {
        Blop[] blops = new Blop[1000]; 
        for (int i = 0; i < 1000; i++) {
            blops[i] = new Blop(true);
        }
    }
}
