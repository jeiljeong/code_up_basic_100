import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1008 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        double a, b;
        a = Double.parseDouble(st.nextToken());
        b = Double.parseDouble(st.nextToken());

        System.out.println(a / b);
        br.close();
    }
}