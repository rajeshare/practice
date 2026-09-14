import java.util.List;
import java.util.stream.Collectors;

public class VowelCountAndRation {
    public static void main(String[] args) {
        String test1 = "Hello World";
        List<Character> charList = test1.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        long count = charList.stream().filter(c -> "aeiou".contains(c.toString())).count();
        double vowelRation = (double) count / test1.length();
        System.out.println("Vowel Count" + count + "vowel ration" + vowelRation);
    }
}
