// Encrypt word when A=F, Input: Apple, Output: Fuuqj
public class EncryptWord {
    public static void main(String[] args) {
        String word = "Apple";
        String encryptedWord = "";
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            int asciiValue = (int) currentChar;
            asciiValue = asciiValue + 5;
            char encryptedChar = (char) asciiValue;
            encryptedWord = encryptedWord + encryptedChar;
        }

        System.out.println("Encrypted word: " + encryptedWord);
    }
}
