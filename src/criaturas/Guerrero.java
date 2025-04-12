
package criaturas;


public class Guerrero extends Criaturas {

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    
    @Override
    public void atacar(Criaturas objetivo) {
        int daño = fuerza;
        if (arma != null) {
            daño += arma.atacarConArma();
            System.out.println(nombre + " ataca con " + arma.getNombre() + " causando " + daño + " de daño.");
        } else {
            System.out.println(nombre + " ataca con espada causando " + daño + " de daño.");
        }
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }
}

    

