import java.io.*;

public class Copy
{
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("example.txt"));
            String bufferObmena = in.readLine();
            BufferedWriter out = new BufferedWriter(new FileWriter("exampleOut.txt"));
            out.write(bufferObmena);
            out.close();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода");
        } catch (NullPointerException e) {
            System.out.println("файл пуст");
        }
    }
}
