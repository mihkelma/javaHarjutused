package loginDb;

import java.util.Scanner;

/**
 * Created by mmatson on 22.11.15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sisesta kasutajanimi: ");
        String kasutajaNimi = sc.nextLine();
        System.out.println("Sisesta parool: ");
        String parool = sc.nextLine();

        Andmebaas andmebaas = new Andmebaas();
        //andmebaas.looTabel();

        boolean kasutajaEksisteerib = andmebaas.kasOnOlemas(kasutajaNimi);
        //System.out.println(kasutajaEksisteerib);

        if(kasutajaEksisteerib){
            //logi sisse
            System.out.println("Oled sisse loginud!");
        } else {
            //registreeri kasutaja
            andmebaas.registreeri(kasutajaNimi,parool);
        }
        andmebaas.sulgeYhendus();
    }
}
