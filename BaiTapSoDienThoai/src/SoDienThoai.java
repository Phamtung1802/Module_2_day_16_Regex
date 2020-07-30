import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoDienThoai {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX =   "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    public SoDienThoai() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String regex) {
        return pattern.matcher(regex).matches();
    }

    public static void main(String[] args) {
        SoDienThoai soDienThoai;
        final String[] validSDT = new String[] {  "(84)-(0978489648)"};
        final String[] invalidSDT = new String[] { "(a8)-(22222222)" };

        soDienThoai = new SoDienThoai();
        for (String SDT : validSDT) {
            boolean isvalid = soDienThoai.validate(SDT);
            System.out.println("Email is " + SDT +" is valid: "+ isvalid);
        }
        for (String SDT : invalidSDT) {
            boolean isvalid = soDienThoai.validate(SDT);
            System.out.println("Email is " + SDT +" is valid: "+ isvalid);
        }

    }
}


