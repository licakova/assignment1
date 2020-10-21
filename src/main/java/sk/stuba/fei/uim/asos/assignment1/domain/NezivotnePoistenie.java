package sk.stuba.fei.uim.asos.assignment1.domain;

import java.util.Date;

public abstract class NezivotnePoistenie extends Zmluva {

    int typ;
    Adresa adresa;
    float hodnotaNehnutelnosti;
    float hodnotaZariadenia;
    boolean poistenieGaraze;

    //poistenie domacnosti
    public NezivotnePoistenie(Object id, Date datumVzniku, Osoba poistovatel, Date zaciatok, Date koniec, float vyskaPoistnehoPlnenia, float vyskaMesacnejSplatky, int typ, Adresa adresa, float hodnotaNehnutelnosti, float hodnotaZariadenia) {
        super(id, datumVzniku, poistovatel, zaciatok, koniec, vyskaPoistnehoPlnenia, vyskaMesacnejSplatky);
        this.typ = typ;
        this.adresa = adresa;
        this.hodnotaNehnutelnosti = hodnotaNehnutelnosti;
        this.hodnotaZariadenia = hodnotaZariadenia;
    }

    //poistenie domu a bytu
    public NezivotnePoistenie(Object id, Date datumVzniku, Osoba poistovatel, Date zaciatok, Date koniec, float vyskaPoistnehoPlnenia, float vyskaMesacnejSplatky, int typ, Adresa adresa, float hodnotaNehnutelnosti, boolean poistenieGaraze) {
        super(id, datumVzniku, poistovatel, zaciatok, koniec, vyskaPoistnehoPlnenia, vyskaMesacnejSplatky);
        this.typ = typ;
        this.adresa = adresa;
        this.hodnotaNehnutelnosti = hodnotaNehnutelnosti;
        this.poistenieGaraze = poistenieGaraze;
    }
}
