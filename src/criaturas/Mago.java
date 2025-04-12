
package criaturas;



public abstract class Mago extends Criaturas implements Magico {

    private String hechizo;

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
        this.hechizo = "Bola de fuego";
    }

    @Override
    public void atacar(Criaturas objetivo) {
        lanzarHechizo(objetivo);
    }

    @Override
    public void defender(int daño) {
        salud -= daño;
        System.out.println(nombre + " recibió " + daño + " de daño. Salud restante: " + salud);
    }

    @Override
    public void lanzarHechizo(Criaturas objetivo) {
        int daño = fuerza;
        if (Arma != null) {
            Arma.atacarConArma();
            daño += Arma.getDañoAdicional();
        }
        System.out.println(nombre + " lanza el hechizo " + hechizo + " causando " + daño + " de daño.");
        objetivo.defender(daño);
    }

    public void aprenderHechizo(String hechizo) {
        this.hechizo = hechizo;
        System.out.println(nombre + " aprendió un nuevo hechizo: " + hechizo);
    }
}
