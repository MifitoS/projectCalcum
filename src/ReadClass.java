import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadClass {

    public double readNextDouble() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String i = br.readLine();
        double j = Double.parseDouble(i);

        return j;
    }
}
// ПОСМОТРЕТЬ ПОЧЕМУ ВВОДИТСЯ 2 ЗНАЧЕНИЯ
// Посмотреть как другие люди сделали калькулятор с bufferedreader
// Почему i != null всегда TRUE?
// -_- не забыть подрузить исправленный вариант на гитхаб