package atsiskaitymai.pirmas;

import java.util.Scanner;

public class ArLaimingasLoterijosBilietas {

    public static void main(String[] args) {

        int[] bilietoSkaiciai = new int[6];
        int pirmuSkaiciuSuma = 0;
        int paskutiniuSkaiciuSuma = 0;
        boolean laimingasBilietas = false;
        int count = 0;
        int countSameNumbers = 1;


        while (!laimingasBilietas) {
            System.out.println("Iveskite skaiciu: ");
            Scanner scanner = new Scanner(System.in);

            int bilietoNumeris = scanner.nextInt();

            for (int indexas = bilietoSkaiciai.length - 1; indexas >= 0; indexas--) {
                bilietoSkaiciai[indexas] = bilietoNumeris % 10;
                bilietoNumeris /= 10;
            }
            for (int indexas = 1; indexas < bilietoSkaiciai.length; indexas++) {

                if (bilietoSkaiciai[indexas - 1] == bilietoSkaiciai[indexas]) {
                    countSameNumbers++;
                }
            }

            pirmuSkaiciuSuma = bilietoSkaiciai[0] + bilietoSkaiciai[1] + bilietoSkaiciai[2];
            paskutiniuSkaiciuSuma = bilietoSkaiciai[3] + bilietoSkaiciai[4] + bilietoSkaiciai[5];

            System.out.println("countnumbers: " + countSameNumbers);
            if (countSameNumbers == 6) {
                System.out.println("Neteisingas bilieto numeris");
                break;
            } else if (pirmuSkaiciuSuma == paskutiniuSkaiciuSuma) {
                laimingasBilietas = true;
                System.out.println("Laimingas bilietas! ");
                System.out.println("Jums prireike: " + count + " spejimu.");
            } else {
                System.out.println("Nelaimingas bilietas.. ");
                System.out.println("Pirmu skaiciu suma = " + pirmuSkaiciuSuma);
                System.out.println("Paskutiniu skaiciu suma = " + paskutiniuSkaiciuSuma);
                count++;
            }
        }
    }
}
