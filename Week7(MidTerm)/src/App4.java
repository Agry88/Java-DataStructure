import java.io.BufferedReader;
import java.io.InputStreamReader;

//第四題
public class App4 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("請輸入X軸座標：");
        int input_x = Integer.parseInt(bfReader.readLine());
        System.out.print("請輸入Y軸座標：");
        int input_y = Integer.parseInt(bfReader.readLine());

        int distance = (int)(Math.pow(input_x, 2) + Math.pow(input_y, 2));

        if (input_x < 0 && input_y > 0) {
            System.out.print("該點位於第一象限,距離原點距離為根號"+distance);
        }
        if (input_x > 0 && input_y > 0) {
            System.out.print("該點位於第二象限,距離原點距離為根號"+distance);
        }
        if (input_x < 0 && input_y < 0) {
            System.out.print("該點位於第三象限,距離原點距離為根號"+distance);
        }
        if (input_x > 0 && input_y < 0) {
            System.out.print("該點位於第四象限,距離原點距離為根號"+distance);
        }
        if (input_x < 0 && input_y == 0) {
            System.out.print("該點位於左半面X軸上");
        }
        if (input_x > 0 && input_y == 0) {
            System.out.print("該點位於右半面X軸上");
        }
        if (input_x == 0 && input_y < 0) {
            System.out.print("該點位於上半面Y軸上");
        }
        if (input_x == 0 && input_y > 0) {
            System.out.print("該點位於下半面Y軸上");
        }
        if (input_x == 0 && input_y == 0) {
            System.out.print("該點位於原點上");
        }
    }
}

