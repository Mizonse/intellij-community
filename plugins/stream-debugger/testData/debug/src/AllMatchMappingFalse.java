import java.util.stream.Stream;

public class AllMatchMappingFalse {
  public static void main(String[] args) {
    // Breakpoint!
    final boolean res = Stream.of(1, 2, 3).allMatch(x -> x % 2 == 0);
  }
}
