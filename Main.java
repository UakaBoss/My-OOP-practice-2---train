import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //array of lacomatives
    static ArrayList<Lacomative> lacomatives = new ArrayList<>();

    //main menu
    public static void main(String[] args) {
        dataExample();

        //endless cycle until user type "exit"
        while(true){
            System.out.println("====Type the option: view (by id), buy (buy a ticket), return (return ticket by Id), exit (leave program)====");
            Scanner scan = new Scanner(System.in);
            String option = scan.nextLine();

            //4 options
            if(option.equals("view")) {
                viewFunc();
            }
            if(option.equals("buy")) {
                buyFunc();
            }
            if(option.equals("return")) {
                returnFunc();
            }
            if(option.equals("exit")) {
                return;
            }
        }
    }

    //when user type "view" this function works
    public static void viewFunc() {
        System.out.println("Enter your id(6 number):");
        //enter Id
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        //search for Passanger by Id
        boolean foundStatus = false;
        Lacomative data1 = null;
        Passanger data2 = null;
        for(Lacomative lacomative: lacomatives) {
            for(Passanger passanger: lacomative.passangers) {
                if(passanger.getId()==input) {
                    foundStatus = true;
                    data1 = lacomative;
                    data2 = passanger;
                    break;
                    }
                }
            }
        if(foundStatus) {
            System.out.println("====You already bought a ticket!====");
            data1.showPassangerInfo(data2);
        }
        else System.out.println("====You didn't buy a ticket!====");
        }

    //when user type "buy" this function works
    public static void buyFunc() {
        System.out.println("====To buy a ticket, you should choose a vagon type====");
        System.out.println("1.Luxe       Cost: 5500");
        System.out.println("2.Coupe      Cost: 3500");
        System.out.println("3.Plackart   Cost: 2500");
        System.out.println("====Write a number to choose====");
        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();
        //3 options
        if(choose==1){
            buy();
            System.out.println("====You bought a Luxe vagon, thanks!====");
            return;
        }
        if(choose==2){
            buy();
            System.out.println("====You bought a Coupe vagon, thanks!====");
            return;
        }
        if(choose==3){
            buy();
            System.out.println("====You bought a Plackart vagon, thanks!====");
            return;
        }
    }

    public static void buy() {
        Scanner scan = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = scan.nextLine();
        System.out.println("Second name: ");
        String secondName = scan.nextLine();
        System.out.println("Id: ");
        int id = scan.nextInt();
        System.out.println("Age: ");
        int age = scan.nextInt();
        System.out.println("Invalid status(true or false): ");
        boolean invalid = scan.nextBoolean();
        System.out.println("Vagon number: ");
        int vagonNum = scan.nextInt();
        lacomatives.get(0).passangers.add(new Passanger(firstName,secondName,id,age,invalid,vagonNum));
    }

    //when user type "return" this function works
    public static void returnFunc(){
        System.out.println("Enter your Id");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        boolean foundStatus = false;
        for(Lacomative lacomative: lacomatives) {
            for(Passanger passanger: lacomative.passangers) {
                if(passanger.getId()==input) {
                    passanger.clearAllData();
                    foundStatus = true;
                    break;
                }
            }
        }
        if(foundStatus) {
            System.out.println("====Your ticket and money returned====");
        }
        else System.out.println("====We couldn't find your ticket, try again!====");
    }

    //data for examples
    public static void dataExample() {
        //3 lacomatives with different Vagon Types like Luxe, Coupe and Plackart
        lacomatives.add(new Lacomative(1,10,90, Vagons.Luxe));
        lacomatives.add(new Lacomative(2,15,120, Vagons.Coupe));
        lacomatives.add(new Lacomative(3,20,150, Vagons.Plackart));
        //some people data to examples
        lacomatives.get(0).passangers.add(new Passanger("Kasma", "Babob",100000,29,false,9));
        lacomatives.get(0).passangers.add(new Passanger("Oner", "Londo",100001,32,false,7));
        lacomatives.get(1).passangers.add(new Passanger("Mia", "Ganlia",200000,34,false,5));
        lacomatives.get(1).passangers.add(new Passanger("Rodrig", "Shrein",200001,56,true,8));
        lacomatives.get(2).passangers.add(new Passanger("Giga","Saderick",300000,19,false,7));
        lacomatives.get(2).passangers.add(new Passanger("Olivia","Mouly",300001,70,true,1));
        lacomatives.get(0).passangers.add(new Passanger("Kodjima", "Sanyo",100002,29,false,2));
        lacomatives.get(0).passangers.add(new Passanger("Michael", "Jackson",100003,33,false,3));
        lacomatives.get(1).passangers.add(new Passanger("Angela", "Merci",200002,32,false,4));
        lacomatives.get(1).passangers.add(new Passanger("Gordon", "Ramzy",200003,48,true,2));
        lacomatives.get(2).passangers.add(new Passanger("Rodrigo","Sanchez",300002,90,true,6));
        lacomatives.get(2).passangers.add(new Passanger("Den","Hauzer",300003,70,true,3));
    }
}