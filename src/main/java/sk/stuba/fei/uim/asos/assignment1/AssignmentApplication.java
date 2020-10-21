package sk.stuba.fei.uim.asos.assignment1;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import sk.stuba.fei.uim.asos.assignment1.domain.Adresa;
import sk.stuba.fei.uim.asos.assignment1.domain.Osoba;
import sk.stuba.fei.uim.asos.assignment1.domain.Zmluva;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AssignmentApplication {

    private static final Logger log = Logger.getLogger(AssignmentApplication.class.getSimpleName());

    public static void main(String[] args) {

       List<Osoba> osobaList = new ArrayList<>();

       Adresa a1 = new Adresa("08641", "Raslavice", "Hlavna","699" );
       Osoba os1 = new Osoba(1,  "Zuzana", "Chalupkova", "930703/5474", "zuz@gmail.com",a1);
       Osoba os2 = new Osoba(1,  "Fero", "Miklosko", "930703/5474", "fero@gmail.com",a1);
        Osoba os3 = new Osoba(1,  "Milan", "Miklosko", "930703/5474", "fero@gmail.com",a1);
       Zmluva z1 = new Zmluva(1, os1, os2,400, 150);
       osobaList.add(os1);
       osobaList.add(os2);
    }
}
