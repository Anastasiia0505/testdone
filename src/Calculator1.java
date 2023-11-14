import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);//класс сканер (считывает введенные числа с консоли)
        String input= scanner.nextLine();// считывается в одну строку
        System.out.println(calc(input));

    }
        public static String intToRoman (int num){
        int [] number= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        String[] numberR= { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        int y= 0;
        for (int i=0; i<number.length; i++){
            if (number[i]==num){
                y=i;
                break;
            }
        }

        return numberR[y];
        }

    public static int romanToInt (String num){
        int [] number= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
                21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100};
        String[] numberR= { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        int y= 0;
        for (int i=0; i<numberR.length; i++){
            if (numberR[i].equals(num)){
                y=i;
                break;
            }
        }

        return number[y];
    }
    public static boolean isRoman (String str){
        if (str.equals("I") ||str.equals("II") || str.equals("III") || str.equals("IV") || str.equals("V") ||
                str.equals("VI") || str.equals("VII") || str.equals("VIII") || str.equals("IX") || str.equals("X")){
            return true;
        }
            return false;
    }
    public static String calc(String input) throws Exception {
        String[] parts= input.split(" ");// метод split, Разбить строку по пробелу на части
        if (parts.length==5) {
            if ((parts[1].equals("+") || parts[1].equals("-") || parts[1].equals("*") || parts[1].equals("/"))
                    && (parts[3].equals("+") || parts[3].equals("-") || parts[3].equals("*") || parts[3].equals("/"))) {
                throw new Exception("т.к. формат математической операции не удовлетворяет заданию - " +
                        "два операнда и один оператор (+, -, /, *)");
            }
        }
        if (parts.length==3){
            if (isRoman(parts[0])&&isRoman(parts[2])){
                int a= romanToInt(parts[0]);
                int b= romanToInt(parts[2]);
                if (a<0 || a>10 || b<0 || b >10)
                    throw new Exception(" т.к. вы ввели неверные значения");
                else {
                    if (parts[1].equals("+")){
                        return (intToRoman(a+b));
                    } else if (parts[1].equals("-")) {
                        if (a>b){
                            return (intToRoman(a-b));
                        }
                        throw new Exception("т.к. в римской системе нет отрицательных чисел" );
                    } else if (parts[1].equals("*")) {
                        return (intToRoman(a*b));
                    } else if (parts[1].equals("/")) {
                        if (b==0){
                            throw new Exception("т.к. на нуль делить нельзя");}
                        else {
                            return (intToRoman(a/b));
                        }
                    }
                }

            } else if (!isRoman(parts[0])&&!isRoman(parts[2])){
                int a=Integer.parseInt(parts[0]);
                int b=Integer.parseInt(parts[2]);
                if (a<0 || a>10 || b<0 || b >10){
                    throw new Exception("т.к. вы ввели неверные значения");
                } else {
                    if (parts[1].equals("+")){
                        return String.valueOf(a+b);
                    } else if (parts[1].equals("-")) {
                        return String.valueOf(a-b);
                    } else if (parts[1].equals("*")) {
                        return String.valueOf(a*b);
                    } else if (parts[1].equals("/")) {
                        if (b==0){
                            throw new Exception("т.к. на нуль делить нельзя");}
                        else {
                            return String.valueOf(a/b);
                        }
                    }
                }
            } else if (!isRoman(parts[0])&&isRoman(parts[2]) || isRoman(parts[0])&&!isRoman(parts[2])) {
                throw new Exception("т.к. используются одновременно разные системы счисления");
            }
        }else {
            throw new Exception("т.к. строка не является математической операцией");
        }
        return null;
    }

}

