import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        System.out.print("Enter dragon's age: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        int heads = 3;
        for (int cur_age = 0; cur_age < 200; cur_age++){
            heads = heads + 3;
        }
        for (int cur_age = 200; cur_age < 300; cur_age++){
            heads += 2;
        }
        for (int cur_age = 300; cur_age < age; cur_age++){
            heads += 1;
        }
        System.out.println("Number of heads: " + heads);
    }
}
