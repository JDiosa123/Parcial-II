
package criaturas;

public class Dragon extends Criaturas implements Volador{
    
    public Dragon(String nombre, int salud, int fuerza){
    super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criaturas objetivo){
        int daño = fuerza * 2;
        if(Arma!= null){
            daño = Arma.atacarConArma(daño);
            System.out.println(nombre + "atacar con arma: " + Arma.getNombre());
        }
        System.out.println(nombre + "lanza fuego a " + objetivo.getNombre()+ " con fuerza" + daño);
        objetivo.defender(daño);
    }
    @Override
    public void defender(int daño){
        salud -= daño;
        System.out.println(nombre + "recibe" + daño + " de daño. Su salud actual es: "+ salud);        
    }
    @Override
    public void volar(){
        System.out.println(nombre + "esta volando");
    }
    @Override
    
    public void aterrizar(){
        System.out.println(nombre + "aterriza");
    }
}
