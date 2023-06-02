import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "world", "this", "is", "Java");

        String sentence = words.stream()
                .reduce((s1, s2) -> s1 + " " + s2)
                .orElse("");

        System.out.println("Original words: " + words);
        System.out.println("Constructed sentence: " + sentence);
    }

    public static void printStudentInfo(Student student) {
        System.out.print("Student name: " + student.getName());
        student.getAddress().ifPresent(address -> {
            System.out.print(", Address: " + address.getCity() + ", " + address.getRegion());
        });
        System.out.println();
    }
    }
