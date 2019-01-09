import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringA {

    public static void main(String[] args) {
        String regex = "Democrat";
        String str = "WASHINGTON — When Speaker Nancy Pelosi of California stepped to a microphone last week and pronounced President Trump’s border wall “an immorality,” most Democrats cheered and nodded their heads.\n" +
                "But a few privately grimaced, worried that such stark terminology could make it more difficult for Democrats and Republicans to find their way out of an impasse over border security that has partially shuttered the government for three weeks, deprived about 800,000 federal workers of their pay and increasingly threatens beneficiaries of federal programs.\n" +
                "Democrats, said one Democratic lawmaker from a Republican-leaning district who insisted on anonymity to offer a candid assessment, cannot be seen by the public as calling border security immoral.\n" +
                "The divide illustrates why Democrats are working to focus public attention on the painful costs of the partial government shutdown — vulnerable families going without food assistance, farmers forgoing crop payments, national parks trashed — and Mr. Trump’s recklessness in courting it, rather than delving into the specific details of erecting a barrier on the southwestern border.\n" +
                "\n";

        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(str);
        int count = 0;
        while (m1.find())
            count++;
        System.out.println(str);
        System.out.println("We are estimating how often a special word:" + "'Democrat'" + "append in the main text" );
        System.out.println(count + " times");

    }
}
