package projects.lambdaSample;

import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.Locale.filter;

public class LambdaExpressions {

    public static void main(String[] args) throws Exception {
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        System.out.println(isOdd.test(100));

        Callable<String> callMe = () -> "Hello";
        PrivilegedAction<String> action = () -> "Hello";

        System.out.println(callMe.call());
        System.out.println(action.run());

        Collection<Integer> myInts = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
    }
}

class LambdaTest {
    // define your interface
    interface Use_3_Strings {
        void apply(String s1, String s2, String s3);
    }
    // define a test method
    public void lambdaTest1(String str1, String str2, String str3) {
        // your lambda expression
        // defining what to do inside { }
        // - like a method having 3 String parameters (s1, s2, s3)
        Use_3_Strings use3strings = (s1, s2, s3) -> { System.out.println("Working with 3 strings:");
            System.out.println("   String 1: " + s1);
            System.out.println("   String 2: " + s2);
            System.out.println("   String 3: " + s3);
            StringBuilder sb = new StringBuilder();
            sb.append("CSV of 3 strings:\n");
            sb.append(s1);
            sb.append(", ");
            sb.append(s2);
            sb.append(", ");
            sb.append(s3);
            System.out.println(sb); };

        // your lambda expression in action
        // executing what you coded inside { } above
        use3strings.apply(str1, str2, str3);

    }

}
