package ru.specialist;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.specialist.house.House;
import ru.specialist.mainwindow.MainWindow;
import ru.specialist.window.Window;

public class App
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Window window = context.getBean("windowBean", Window.class);
        //new House(window).view(); // ручное внедрение

        House house = context.getBean("houseBean", House.class);

        house.buildWall();

        house.installDoors();

        house.view();
        System.out.printf("House height: %d\n", house.getHeight());

        MainWindow window = context.getBean(MainWindow.class); // id не нужен singletone
        window.show();

        context.close();
    }
}
