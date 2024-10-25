import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StringToInt {
    public static void main(String[] args) throws CustomFileNotFoundException {
        try {
            String num = "a";
            System.out.println(Integer.parseInt(num));
        } catch (NumberFormatException e) {
            try (BufferedWriter log = new BufferedWriter(new FileWriter("logs.txt", true))) {
                log.write("Невозможно преобразовать строку в число - " + e.getMessage());
            } catch (IOException ex) {
                System.out.println("Ошибка при записи в лог-файл");
            }
        }
    }
}

// throw - может вызвать потенциальное исключение