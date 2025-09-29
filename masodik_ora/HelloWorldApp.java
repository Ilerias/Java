package masodik_ora;

public class HelloWorldApp {

    public static void main(String[] args) {
        HelloWorldApp prog = new HelloWorldApp();
        prog.start();
    }

    public void start(){
        greetings();
        int number = 10;
        double weight = 33.5;
        System.out.println("Learning Java");
        System.out.println(number);
        System.out.println(weight);
        for (int i = 0; i<5; i++) {
            System.out.print(i + " ");
            //System.out.print(' ');
            
        }
        System.out.println();
        while (number < 50) {
            System.out.print(".");
            number++;
        }
        System.out.println();
        if (number > 20) {
            System.out.println("Greater than 20");
        }
        else
        {
            System.out.println("smaller than or equal to 20");
        }

        // Java array example

        int numbers1[] = new int[5];
        int[] numbers2;

        // for (int i = 0; i < numbers1.length; i++) {
        //     System.out.println(numbers1[i]);
        // }

        arrayPrint(numbers1);

        numbers1[0] = 1;

        arrayPrint(numbers1);

        stringExamples();

        //String msg = "Good Bye!";
        String msg = new String("Good Bye!");
        greetings(msg);
    }

    public void arrayPrint(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void greetings(){
        System.out.println("Jó reggelt!");
    }
    public void greetings(String message){
        System.out.println(message);
    }

    public void stringExamples(){
        String msg = "This is a sample sentence.";
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());
        System.out.println(msg.indexOf("sample"));
        System.out.println(msg.replace("sample", "short"));
    }
}