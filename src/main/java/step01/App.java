package step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by kiiv0317 on 13.04.2017.
 */
public class App {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/resources/knights.xml");

        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();


    }
}
