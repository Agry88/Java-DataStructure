import java.io.BufferedReader;
import java.io.InputStreamReader;

//第六題
public class App6 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input_array = bfReader.readLine().split("");
        String[] bigint_array = input_array;
        //用泡沫排序法先排出最大的int_array
        for (int i = 0; i < input_array.length - 1; i++) {
            for (int j = 0; j < input_array.length - 1 - i; j++) {
                int temp = Integer.parseInt(bigint_array[j]);
                int next = Integer.parseInt(bigint_array[j+1]);
                if (temp < next) {
                    bigint_array[j+1] = Integer.toString(temp);
                    bigint_array[j] = Integer.toString(next);
                }
            }
        }
        StringBuilder bigint = new StringBuilder();
        StringBuilder smallint = new StringBuilder();
        for (int i = 0; i < bigint_array.length; i++) {
            bigint.append(bigint_array[i]);
            smallint.append(bigint_array[bigint_array.length - 1 - i]);
        }
        System.out.println(Integer.parseInt(bigint.toString()) - Integer.parseInt(smallint.toString()));
    }
}