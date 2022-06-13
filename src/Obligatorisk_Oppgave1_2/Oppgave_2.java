package Obligatorisk_Oppgave1_2;

import javax.swing.*;

public class Oppgave_2 {
    public static void main(String[] args) {
        String navnVare1 = JOptionPane.showInputDialog("Hva er navnet på varen?");
        String innAntallVare1 = JOptionPane.showInputDialog("Hvor mange er det av varen?");
        String innPrisVare1 = JOptionPane.showInputDialog("Hva er prisen på varen?");

        String navnVare2 = JOptionPane.showInputDialog("Hva er navnet på varen?");
        String innAntallVare2 = JOptionPane.showInputDialog("Hvor mange er det av varen?");
        String innPrisVare2 = JOptionPane.showInputDialog("Hva er prisen på varen?");

        int antallVare1 = 0;
        try {
            antallVare1 = Integer.parseInt(innAntallVare1);
        } catch (Exception e) {
            System.out.println(e);
        }

        double prisvare1 = 0;
        try {
            prisvare1 = Double.parseDouble(innPrisVare1);
        } catch (Exception e) {
            System.out.println(e);
        }

        int antallVare2 = 0;
        try {
            antallVare2 = Integer.parseInt(innAntallVare2);
        } catch (Exception e) {
                System.out.println(e);
        }

        double prisvare2 = 0;
        try {
            prisvare2 = Double.parseDouble(innPrisVare2);
        } catch (Exception e) {
            System.out.println(e);
        }

        Vare vare1 = new Vare(navnVare1, antallVare1, prisvare1);
        Vare vare2 = new Vare(navnVare2, antallVare2, prisvare2);

        double totalPrisVare1 = vare1.beregnPris();
        double totalPrisVare2= vare2.beregnPris();
        double totalBeløp = totalPrisVare1 + totalPrisVare2;

        System.out.println("Totalprisen ble: "+String.format("%.1f", totalBeløp)+" kr");

    }
}
