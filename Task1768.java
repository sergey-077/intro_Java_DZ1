// Вам даны две строки word 1 и word 2. Объедините строки, добавив буквы в чередующемся порядке, начиная со слова 1.
// Если строка длиннее другой, добавьте дополнительные буквы в конец объединенной строки.
//        Return the merged string.

    //        Example 1:
//
//        Input: word1 = "abc", word2 = "pqr"
//        Output: "apbqcr"
//        Explanation: The merged string will be merged as so:
//        word1:  a   b   c
//        word2:    p   q   r
//        merged: a p b q c r
//        Example 2:
//
//        Input: word1 = "ab", word2 = "pqrs"
//        Output: "apbqrs"
//        Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//        word1:  a   b
//        word2:    p   q   r   s
//        merged: a p b q   r   s
//        Example 3:
//
//        Input: word1 = "abcd", word2 = "pq"
//        Output: "apbqcd"
//        Explanation: Notice that as word1 is longer, "cd" is appended to the end.
//        word1:  a   b   c   d
//        word2:    p   q
//        merged: a p b q c   d
public class Task1768 {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int len = Math.max(word1.length(), word2.length());
        for (int i = 0; i < len; i++) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc", word2 = "pqr";
        String word3 = "ab", word4 = "pqrs";
        String word5 = "abcd", word6 = "pq";
        System.out.println(mergeAlternately(word1, word2));
        System.out.println(mergeAlternately(word3, word4));
        System.out.println(mergeAlternately(word5, word6));
    }
}