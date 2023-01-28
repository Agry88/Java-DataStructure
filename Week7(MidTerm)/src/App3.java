import java.io.BufferedReader;
import java.io.InputStreamReader;

//第三題
public class App3 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bfReader.readLine();
        int remainder = Integer.parseInt(input) % 12;
        if (remainder == 0) {
            System.out.println("monkey");
        }
        if (remainder == 1) {
            System.out.println("chicken");
        }
        if (remainder == 2) {
            System.out.println("dog");
        }
        if (remainder == 3) {
            System.out.println("pig");
        }
        if (remainder == 4) {
            System.out.println("rat");
        }
        if (remainder == 5) {
            System.out.println("cow");
        }
        if (remainder == 6) {
            System.out.println("tiger");
        }
        if (remainder == 7) {
            System.out.println("rabbit");
        }
        if (remainder == 8) {
            System.out.println("dragon");
        }
        if (remainder == 9) {
            System.out.println("snake");
        }
        if (remainder == 10) {
            System.out.println("horse");
        }
        if (remainder == 11) {
            System.out.println("sheep");
        }
    }

}
