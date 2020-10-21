package sk.stuba.fei.uim.asos.assignment1.domain;

import java.util.Date;

public abstract class ZivotnePoistenie extends Zmluva {

    boolean eu;
    int ucelCesty;
    float trvaleNasledkyUrazu;
    float smrtDosledkuUrazu;
    float denneOdskodneZaHospitalizaciu;
    int uzemnaPlatnost;


    //cesovne poistenie
    public ZivotnePoistenie(Object id, Date datumVzniku, Osoba poistovatel, Date zaciatok, Date koniec, float vyskaPoistnehoPlnenia, float vyskaMesacnejSplatky, boolean eu, int ucelCesty) {
        super(id, datumVzniku, poistovatel, zaciatok, koniec, vyskaPoistnehoPlnenia, vyskaMesacnejSplatky);
        this.eu = eu;
        this.ucelCesty = ucelCesty;
    }

    //urazove poistenie
    public ZivotnePoistenie(Object id, Date datumVzniku, Osoba poistovatel, Date zaciatok, Date koniec, float vyskaPoistnehoPlnenia, float vyskaMesacnejSplatky, float trvaleNasledkyUrazu, float smrtDosledkuUrazu, float denneOdskodneZaHospitalizaciu, int uzemnaPlatnost) {
        super(id, datumVzniku, poistovatel, zaciatok, koniec, vyskaPoistnehoPlnenia, vyskaMesacnejSplatky);
        this.trvaleNasledkyUrazu = trvaleNasledkyUrazu;
        this.smrtDosledkuUrazu = smrtDosledkuUrazu;
        this.denneOdskodneZaHospitalizaciu = denneOdskodneZaHospitalizaciu;
        this.uzemnaPlatnost = uzemnaPlatnost;
    }
}
