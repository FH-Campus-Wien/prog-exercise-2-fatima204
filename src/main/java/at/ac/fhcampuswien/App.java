package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here

        double number;
        int counter = 1;
        double largest = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number" + (counter + 1) + ":");
        number = scanner.nextDouble();
        while(1<number) {
            if (number < 0) {
                System.out.println("No number entered.");
                return;
            } else if (number > largest) {
                largest = number;
            }
        }System.out.println("The largest number is" +(largest));
        counter++;


    }

    //todo Task 2
    public void stairs(){
        // input your solution here

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        int j,i;
        int count = 1;
        if(n > 0){
            for (i=1 ; i <= n; i++){
                for(j=1; j <= i; j++){
                    System.out.print(count + " ");
                    count++;
                }
                System.out.println();
            }
        }else{
            System.out.println("Invalid number!");
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here

        for(int i=1; i<=6; i++) {
            for(int j = i; j<6; j++)
            {
               System.out.print(" ");
            }
            for(int k=1; k<(i*2); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here

        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.next().charAt(0);
        int j;

        if (h % 2==1) {
            for (int i = 0; i <= h/2; i++) {
                for (j = i; j < h/2; j++) {
                    System.out.print(" ");
                }
                for (int k = 0 - i; k <= i; k++) {
                    System.out.print((char)(c-Math.abs(k)));
                }
                System.out.println();
            }
            for (int i = h/2; i > 0; i--) {
                for (j = i; j <= h/2; j++) {
                    System.out.print(" ");
                }
                for (int k = 0 - i +1; k < i; k++) {
                    System.out.print((char) (c-Math.abs(k)));
                }
                System.out.println();
            }
        }else{
            System.out.println("Invalid number!");
        }

    }

    //todo Task 5
        public void marks(){
        // input your solution here

        Scanner scanner = new Scanner (System.in);

        int counter=0;
        System.out.println("Mark"+ (counter+1) + ":");

        int number = scanner.nextInt();

        double [] grade = new double [number];

        for(int j=0; j<grade.length; j++) {
            grade[j] = scanner.nextDouble();
        }
    double sum = 0;
    number = grade.length;
        for(int j=0; j<grade.length; j++){
        sum = sum / grade [j];
    }
    double avarage = sum / number;
        System.out.println("Avarage:"+avarage);

    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here

        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int num = scanner.nextInt();
        int sum=0;
        int copy = num;
        while(copy > 9){
            while(copy > 0){
                int mod = copy % 10;
                sum = sum + (mod * mod);
                copy = copy / 10;
            }
            copy = sum;
            sum = 0;
        }
        if(copy == 1){
            System.out.println("Happy number!");
        }else{
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}