package brothers.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by igor on 30.10.16.
 */
public class Startup {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/si-flow.xml  ");
        while (true) {

        }
    }
}
