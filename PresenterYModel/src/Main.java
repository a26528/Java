import Interfaz.MyInterface;
import Interfaz.Presenter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");


        MyInterface  miPresentador = new Presenter();

        Thread thread = new Thread() {
            Scanner input = new Scanner(System.in);

            while(true){
                System.out.println("Simula un 0 - correcto");
                System.out.println("Simula un 1 - incorrecto");
                System.out.println("dame un valor");
                if (inputValue == 0) {
                    System.out.println("Success");
                    miPresentador.mostarLoginCorrecto();
                }else {
                    System.out.println("Failure");
                    miPresentador.mostarLoginIncorrecto();
                }
            }
        };
        thread.start();
    }
}