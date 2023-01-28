import java.io.BufferedReader;
import java.io.InputStreamReader;

//第十三題
public class App13 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input_array = bf.readLine().split("");
        for (int i = 0; i < input_array.length / 2; i++) {
            System.out.println(input_array[i] + input_array[input_array.length -1 - i]);
            if (Integer.parseInt(input_array[i]) != Integer.parseInt(input_array[input_array.length -1 - i])) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        
    }
}