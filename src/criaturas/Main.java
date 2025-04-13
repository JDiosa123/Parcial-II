package criaturas;
import Arma.Arma;

public class Main {
    public static void main(String[] args) {
        
        Arma espada = new Arma("Espada de diamante", 10);
        Arma baston = new Arma("Barita Magica", 15);
        Arma garras = new Arma("Garras de Fuego AZUL", 20);

        
        Guerrero guerrero = new Guerrero("Steve", 100, 20);
        Mago mago = new Mago("Gandalf", 80, 15);
        Dragon dragon = new Dragon("Fionx", 150, 25);

        
        guerrero.equiparArma(espada);
        mago.equiparArma(baston);
        dragon.equiparArma(garras);

        System.out.println("\n️¡Comienza la batallaAaAa!\n");

        
        guerrero.atacar(dragon);
        dragon.atacar(guerrero);

        mago.lanzarHechizo();
        mago.atacar(dragon);
        dragon.atacar(mago);

        guerrero.atacar(mago);

        System.out.println("\n Estado final:");
        System.out.println(guerrero.getNombre() + " salud: " + guerrero.getSalud());
        System.out.println(mago.getNombre() + " salud: " + mago.getSalud());
        System.out.println(dragon.getNombre() + " salud: " + dragon.getSalud());
    }
}