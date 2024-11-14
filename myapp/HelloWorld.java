package myapp;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
         System.out.println("Hello World!");

        Console cons = System.console();
        /*String name = cons.readLine("What is your name? ");
        System.out.println("Your name is ...." + name);
        System.out.printf("Hello %s! Welcome to the world!\n", name);


        String sports = cons.readLine("What sports do you like to play?");
        if (sports.toUpperCase().equals("SWIMMING")){
            System.out.println("That's a fun water sport!");
        } else if (sports.toUpperCase().equals("TENNIS")){
            System.out.println("That's a rigorous sport!");
        } else {
            System.out.println("What sport is that?");
        }

        
        String replaceName = name.replace('a', 'e');
        System.out.printf("Your name is %s\n", replaceName);


        String valueString = cons.readLine("Enter your score between 0 to 100:");
        Integer score = Integer.parseInt(valueString);

        switch (score){
            case 100:
            System.out.println("Awesome!");
            break;

            case 50:
            System.out.println("You passed!");
            break;

            case 0:
            System.out.println("try harder");
            break;

            default:
            System.out.println("what?");
        }

        int i = 0;
        while (i<score) {
            System.out.println(i + ",");
            i++;
        }

        do {
            System.out.println(i + ",");
            i++;
        } while (i<score);


        Integer[] numbers = new Integer[5];

        for (int j = 0; j< numbers.length; j++) {
            Integer inputNumber = Integer.parseInt(cons.readLine("Enter your number: "));
            numbers[j] = inputNumber;
        }


        for (Integer pI : numbers) {
            System.out.println(pI);
        } */

        if (args.length > 0) {
            String[] names = new String[5];

            int x = 0;
            while (x < args.length) {
                names[x] = args [x];
                x++;

                if (x> 4){
                    break;
                }
            }
            for (int y = 0; y< names.length; y++) {
                System.out.printf("Names[%d]: %s", y, names[y]);
            }
        } else {
            System.out.println("No argument passed");
        }


        List<String> identity = new ArrayList<>();

        String input = "";
        do{
            input = cons.readLine("Enter a name: ");
            if (!input.equals("quit")) {
                identity.add(input);
            }
        } while (!input.equals("quit"));
            for (String name: identity) {
                System.out.println(name);
            }



        List<String> words = new ArrayList<>();
            String keyboardInput = "";
        keyboardInput = cons.readLine("Enter a sentence");
        keyboardInput = keyboardInput.replace(",", " ");
        Scanner scan = new Scanner(keyboardInput);

        while(scan.hasNext()) {
            words.add(scan.next());
        }
        scan.close();

        for (int z= 0; z<words.size(); z++) {
            System.out.printf("%d: %s \r\n", z+1, words.get(z));
        }
         

    }
}