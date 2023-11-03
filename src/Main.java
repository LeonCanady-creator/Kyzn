import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("src/INPUT.txt"));
        int counter = 0;
        double N = sc.nextDouble();
        double Bx = sc.nextDouble();
        double By = sc.nextDouble();
        double L = sc.nextDouble();
        for (int i = 0; i < N; i++) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double distance = Math.sqrt(Math.pow(x - Bx, 2) + Math.pow(y - By, 2));
            if (distance<=L) {
                String s = String.valueOf(i + 1);
                Files.writeString(Path.of("OUTPUT"), s);
                break;}
            else if(i == N-1)
            {
                Files.writeString(Path.of("OUTPUT"), "YES");
            }
        }

    }
}

