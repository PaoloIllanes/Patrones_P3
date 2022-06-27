package inputKludge;
import java.util.regex.Matcher;
import java.util.regex.Pattern ;
public class Solution {




        public static void main ( String [ ] args ) {
            // Patron para validar el mail

            Pattern pattern = Pattern
                    .compile( "^(.+)@(\\\\S+)$");

            // El email a validar
            String email = "upbtest@gmail.org";

            Matcher matcher = pattern.matcher(email);

            if (matcher.find()) {
                System.out.println("El email ingresado es valido.");
            } else {
                System.out.println("El email ingresado no es valido");
            }
        }
}
