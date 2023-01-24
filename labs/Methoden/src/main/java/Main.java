public class Main {
    public static void main(String[] args) {
        String text = "He went to school";
        System.out.println(countVocals(text));
        System.out.println(isVocal('b'));
        System.out.println(isVocal('i'));
        System.out.println(countWords(text));
    }

    private static int countWords(String text) {
        String space = " ";
        for (int i = 0; i < text.length(); i++) {

        }
        return 0;
    }

    static int countVocals(String word) {
        int counter = 0;
        for (int i = 0; i <word.length(); i++) {
            if (isVocal(word.charAt(i))) {
                counter++;
            }

        }
        return counter;
    }

    /**
     * checks, if the character "zeichen" is a vocal
     *
     * @param zeichen
     * @return
     */
    static boolean isVocal(char zeichen) {
        String vocals = "aeiou";
        for (int i = 0; i <vocals.length(); i++) {
            if (zeichen == vocals.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
