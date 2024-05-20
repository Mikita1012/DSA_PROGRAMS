import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to check how many vowels are present: ");
        String inputString = sc.next();

        printVowelsCount(inputString);
        System.out.println("Vowels present in string: "+ inputString +" is "+printVowelsCount(inputString));

    }

    static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    static int printVowelsCount(String str) {
        int count=0;
        for (int i=0; i<str.length(); i++) {
            if(isVowel(str.charAt(i))) {
                count++;
            }
        }
        return count;

    }


}
