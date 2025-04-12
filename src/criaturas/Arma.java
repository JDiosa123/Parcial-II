
package criaturas;

public class Arma {

private String Nombre;
private int dañoAdicional;

public Arma(String Nombre, int dañoAdicional){

    this.Nombre=Nombre;
    this.dañoAdicional=dañoAdicional;
    
}
public void atacarConArma(int fuerza){
    return fuerza + dañoAdicional;
    }
 
    public int getDañoAdicional() {
        return dañoAdicional;
    }

public String getNombre(){
return Nombre;
}
    
}
