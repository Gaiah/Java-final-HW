import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ConsoleUI ui = new ConsoleUI();
        ui.run();

    }

    public static class ConsoleUI {
        private LaptopService service = new LaptopService();
        private Scanner scan = new Scanner(System.in);

        public void run(){
            System.out.println("Input search criteria: \nInput 1 for crit \n Input 2 for crit");
            String answer = scan.nextLine();
            if (answer.equals("no")) {
                System.exit(0);
            }
            System.out.println("Input 'yes' to continue or 'no' to exit the program: ");

        }

    }

    public static class LaptopService {
        Set<Laptop> lap = new HashSet<>();



    }
//    public Set<Laptop> getLap(Laptop lap) {
//
//        return lap;
//    }

    public static class Laptop {
        private String model;
        private String os;
        private String color;

        public Laptop(String model, String os, String color){
                   this.model = model;
                   this.os = os;
                   this.color = color;



        }

        Laptop len = new Laptop("lenovo", "windows", "black");
        Laptop hp = new Laptop("hp", "windows", "silver");
        Laptop sam = new Laptop("samsung", "windows", "black");

        Set<Laptop> lap = new HashSet<>();

        public Set<Laptop> getLap() {
            return lap;
        }

    }





}