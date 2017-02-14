import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try {
            parser p = new parser(new Lexer(new FileReader("src//test")));
            Object result = p.parse().value;
        } catch (Exception e) {
      /* do cleanup here -- possibly rethrow e */
            e.printStackTrace();
        }
    }
}
