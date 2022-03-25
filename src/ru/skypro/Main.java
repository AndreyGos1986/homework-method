package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner; // ввод через консоль везде закомментирован, поэтому данный импорт не используется


public class Main {

                            //ЗАДАЧА №1
// метод для определения и вывода результата, если год високосный, в
// притивном случае, не високосный
    public static void leapYearFinder(int year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
        }
    }

    // метод для определения и вывода результата, если год не високосный
    public static void notleapYearFinder(int year) {
        if (year % 4 != 0) {
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

//         // ВВОД НУЖНОГО ЗНАЧЕНИЯ ЧЕРЕЗ КОНСОЛЬ + метод
//    public static int insertClientDeviceYear(int year) {
//        System.out.println("Введите год производства Вашего телефона");
//        Scanner clientDeviceYear = new Scanner(System.in);
//        year = clientDeviceYear.nextInt();
//        return year;
//    }
//
//    public static int insertClientDeviceVers(int ver) {
//        System.out.println("Введите операционную версию Вашего телефона, указав 0 - для iOs и 1 - для Android");
//        Scanner clientDeviceoperSysVer = new Scanner(System.in);
//        ver = clientDeviceoperSysVer.nextInt();
//        return ver;
//    }

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
        } else if (telYear >= currentYear) {
            if (telOperSyst == 0) {
                System.out.println(clientForIOs);
            } else {
                System.out.println(clientForAndroid);
            }
        }
    }


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

//                //ВВОД НУЖНОГО ЗНАЧЕНИЯ ЧЕРЕЗ КОНСОЛЬ + метод
//    public static void deliveryTimeCalcConsole(int deliveryDistance) {
//        System.out.println("Введите примерное расстояние, от места отправления до места назначения");
//        Scanner devDist = new Scanner(System.in);
//        deliveryDistance = devDist.nextInt();
//        int deliveryTime;
//        String msg = "На доставку потребуется: ";
//        String oneDay = " день";
//        String moreDays = " дня";
//        String days = " дней";
//        if (deliveryDistance <= 20) {
//            deliveryTime = 1;
//            System.out.println(msg + deliveryTime + oneDay);
//        } else if ((deliveryDistance > 20) && (deliveryDistance <= 60)) {
//            deliveryTime = 2;
//            System.out.println(msg + deliveryTime + moreDays);
//        } else if ((deliveryDistance > 60) && (deliveryDistance <= 100)) {
//            deliveryTime = 3;
//            System.out.println(msg + deliveryTime + moreDays);
//        } else if (deliveryDistance > 100) {
//            deliveryTime = 4;
//            System.out.println("Условия и сроки доставки согласовываются дополнительно, но они не могут быть меньше " + deliveryTime + days);
//        }
//    }

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

    //ВВОД НУЖНОГО ЗНАЧЕНИЯ ЧЕРЕЗ КОНСОЛЬ + метод
    //    public static void doublFinderByConsole (String someString) {
//        Scanner str = new Scanner(System.in);
//        someString = str.nextLine();
//        char [] arr = someString.toCharArray();
//        Arrays.sort(arr);
//        for(int i=0; i<arr.length-1; i++){
//            for (int j=i+1; j<arr.length; j++){
//                if(arr[i] == arr[j]){
//                System.out.print(arr [i] + " ");
//                    }
//                }
//            }
//        }
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
    //ВВОД НУЖНОГО ЗНАЧЕНИЯ ЧЕРЕЗ КОНСОЛЬ + метод
//    public static void doublFinderAndStoperConsole(String someString) {
//        Scanner str = new Scanner(System.in);
//        someString = str.nextLine();
//        char[] arr = someString.toCharArray();
//        Arrays.sort(arr);
//        boolean isFound = false;
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    isFound = true;
//                } else isFound = false;
//            }
//            if (isFound == true) {
//                System.out.println("Обнаружен дубль под индексом " + i);
//                break;
//            }
//        }
//        if (isFound == false) {
//            System.out.println("Дубли не обнаружены");
//        }
//    }
                    //ЗАДАЧА №5
    //метод, создающий реверс массива
    public static void reverseInArray(char[] charArray) {
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }
//    //ВВОД НУЖНОГО ЗНАЧЕНИЯ ЧЕРЕЗ КОНСОЛЬ + метод
//    public static void reverseInArrayIfBugString (String string) {
//        System.out.println("Введите что-то");
//        Scanner str = new Scanner(System.in);
//        string = str.nextLine();
//        char [] toChar = string.toCharArray();
//        for (int i = toChar.length - 1; i >= 0; i--) {
//            System.out.print(toChar[i]);
//        }
//    }


    public static void main(String[] args) {
        // ДЛЯ ПЕРВОЙ ЗАДАЧИ
        System.out.println("ЗАДАЧА №1");


        leapYearFinder(2020);
        notleapYearFinder(2020);
        System.out.println();
        // ВВОД НУЖНОГО ЗНАЧЕНИЯ ЧЕРЕЗ КОНСОЛЬ
//        Scanner yearNum = new Scanner(System.in);
//        System.out.println("Введите год");
//        int year = yearNum.nextInt();
//        leapYearFinder(year);
//        notleapYearFinder(year);

        //ДЛЯ ВТОРОЙ ЗАДАЧИ  с вариацией на тему Scanner
        System.out.println("зАДАЧА 2");
        insertYearAndVers(2022, 0);

        // ВВОД НУЖНОГО ЗНАЧЕНИЯ ЧЕРЕЗ КОНСОЛЬ
//        int clientDeviceYear = 0;
//        clientDeviceYear = insertClientDeviceYear(clientDeviceYear);
//        int clientDeviceVer = 0;
//        clientDeviceVer = insertClientDeviceVers(clientDeviceVer);
//        findVerByYearOfProd(clientDeviceYear, clientDeviceVer);


        //ДЛЯ ТРЕТЬЕЙ ЗАДАЧИ  с вариацией на тему Scanner
        System.out.println();
        System.out.println("ЗАДАЧА 3");
        deliveryTimeCalc(150);

        //ВВОД НУЖНОГО ЗНАЧЕНИЯ ЧЕРЕЗ КОНСОЛЬ
//        int delDist=0;
//        deliveryTimeCalcConsole (delDist);


        //ДЛЯ ЧЕТВЕРТОЙ ЗАДАЧИ  с вариацией на тему Scanner в комментариях
        System.out.println();
        System.out.println("ЗАДАЧА 4");

        doublFinder("gghijjkkabccdeftlerltdrlt");
        doublFinderAndStoper("ssdfghjkldfghjk");

        //ВВОД НУЖНОГО ЗНАЧЕНИЯ ЧЕРЕЗ КОНСОЛЬ
        //        System.out.println("Введите любую строку или сочетание символов");
//                String str = new String();
//                doublFinderByConsole (str);
//        doublFinderAndStoperConsole(str);

        System.out.println();
        System.out.println("ЗАДАЧА 5");
        char[] arr = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverseInArray(arr);

        //ВВОД НУЖНОГО ЗНАЧЕНИЯ ЧЕРЕЗ КОНСОЛЬ
//        String reverChar = "";
//        reverseInArrayIfBugString (reverChar);
    }
}
