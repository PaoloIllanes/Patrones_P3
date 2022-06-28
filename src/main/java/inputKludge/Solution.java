package inputKludge;
import java.util.regex.Matcher;
import java.util.regex.Pattern ;
public class Solution {


        public static void main ( String [ ] args ) {
            // Patron para validar el mail

            Pattern pattern = Pattern
                    .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

            // El email a validar
            String email = "upbtest@gmail.com";

            Matcher matcher = pattern.matcher(email);

            if (matcher.find()) {
                System.out.println("El email ingresado es valido.");
            } else {
                System.out.println("El email ingresado no es valido");
            }
        }
}
