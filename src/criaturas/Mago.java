
package criaturas;



public class Mago extends Criaturas implements Magico {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

   @Override
    public void atacar(Criaturas objetivo) {
        int daño = fuerza;
        if (arma != null) {
            daño += arma.atacarConArma();
            System.out.println(nombre + " lanza un hechizo con " + arma.getNombre() + " causando " + daño + " de daño.");
        } else {
            System.out.println(nombre + " lanza un hechizo causando " + daño + " de daño.");
        }
        objetivo.defender(daño);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibe " + daño + " de daño. Salud restante: " + salud);
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un hechizo mágico.");
    }

    @Override
    public void aprenderHechizo() {
        System.out.println(nombre + " aprende un nuevo hechizo.");
    }
}

