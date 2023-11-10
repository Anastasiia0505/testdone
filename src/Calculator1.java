import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//класс сканер (считывает введенные числа с консоли)
        String input= scanner.nextLine();// считывается в одну строку
        String[] parts= input.split(" ");// метод split, Разбить строку по пробелу на части
        if (parts.length==3){
            if (isRoman(parts[0])&&isRoman(parts[2])){
                int a= romanToInt(parts[0]);
                int b= romanToInt(parts[2]);
                if (a<0 || a>10 || b<0 || b >10){
                    System.out.println(" throws Exception //т.к. вы ввели неверные значения");
                } else {
                    if (parts[1].equals("+")){
                        System.out.println(intToRoman(a+b));
                    } else if (parts[1].equals("-")) {
                        if (a>b){
                            System.out.println(intToRoman(a-b));
                        }
                        System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел" );
                    } else if (parts[1].equals("*")) {
                        System.out.println(intToRoman(a*b));
                    } else if (parts[1].equals("/")) {
                        if (b==0){
                            System.out.println("throws Exception //т.к. на нуль делить нельзя");}
                        else {
                            System.out.println(intToRoman(a/b));
                        }
                    }
                }

            } else if (!isRoman(parts[0])&&!isRoman(parts[2])){
                int a=Integer.parseInt(parts[0]);
                int b=Integer.parseInt(parts[2]);
                if (a<0 || a>10 || b<0 || b >10){
                    System.out.println("throws Exception //т.к. вы ввели неверные значения");
                } else {
                    if (parts[1].equals("+")){
                        System.out.println(a+b);
                    } else if (parts[1].equals("-")) {
                        System.out.println(a-b);
                    } else if (parts[1].equals("*")) {
                        System.out.println(a*b);
                    } else if (parts[1].equals("/")) {
                        if (b==0){
                            System.out.println("throws Exception //т.к. на нуль делить нельзя");}
                        else {
                            System.out.println(a/b);
                        }
                    }
                }
            } else if (!isRoman(parts[0])&&isRoman(parts[2]) || isRoman(parts[0])&&!isRoman(parts[2])) {
                System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
            }
        }else {
            System.out.println("throws Exception //т.к. строка не является математической операцией");
        }




    }
        public static String intToRoman (int num){
        int [] number= {100,90,80,70,60,50,40,30,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        String[] numberR= { "C","XC", "LXXX", "LXX", "LX", "L","XL","XXX","XX","IXX","XVIII","XVII","XVI","XV", "XIV","XIII","XII","XI","X","IX","VIII","VII","VI","V","IV","III","II","I"};
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
        int [] number= {100,90,80,70,60,50,40,30,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
        String[] numberR= { "C","XC", "LXXX", "LXX", "LX", "L","XL","XXX","XX","IXX","XVIII","XVII","XVI","XV"
                , "XIV","XIII","XII","XI","X","IX","VIII","VII","VI","V","IV","III","II","I"};
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


}

