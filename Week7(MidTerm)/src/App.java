import java.io.BufferedReader;
import java.io.InputStreamReader;

//第一題
public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String[] input_array  = bfReader.readLine().split("");
        StringBuilder stringbuilder = new StringBuilder();
        int ans = 0;
        for (int i = 0; i < input_array.length; i++) {
            for (int j = i; j < input_array.length; j++) {
                stringbuilder.append(input_array[j]);
                int temp = Integer.parseInt(stringbuilder.toString());
                if (isprime(temp) && temp > ans) {
                    ans = temp; 
                }
            }
            stringbuilder.setLength(0);
        }
        System.out.println("子字串中最大的質數值為"+(ans == 0 ? "No Prime Found" : ans));
    }

    public static boolean isprime(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0 && i != number) {
                return false;
            }
        }
        return true;
    }

}
