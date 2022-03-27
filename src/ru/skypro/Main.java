package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;


public class Main {

                            //ЗАДАЧА №1
// метод для определения и вывода результата, если год високосный, в
// притивном случае, не високосный
    public static void leapYearFinder(int year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            }
        } if (year % 4 != 0) {
            if ((year % 100 != 0) || (year % 400 != 0)) {
                System.out.println(year + " год не является високосным");
            }
        }
    }

                                //ЗАДАЧА №2

    // метод определения версии ПО по году и типу ПО
    public static void findVerByYearOfProd(int teLYearOfProd, int operSyst) {
        int YearOfProd = 2015;
        String msgToLiteVer = "для скачивания облегченной версии";
        String clientForIOs = "Установите версию приложения для iOS по ссылке";
        String clientForAndroid = "Установите версию приложения для Android по ссылке";
        if (teLYearOfProd <= YearOfProd && operSyst == 0) {
            System.out.println(clientForIOs + " " + msgToLiteVer);
        } else if (teLYearOfProd <= YearOfProd && operSyst == 1) {
            System.out.println(clientForAndroid + " " + msgToLiteVer);
        } else if (teLYearOfProd >= YearOfProd && operSyst == 0) {
            System.out.println(clientForIOs);
        } else if (teLYearOfProd >= YearOfProd && operSyst == 1) {
            System.out.println(clientForAndroid);
        }
    }


    //Метод принимающий 2 значения и выдающий результат.
    public static void insertYearAndVers(int telYear, int telOperSyst) {
        String msgToLiteVer = " для скачивания облегченной версии";
        String clientForIOs = "Установите версию приложения для iOS по ссылке";
        String clientForAndroid = "Установите версию приложения для Android по ссылке";
        int currentYear = LocalDate.now().getYear();
        if (telYear < currentYear) {
            if (telOperSyst == 0) {
                System.out.println(clientForIOs + msgToLiteVer);
            } else {
                System.out.println(clientForAndroid + msgToLiteVer);
            }
        } else if (telOperSyst == 0) {
                System.out.println(clientForIOs);
            } else {
                System.out.println(clientForAndroid);
            }
        }
   // if (telYear >= currentYear) {
                    //ЗАДАЧА №3
    // метод, принимающий значение расстояния и
    // выдающий результат о количестве дней доставки
    public static void deliveryTimeCalc(int deliveryDistance) {
        int deliveryTime;
        String msg = "На доставку потребуется: ";
        String oneDay = " день";
        String moreDays = " дня";
        String days = " дней";
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println(msg + deliveryTime + oneDay);
        } else if ((deliveryDistance > 20) && (deliveryDistance <= 60)) {
            deliveryTime = 2;
            System.out.println(msg + deliveryTime + moreDays);
        } else if ((deliveryDistance > 60) && (deliveryDistance <= 100)) {
            deliveryTime = 3;
            System.out.println(msg + deliveryTime + moreDays);
        } else if (deliveryDistance > 100) {
            deliveryTime = 4;
            System.out.println("Условия и сроки доставки согласовываются дополнительно, но они не могут быть меньше " + deliveryTime + days);
        }
    }

                     //ЗАДАНИЕ №4
    // Метод, сортирующий, определяющий и выводящий
    // дублирующиеся буквы в строке
    public static void doublFinder(String someString) {
        char[] arr = someString.toCharArray();
        Arrays.sort(arr);
        boolean st = true;
        if (st) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j] && st) {
                        System.out.print(arr[i] + " ");
                    }
                }
            }
            System.out.println();
        }
    }


    public static void doublFinderAndStoper(String someString) {
        char[] arr = someString.toCharArray();
        Arrays.sort(arr);
        boolean isFound = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isFound = true;
                } else isFound = false;
            }
            if (isFound == true) {
                System.out.println("Обнаружен дубль под индексом " + i);
                break;
            }
        }
        if (isFound == false) {
            System.out.println("Дубли не обнаружены");
        }
    }

                    //ЗАДАЧА №5
    //метод, создающий реверс массива
    public static void reverseInArray(char[] charArray) {
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // ДЛЯ ПЕРВОЙ ЗАДАЧИ
        System.out.println("ЗАДАЧА №1");


        leapYearFinder(2021);

        System.out.println();


        //ДЛЯ ВТОРОЙ ЗАДАЧИ  с вариацией на тему Scanner
        System.out.println("зАДАЧА 2");
        insertYearAndVers(2015, 1);
        findVerByYearOfProd (2022,1);


        //ДЛЯ ТРЕТЬЕЙ ЗАДАЧИ  с вариацией на тему Scanner
        System.out.println();
        System.out.println("ЗАДАЧА 3");
        deliveryTimeCalc(150);


        //ДЛЯ ЧЕТВЕРТОЙ ЗАДАЧИ  с вариацией на тему Scanner в комментариях
        System.out.println();
        System.out.println("ЗАДАЧА 4");

        doublFinder("gghijjkkabccdeftlerltdrlt");
        doublFinderAndStoper("ssdfghjkldfghjk");


        System.out.println();
        System.out.println("ЗАДАЧА 5");
        char[] arr = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverseInArray(arr);

    }
}
