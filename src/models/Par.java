package models;

public class Par <K,V> {
    private K clave;
    private V valor;
    
    public K getClave() {
        return clave;
    }

    public void setClave(K clave) {
        this.clave = clave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }
    
    public Par(K clave, V valor){
        this.clave = clave;
        this.valor = valor;
    }

    public void establecerClave(K clave){
        this.clave = clave;
    }

    public K obtenerClave(){
        return clave;
    }

    public void establecerValor(V valor){
        this.valor = valor;
    }

    public V obtenerValor(){
        return valor;
    }

    @Override
    public String toString() {
        return "Par [clave=" + clave + ", valor=" + valor + "]";
    }
    
    

    

    //se coloca la clase envoltorio de los valores con los que se trabaja, el constructor inicializado puede tomar cualquier clase
    //no puede construirse un entero y asignarle un valor de String
    //no puede construirse un string y asignarle un valor de entero


}
//