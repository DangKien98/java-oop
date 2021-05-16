package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Input {

    public Input() {

    }

    private static Scanner sc = new Scanner(System.in);

    public static String getDate (String patten) {
       Date date = new Date();
       SimpleDateFormat sdf = new SimpleDateFormat(patten);
       return sdf.format(date);
    }


    public static int getInt(String msg, int condition, String errorNumber, String error) {
        int n;
        do {
            try {
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                if (n > condition) {
                    return n;
                }
                else {
                    System.out.println(errorNumber);
                }
            } catch (Exception e) {
                System.out.println(error);
            }
        } while (true);
    }

    public static int getIntEqual(String msg, int condition, String errorNumber, String error) {
        int n;
        do {
            try {
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                if (n >= condition) {
                    return n;
                }
                else {
                    System.out.println(errorNumber);
                }
            } catch (Exception e) {
                System.out.println(error);
            }
        } while (true);
    }

    public static int getIntBetween(String msg, int condition1, int condition2, String errorNumber, String error) {
        int n;
        do {
            try {
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                if (n > condition1 && n < condition2) {
                    return n;
                }
                else {
                    System.out.println(errorNumber);
                }
            } catch (Exception e) {
                System.out.println(error);
            }
        } while (true);
    }

    public static int getIntBetweenEqual(String msg, int condition1, int condition2, String errorNumber, String error) {
        int n;
        do {
            try {
                System.out.print(msg);
                n = Integer.parseInt(sc.nextLine());
                if (n >= condition1 && n <= condition2) {
                    return n;
                }
                else {
                    System.out.println(errorNumber);
                }
            } catch (Exception e) {
                System.out.println(error);
            }
        } while (true);
    }

    public static double getDouble(String msg, int condition, String errorNumber, String error) {
        double n;
        do {
            try {
                System.out.print(msg);
                n = Double.parseDouble(sc.nextLine());
                if (n > condition) {
                    return n;
                }
                else {
                    System.out.println(errorNumber);
                }
            } catch (Exception e) {
                System.out.println(error);
            }
        } while (true);
    }

    public static double getDoubleEqual(String msg, int condition, String errorNumber, String error) {
        double n;
        do {
            try {
                System.out.print(msg);
                n = Double.parseDouble(sc.nextLine());
                if (n >= condition) {
                    return n;
                }
                else {
                    System.out.println(errorNumber);
                }
            } catch (Exception e) {
                System.out.println(error);
            }
        } while (true);
    }

    public static double getDoubleBetween(String msg, int condition1, int condition2, String errorNumber, String error) {
        double n;
        do {
            try {
                System.out.print(msg);
                n = Double.parseDouble(sc.nextLine());
                if (n > condition1 && n < condition2) {
                    return n;
                }
                else {
                    System.out.println(errorNumber);
                }
            } catch (Exception e) {
                System.out.println(error);
            }
        } while (true);
    }

    public static double getDoubleBetweenEqual(String msg, int condition1, int condition2, String errorNumber, String error) {
        double n;
        do {
            try {
                System.out.print(msg);
                n = Double.parseDouble(sc.nextLine());
                if (n >= condition1 && n <= condition2) {
                    return n;
                }
                else {
                    System.out.println(errorNumber);
                }
            } catch (Exception e) {
                System.out.println(error);
            }
        } while (true);
    }

    public static String getString(String msg, String error) {
        String string;
        do {
            System.out.print(msg);
            string = sc.nextLine();
            if (!string.trim().isEmpty())
                return string;
            else {
                System.out.println(error);
            }
        }while (true);
    }

    public static String getStringRegular(String regex, String msg, String error) {
        do {
            System.out.print(msg);
            String input = sc.nextLine();
            if (!input.matches(regex)) {
                System.out.println(error);
            }
            else {
                return input;
            }

       }while (true);
    }
}