package fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Provide two positive integers as arguments");
        } else {
            int first = Integer.valueOf(args[0]);
            int last = Integer.valueOf(args[1]);
            System.out.println(getFizzBuzzString(first, last));
        }
    }

    public static String getFizzBuzzString(int first, int last) {
        String fizzBuzzString = "";
        for (int i = first; i < last + 1; i++) {
            if ((i % 3) != 0 && (i % 5 !=0)) {
                fizzBuzzString = fizzBuzzString.concat(i + "");
            }
            else { 
                if (i % 3 == 0) {
                    fizzBuzzString = fizzBuzzString.concat("fizz");
                }
                if (i % 5 ==0 ) {
                    fizzBuzzString = fizzBuzzString.concat("buzz");
                }
            }
            fizzBuzzString = fizzBuzzString.concat(" ");
        }
        return fizzBuzzString.trim();
    }
}
