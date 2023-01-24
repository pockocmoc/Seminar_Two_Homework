package task_1;
/*
/ Реализовать функцию возведения числа, а в степень b. a, b ∈ Z.
Сводя количество выполняемых действий к минимуму.
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        Writer();
    }

    static String Reader() {
        double a = 0.0;
        double b = 0.0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            String str;
            while ((str = br.readLine()) != null) {
                String[] equal = str.split(" ");
                switch (equal[0]) {
                    case "a" -> a = Integer.parseInt(equal[1]);
                    case "b" -> b = Integer.parseInt(equal[1]);
                }
            }
            br.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        if (a == 0.0 && b == 0.0) {
            return "ERROR";
        } else {
            return Double.toString(Math.pow(a, b));
        }
    }

    static void Writer() {
        try (FileWriter fw = new FileWriter("output.txt", false)) {
            fw.write(Reader());
            fw.flush();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
