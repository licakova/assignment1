package sk.stuba.fei.uim.asos.assignment1.domain;

import sk.stuba.fei.uim.asos.assignment1.service.IUserService;

import java.util.List;

public class Osoba extends AbstractUser implements IUserService {

     String meno;
     String priezvisko;
     String rCislo;
     String email;
     Adresa adresaTrvalehoPobytu;
     String adresaKorespondencna;
     List<Zmluva> zmluvaList;

    public Osoba(Object id, String meno, String priezvisko, String rCislo, String email, String adresaKorespondencna, List<Zmluva> zmluvaList) {
        super(id);
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.rCislo = rCislo;
        this.email = email;
        this.adresaKorespondencna = adresaKorespondencna;
        this.zmluvaList = zmluvaList;
    }

    public Osoba(Object id, String meno, String priezvisko, String rCislo, String email, String adresaKorespondencna) {
        super(id);
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.rCislo = rCislo;
        this.email = email;
        this.adresaKorespondencna = adresaKorespondencna;
    }
    public Osoba(Object id, String meno, String priezvisko, String rCislo, String email, Adresa adresaTrvalehoPobytu) {
        super(id);
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.rCislo = rCislo;
        this.email = email;
        this.adresaTrvalehoPobytu = adresaTrvalehoPobytu;
    }


    public Osoba(Object id, String meno, String priezvisko, String rCislo, String email, Adresa adresaTrvalehoPobytu, List<Zmluva> zmluvaList) {
        super(id);
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.rCislo = rCislo;
        this.email = email;
        this.adresaTrvalehoPobytu = adresaTrvalehoPobytu;
        this.zmluvaList = zmluvaList;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public String getrCislo() {
        return rCislo;
    }

    public void setrCislo(String rCislo) {
        this.rCislo = rCislo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adresa getAdresaTrvalehoPobytu() {
        return adresaTrvalehoPobytu;
    }

    public void setAdresaTrvalehoPobytu(Adresa adresaTrvalehoPobytu) {
        this.adresaTrvalehoPobytu = adresaTrvalehoPobytu;
    }

    public String getAdresaKorespondencna() {
        return adresaKorespondencna;
    }

    public void setAdresaKorespondencna(String adresaKorespondencna) {
        this.adresaKorespondencna = adresaKorespondencna;
    }

    public List<Zmluva> getZmluvaList() {
        return zmluvaList;
    }

    public void setZmluvaList(List<Zmluva> zmluvaList) {
        this.zmluvaList = zmluvaList;
    }



    @Override
    public String toString() {
        return null;
    }

    @Override
    public AbstractUser add(AbstractUser user) {
        return null;
    }

    @Override
    public AbstractUser update(AbstractUser user) {
        return null;
    }

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public AbstractUser getOne(Object id) {
        return null;
    }
}
