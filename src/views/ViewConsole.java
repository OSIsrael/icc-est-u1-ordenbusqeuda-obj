package views;

import models.Persona;

public class ViewConsole {
    public void printArray(Persona[] personas){
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
    public void showMessage(String message){
        System.out.println("\n" +message);
    }
    public void showPerson(Persona persona){
        System.out.println(persona);
    }
}
