package Interfaz;

public class Presenter implements MyInterface{

    @Override
    public void mostarLoginCorrecto() {
        System.out.println("Login correcto");
    }

    @Override
    public void mostarLoginIncorrecto() {
        System.out.println("Login incorrecto");
    }
}
