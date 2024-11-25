public class VowelChecker {
    // Method to check if a string contains vowels
    public static void checkVowels(String str) throws Exception {
        // Check for vowels using a regular expression
        if (!str.toLowerCase().matches(".*[aeiou].*")) {
            throw new Exception("The string does not contain vowels!");
        }
    }

    public static void main(String[] args) {
        // Case 1: String contains vowels
        try {
            System.out.println("Checking the word: 'Apple'");
            checkVowels("Apple");
            System.out.println("The string contains vowels.\n");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
        }

        // Case 2: String does not contain vowels
        try {
            System.out.println("Checking the word: 'Sky'");
            checkVowels("Sky");
            System.out.println("The string contains vowels.\n");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\n");
        }
    }
}
