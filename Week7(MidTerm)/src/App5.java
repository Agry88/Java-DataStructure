import java.io.BufferedReader;
import java.io.InputStreamReader;

//第五題
public class App5 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入階層值M：");
        int input = Integer.parseInt(bfReader.readLine());
        int temp = 1;
        int i = 0;
        while (temp < input) {
            i++;
            temp *= i;
        }
        System.out.println("超過M的最小階層值為："+i);

    }
}