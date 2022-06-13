package Obligatorisk_Oppgave1_2;

public class Vare {
    private String navn;
    private int antall;
    private double pris;

    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
    public void setAntall(int antall) {
        if(antall > 0) {
            this.antall = antall;
        }
    }
    public void setPris(double pris) {
        if(pris > 0) {
            this.pris = pris;
        }
    }

    public String getNavn() {
        return navn;
    }
    public int getAntall() {
        if(antall < 0) {
            antall = 0;
        }
        return antall;
    }
    public double getPris() {
        if(pris < 0) {
            pris = 0;
        }
        return pris;
    }
    public double beregnPris() {
        double pris = getPris() * getAntall();
        return pris;
    }
}
