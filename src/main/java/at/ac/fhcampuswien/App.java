package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here

        Scanner scanner = new Scanner(System.in);

        System.out.println("Number 1: ");
        double n1 = scanner.nextDouble();

        System.out.println("Number 2: ");
        double n2 = scanner.nextDouble();

        System.out.println("Number 3: ");
        double n3 = scanner.nextDouble();

        System.out.println("Number 4: ");
        double n4 = scanner.nextDouble();

        System.out.println("Number 5: ");
        double n5 = scanner.nextDouble();

        double [] number = new double[5];
        number [0]=n1;
        number [1]=n2;
        number [2]=n3;
        number [3]=n4;
        number [4]=n5;

        if (number.length > 0) {
            if (n1>n2 && n1>n3 && n1>n4 && n1>n5) {
                System.out.println("The largest number is: "+n1);
            } else if (n2>n1 && n2>n3 && n2>n4 && n2>n5){
                System.out.println("The largest number is: "+n2);
            }else if (n3>n1 && n3>n2 && n3>n4 && n3>n5){
                System.out.println("The largest number is: "+n3);
            }else if (n4>n1 && n4>n2 && n4>n3 && n4>n5){
                System.out.println("The largest number is: "+n4);
            }else if (n5>n1 && n5>n2 && n5>n3 && n5>n4){
                System.out.println("The largest number is: "+n5);
            }
        } System.out.println("No number entered");

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

        int i=1;
        System.out.println("Mark"+ i++);
        System.out.print(":");

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