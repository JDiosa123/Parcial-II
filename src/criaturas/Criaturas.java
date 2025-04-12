
package criaturas;

public abstract class Criaturas {

    protected String nombre;
    protected int salud;
    protected int fuerza;
 
    
    
public Criaturas(String nombre, int salud, int fuerza){
    
    this.fuerza = fuerza;
    this.nombre = nombre;
    this.salud = salud;
    
}    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }


     public abstract void atacar(Criaturas objeto);
     public abstract void defender(int daño);
     
     
     
     
     public boolean estaViva(){
    
    return salud > 0;
}

    

}
