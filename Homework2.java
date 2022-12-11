public class Homework2 {
    public static void main(String[] args) {

    // task1

    String inputName = " Your name is <My name>";
    Scanner scan = new Scanner(System.in);
    String outputName = scan.nextLine();
    System.out.println(inputName.replace("<My name>", outputName));


    //task2
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter your name");
    String firstName = scanner.nextLine();

    System.out.println("Enter your username");
    String userName = scanner.nextLine();

    System.out.println(firstName.equalsIgnoreCase(userName));

    //task 3

    String food = " I like to travel around Europe ";
    int count = food.split("\\s").length;              // the answer should be 6
    System.out.println(count);

    //task4
    String mood = "Happy";
    String year = "new year";
    System.out.println(mood + " " + year  + "!");


}

}
}
