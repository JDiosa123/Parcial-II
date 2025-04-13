
package criaturas;
import Arma.Arma;

public class Dragon extends Criaturas implements Volador {

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criaturas objetivo) {
        int daño = fuerza * 2;
        if (arma != null) {
            arma.atacarConArma();
            daño += arma.getDañoAdicional();
        }
        System.out.println(nombre + " ataca con fuego AZUL causando " + daño + " de Impacto.");
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibio " + daño + " de Impacto. Salud restante: " + salud);
    }

    @Override
    public void volar() {
        System.out.println(nombre + " esta volando.");
    }

    @Override
    public void aterrizar() {
        System.out.println(nombre + " aterrizo.");
    }

}