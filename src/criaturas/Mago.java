
package criaturas;
import Arma.Arma;


public class Mago extends Criaturas implements Magico {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

   @Override
    public void atacar(Criaturas objetivo) {
        int daño = fuerza;
        if (arma != null) {
            daño += arma.atacarConArma();
            System.out.println(nombre + " lanza un hechizo con " + arma.getNombre() + " causando " + daño + " de Impacto.");
        } else {
            System.out.println(nombre + " lanza un hechizo causando " + daño + " de Impacto.");
        }
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de Impacto. Salud restante: " + salud);
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un hechizo magico.");
    }

    @Override
    public void aprenderHechizo() {
        System.out.println(nombre + " aprende un nuevo hechizo.");
    }
}

