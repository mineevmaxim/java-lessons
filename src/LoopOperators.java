public class LoopOperators {
    public static void main(String[] args) {
        var i = 0;
        while (true) {
            i++;
            if (i % 2 == 0) continue;
            if (i == 15) break;
            System.out.println(i);
        }
    }
}
