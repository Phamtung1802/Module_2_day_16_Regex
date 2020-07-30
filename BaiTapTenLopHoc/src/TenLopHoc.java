import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TenLopHoc {
        private static Pattern pattern;
        private Matcher matcher;

        private static final String EMAIL_REGEX =   "^[CAP][0-9]{4}[GHIKLM]$";

        public TenLopHoc() {
            pattern = Pattern.compile(EMAIL_REGEX);
        }
        public boolean validate(String regex) {
            return pattern.matcher(regex).matches();
        }

    public static void main(String[] args) {
      TenLopHoc tenLopHoc;
      final String[] validEmail = new String[] { "C0318G"};
      final String[] invalidEmail = new String[] { "M0318G", "0323A" };

        tenLopHoc = new TenLopHoc();
        for (String email : validEmail) {
            boolean isvalid = tenLopHoc.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = tenLopHoc.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}


