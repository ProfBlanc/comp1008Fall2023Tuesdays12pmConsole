package wk5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week5 {


    static void example1(){

        String postalCode = "L4M 3X9";
        boolean valid = true;

        for(int i = 0; i< postalCode.length(); i++){

            if( ( ( i== 0 || i == 2 || i == 5)
                    &&
                    (postalCode.charAt(i) >= 65
                    && postalCode.charAt(i) <= 90))
                ||
                    ((
                            i == 1 || i == 4 || i == 6
                    )
                    &&
                            (postalCode.charAt(i) >=48 &&
                                    postalCode.charAt(i) <= 57)
                            )

            ){
                System.out.println("Valid postal so  at position");
            }
            else if(i == 3 && postalCode.charAt(i) == 32){
                System.out.println("Valid postal so  at position");

            }
            else{
                System.out.println("Invalid postal code");
                valid = false;
                break;
            }

        }
    }

    static void example2(){

        Pattern pattern = Pattern.compile("\\w{3}\\s", Pattern.CASE_INSENSITIVE);
        String text = "my phone num is: (705) 555-1234. see you soon";
        Matcher matcher = pattern.matcher(text);

        //System.out.println("Does string match or regex? " + matcher.find());
        while(matcher.find()){
            System.out.println("Hit");
            System.out.println(matcher.group());
            System.out.println("Was found between indexes");
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println("*".repeat(20));
        }

    }
    static void example3(){

        String text = "I love pineapples on pizza! I love Java at Georgian College. I live in Barrie";

        String replacement = text.replaceAll("l[oi]ve", "happy");
        System.out.println(replacement);

    }

    static void example4(){

        String text = "my phone num is: (705) 555-1234. see you soon";

        String replacement = text.replaceAll("[^\\d]", "");
        System.out.println(replacement);

    }

    static void example5(){

        /*
            unit testing
                testing functioality of classes
                    test functions => determine if they behave correctly
                        NEEDS to be able to evaluate the change of states of object



         */

    }

    public static void main(String[] args) {

        example4();
    }

    //REGEX: regular expressions
    /*
            Advanced searching
            ctl+f: exact matches

        regex
        pattern: symbols that have special meaning
        string: text to search


    Special Characters

    Position
    ^: at start of string
    $: at end of string
examples
    text: "Hello World

    pattern="^hello": 1 match
    pattern="hello$": 0 match
    pattern="world$": 1 match

    Options
    |: either or
    Grouping
    (): group these values
    []: ANY of the characters in bracket
    [^]: NOT ANY of the characters in the bracket

examples
    (ben|hen)
        either "ben" or "hen"

    [bh]en
        either "ben" or "hen"

    [aeioe]
        any occurrence of vowels a, e, i, o or u

    [^aeioe]
        any non-vowel characters


    repetition

    *           single character repeated zero or many times
    +           single character repeated one or many times
    {N}         single character repeated EXACTLY N times
    {N,}        single character repeated at least N times
    {N,M}       single character repeated between N and M times


    character matches
    .       match any character

    ranges
    [a-z]: a, b, c, d....z
    [0-9]: 0,1,2,3....9
    [a-c]: a, b, c
    [^a-c]: ANY character(s) except a, b, c

    shortcuts
    \d: [0-9]
    \D: [^0-9]
    \w: [a-zA-Z0-9_]
    \W: [^a-zA-Z0-9_]
    \s: [\n\t \r\v]
    \S: non-whitespace

    my phone num is: (705) 555-1234. see you soon
    extract/get all numerical values
    pattern?  \d, [0-9]

    extract all 3-letter words
    pattern? \w{3}    [a-zA-Z]{3}

     */

    //Unit Testing

}
