package Criaturas;

public class Main {
    public static void main(String[] args) {
        
        Arma espada = new Arma("Espada de Acero", 10);
        Arma baston = new Arma("Bastón Mágico", 15);
        Arma garras = new Arma("Garras de Fuego", 20);

        
        Guerrero guerrero = new Guerrero("Leonidas", 100, 20);
        Mago mago = new Mago("Merlín", 80, 15);
        Dragon dragon = new Dragon("Smaug", 150, 25);

        
        guerrero.equiparArma(espada);
        mago.equiparArma(baston);
        dragon.equiparArma(garras);

        System.out.println("\n⚔️ ¡Comienza la batalla!\n");

        
        guerrero.atacar(dragon);
        dragon.atacar(guerrero);

        mago.lanzarHechizo();
        mago.atacar(dragon);
        dragon.atacar(mago);

        guerrero.atacar(mago);

        System.out.println("\n🔚 Estado final:");
        System.out.println(guerrero.getNombre() + " salud: " + guerrero.getSalud());
        System.out.println(mago.getNombre() + " salud: " + mago.getSalud());
        System.out.println(dragon.getNombre() + " salud: " + dragon.getSalud());
    }
}