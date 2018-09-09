package mp.hometasker;

import java.time.LocalDateTime;

public class Task {
    private String opis;
    private Person osoba;
    private int punkty;
    private LocalDateTime terminWykonania;

    public Task(){
    }

    public Task(String opis, Person osoba, int punkty, LocalDateTime terminWykonania) {
        this.opis = opis;
        this.osoba = osoba;
        this.punkty = punkty;
        this.terminWykonania = terminWykonania;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Person getOsoba() {
        return osoba;
    }

    public void setOsoba(Person osoba) {
        this.osoba = osoba;
    }

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    public LocalDateTime getTerminWykonania() {
        return terminWykonania;
    }

    public void setTerminWykonania(LocalDateTime terminWykonania) {
        this.terminWykonania = terminWykonania;
    }
}
