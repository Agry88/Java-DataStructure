import java.io.BufferedReader;
import java.io.InputStreamReader;

//第二題
public class App2 {
    public static void main(String[] args) throws Exception {
        BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bfReader.readLine();
        double[] ans = getprice(Integer.parseInt(input));
        System.out.println("Summer Months:"+ans[0]);
        System.out.println("Non-Summer Months:"+ans[1]);
    }

    public static double[] getprice(int degree) {
        double[] ans = new double[] {0 , 0};

        if (degree >= 701) {
            ans[0] += ( degree - 700 ) * 5.63;
            ans[1] += ( degree - 700 ) * 4.50;
            degree = 700;
        }

        if (degree >= 501 && degree <= 700) {
            ans[0] += ( degree - 500 ) * 4.97;
            ans[1] += ( degree - 500 ) * 4.01;
            degree = 500;
        }

        if (degree >= 331 && degree <= 500) {
            ans[0] += ( degree - 330 ) * 4.39;
            ans[1] += ( degree - 330 ) * 3.61;
            degree = 330;
        }

        if (degree >= 121 && degree <= 330) {
            ans[0] += ( degree - 120 ) * 3.02;
            ans[1] += ( degree - 120 ) * 2.68;
            degree = 120;
        }

        if (degree <= 120) {
            ans[0] += degree * 2.10;
            ans[1] += degree * 2.10;
        }

        return ans;
    }

}
