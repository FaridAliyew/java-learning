import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ! Create a Scanner object to read input from the user

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your name: ");

        // String name = scanner.nextLine();

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();

        // System.out.println("Hello, " + name + "!");
        // System.out.println("You are " + age + " years old.");

        // System.out.print("Enter username: ");
        // String username = scanner.nextLine();
        // if(username.equals("Farid")){
        // System.out.println("Welcome, admin!");
        // } else {
        // System.out.println("Welcome, " + username + "!");
        // }

        // ! ------- type conversion --------
        // ! ---- string to int -----
        // String number = "10";
        // int result = Integer.valueOf(number) + 5;
        // System.out.println("Result: " + result + "10");

        // int result2 = Integer.parseInt(number) + 5;
        // System.out.println("Result2: " + result2);

        // ! ---- int to string -----
        // int age = 25;
        // String str = String.valueOf(age);
        // System.out.println("Age as string: " + str);

        // int age = 25;
        // String str = Integer.toString(age);
        // System.out.println("Age as string: " + str);

        // ! ---- double to int -----
        // double num = 3.14;
        // int result = (int) num;
        // System.out.println("Result: " + result);

        // ! ---- int to double -----
        // int a = 20;
        // double result = (double) a;
        // System.out.println("Result: " + result);

        // ! ---- float to long -----
        // float num = 5.21f;
        // long result = (long) num;
        // System.out.println("Result: " + result);

        // ! ---- long to float -----
        // long num = 123;
        // float result = (float) num;
        // System.out.println("Result: " + result);

        // ! ---- long to string -----
        // long num = 123;
        // String str = String.valueOf(num);
        // System.out.println("Long as string: " + str + 2);

        // ! ---- string to long -----
        // float num = 6.32f;
        // String str = String.valueOf(num);
        // System.out.println("Float as string: " + str + 2);

        // ! ---- byte to string -----
        // byte num = 123;
        // String result = Byte.toString(num);
        // System.out.println("Result: " + result + 2);

        // if else statement
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Istediyin meyveni seçin: ");
        // String fruit = scanner.nextLine();

        // System.out.print("Kilosunu daxil edin: ");
        // double weight = scanner.nextDouble();

        // double reportBanan = 0.5 * weight;
        // double reportAlma = 0.3 * weight;
        // double reportArmud = 0.8 * weight;

        // if (fruit.equals("alma")) {
        // System.out.println("Alma qiymeti: " + reportAlma + " AZN");
        // } else if (fruit.equals("armud")) {
        // System.out.println("Armud qiymeti: " + reportArmud + " AZN");
        // } else if (fruit.equals("banan")) {
        // System.out.println("Banan qiymeti: " + reportBanan + " AZN");
        // } else {
        // System.out.println("Unknown fruit.");
        // }

        // scanner.close();

        // ! Array example
        // String[] fruits = { "alma", "banan", "armud", "heyva", "nar" };
        // for (int i = 0; i < fruits.length; i++) {
        //     System.out.println(fruits[i]);
        // }
        // System.out.println("------------");
        // System.out.println(fruits[0]);

        // char[] letters = { 'f', 'a', 'r', 'i', 'd' };
        // for (int i = 0; i < letters.length; i++) {
        //     System.out.println(letters[i]);
        // }

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter example name: ");
        // String name1 = scanner.nextLine();

        // System.out.print("Enter example name2: ");
        // String name2 = scanner.nextLine();

        // System.out.print("Enter example name3: ");
        // String name3 = scanner.nextLine();

        // String[] names = { name1, name2, name3 };
        // for (int i = 0; i < names.length; i++) {
        //     System.out.println(names[i]);
        // }

        String[] names = { "Farid", "Ali", "Veli" };


        for (String string : names) {
            System.out.println(string);
        }
    }
}
