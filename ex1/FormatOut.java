import java.util.Date;
import java.util.Locale;

public class FormatOut {
    public static void main(String[] args) {

        String str = "Michael";
        char ch = 'x';
        int i = 12;
        float f = 4.5F;
        Date date = new Date();
        System.out.printf("%b%n", str);
        System.out.printf("%c%n", ch);
        System.out.printf("%03d%n", i);
        System.out.printf("%e%n", f);
        System.out.printf("%03f%n", f);
        System.out.printf("%.2f%n", f);
        System.out.printf("{%07.3f}%n", f);
        System.out.printf("%f%n", f);
        System.out.printf("%g%n", f);
        System.out.printf("%h%n", f);
        System.out.printf("%s%n", 5);
        System.out.printf("%s://%s/%s%n", str, str, str);
        System.out.printf("%1$s...%n", str);
        System.out.printf("%5s%n", str);
        System.out.printf("%-5s%n", str);
        System.out.printf("%-10.10s %s%n", str, 3);
        System.out.printf("%.5s%n", str);
        System.out.printf("%s%n", date);
        System.out.printf("%tc%n", date); //(lowercase t, lowercase c)
        System.out.printf("%tC%n", date); //(lowercase t, uppercase C)
        System.out.printf("%tD%n", date);
        System.out.printf("%tF%n", date);
        System.out.printf("%tr%n", date);
        System.out.printf("%tR%n", date);
        System.out.printf("%tT%n", date);
        System.out.printf("%tz%n", date);
        System.out.printf("%Tc%n", date);
        System.out.printf("%1$x, %1$X%n", 0xCAFE);
        System.out.printf(Locale.CHINA, "%tc%n", date);
        System.out.printf(Locale.ITALIAN, "%tc%n", date);
        System.out.printf(Locale.getDefault(), "%tc%n", date);
   }
}
