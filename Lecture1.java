public class Lecture1 {
    public static void main(String[] args) {
        // args is a string array and, it stores incoming arguments to our program
        // how to do this? 2 ways:
        // 1. cmd line: java Lecture1(the class name consist the psvm) hello 5 -2.345(what do you want)
        // these will be store in args
        // in terminal; ls show subs cd take you there, go out-> production-> projectName
        // if you use only java Lecture1 -> running in the terminal
        // you must run in the program first otherwise, the updates does not see in the terminal
        // comments in the terminal are not persistent, only single use

        // 2. Intellij: Run-> Edit Configurations-> Program Arguments
        // it is persistent but not valid in the terminal

        // a great use case command line arguments
        // 2 string cmd line args
        // first for the input file name
        // second for the output file name
        System.out.println(args.length);

        if(args.length == 3){
            String word = args[0];
            int number = Integer.parseInt(args[1]);
            double floatingPointNumber = Double.parseDouble(args[2]);
            System.out.println(word + " " + number + " " + floatingPointNumber);
        }
        else{
            System.out.println("Usage: string int double");
        }
    }
}
