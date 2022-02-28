import java.util.Scanner;
//1. When words begin with consonants, move the consonant sounds to the end and add “ay.”
//2. When words begin with vowels, keep the vowel in place and add “yay.”

/**
 * Daniel Ghita
 * February 7 2022
 */
public class PigLatin {

    public static void main(String args[]) {
        Scanner Obj = new Scanner(System.in);
        System.out.println("Type Word:");
        String input = Obj.nextLine();
        String output = null;
                
        char[] vowels = {'a','e','i','o','u','y','A','E','I','O','U','Y'};
        //char[] consonants = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'}
        char firstLetter = input.charAt(0);
        
        for(int i = 0 ; i < vowels.length; i++){
            if(firstLetter == vowels[i]) {
                output = "\n" + input + "-yay";
                break;
            } else {
                String minusChar = input.substring(1);
                output = "\n" + minusChar + firstLetter + "-ay";
                break;
            }
        }
        System.out.println(output);
    }
}
