package criaturas;
import Arma.Arma;

public class Guerrero extends Criaturas {

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    
    @Override
    public void atacar(Criaturas objetivo) {
        int daño = fuerza;
        if (arma != null) {
            daño += arma.atacarConArma();
            System.out.println(nombre + " ataca con " + arma.getNombre() + " causando " + daño + " de Impacto.");
        } else {
            System.out.println(nombre + " ataca con espada causando " + daño + " de Impacto.");
        }
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de Impacto. Salud restante: " + salud);
    }
}

    

