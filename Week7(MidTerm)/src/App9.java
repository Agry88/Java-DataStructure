import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Objects;

//第九題
public class App9 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input_array1 = bfReader.readLine().split("");
        String[] input_array2 = bfReader.readLine().split("");
        for (int i = 0; i < input_array1.length; i++) {
            if (!Objects.equals(input_array1[i], input_array2[i])) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
        
    }
}