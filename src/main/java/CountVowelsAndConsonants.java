//Count Vowels and consonants from a word
//Input: Dhaka
public class CountVowelsAndConsonants {
    static int countVowels(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

    static int countConsonants(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String word = "Dhaka";
        int vowels = countVowels(word);
        int consonants = countConsonants(word);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
