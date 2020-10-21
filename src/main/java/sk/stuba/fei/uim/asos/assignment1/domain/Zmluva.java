package sk.stuba.fei.uim.asos.assignment1.domain;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public  class Zmluva extends AbstractInsuranceContract{

    Date datumVzniku;
    Osoba poistovatel;
    Osoba poistnec;
    Date zaciatok;
    Date koniec;
    float vyskaPoistnehoPlnenia;
    float vyskaMesacnejSplatky;


    public Zmluva(Object id, Osoba poistovatel, Osoba poistenec, float vyskaPoistnehoPlnenia, float vyskaMesacnejSplatky) {
        super(id);
        this.datumVzniku = new Date();
        this.poistovatel = poistovatel;
        this.poistnec = poistenec;
        Calendar c = Calendar.getInstance();
        c.setTime(datumVzniku);
        c.add(Calendar.DATE, 14);
        this.zaciatok = c.getTime();
        c.add(Calendar.YEAR, 5);
        this.koniec = c.getTime();
        this.vyskaPoistnehoPlnenia = vyskaPoistnehoPlnenia;
        this.vyskaMesacnejSplatky = vyskaMesacnejSplatky;
    }

    @Override
    public String toString() {
        return null;
    }
}
