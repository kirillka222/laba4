public class AVG {
    public static void main(String[] args) {
        try{
            double sum = 0;
            for (int num = 0; num < args.length; num++) {
                sum += Double.valueOf(args[num]);
            }
            double avg = sum / args.length;
            System.out.println(avg);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вышли за границу массива");
        } catch (NumberFormatException e ) {
            System.out.println("Элемент массива не является числом");
        }
    }
}
