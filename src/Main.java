public class Main {
    public static void main(String[] args) {
        int sum1 = 0; // четные и отрицательные
        int sum2 = 0; // нечетные и отрицательные
        for (String x : args) {
            //Вывод всех заданных параметров командной строки
            /* преобразвание строки, хранящейся в переменной "х" в целое число
            и проверка этого числа на чётность*/
            if ((Integer.parseInt(x) % 2 == 0) & (Integer.parseInt(x) < 0)) {
                sum1 = sum1 + Integer.parseInt(x);
            } else {
                if (Integer.parseInt(x) < 0) {
                    sum2 = sum2 + Integer.parseInt(x);
                }
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }
}