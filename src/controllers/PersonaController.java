package controllers;

import models.Persona;

public class PersonaController {
    public void sortByDireccionCodigo(Persona[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                // if (personas[j].getCodigoDireccion() < personas[minIdx].getCodigoDireccion())
                if (personas[j].equalsByCodigoDireccion(personas[minIdx])) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                Persona aux = personas[minIdx];
                personas[minIdx] = personas[i];
                personas[i] = aux;
            }
        }
    }

    public Persona findByCodigo(Persona[] personas, int codigo) {
        int bajo = 0;
        int alto = personas.length - 1;
        while (bajo <= alto) {
            int central = (bajo + alto) / 2;
            if (personas[central].equalsByCodigoDireccion(codigo)) {
                return personas[central];
            }
            if (personas[central].getCodigoDireccion() > codigo) {
                bajo = central + 1;
            } else {
                alto = central - 1;
            }
        }
        return null;
    }
}
