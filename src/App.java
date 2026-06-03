import models.Caja;
import models.Par;
public class App {
    public static void main(String[] args) throws Exception {

    //implementaciones de clase generica Caja
    Caja<String> cajaString = new Caja<String>("Hola");
    Caja<Integer> cajaEntero = new Caja<Integer>(2);
    Caja<Float> cajaFloat = new Caja<Float>(2.16f);
    Caja<Boolean> cajaBoolean = new Caja<Boolean>(false);
    //implementaciones de clase generica Par
    Par<Integer,String> cajaEnteroString = new Par<Integer,String>(1, "Luis");
    Par<String,Integer> cajaStringEntero = new Par<String,Integer>("Edad", 20);
    Par<String,Double> cajaStringDouble = new Par<String,Double>("Promedio", 8.75);

    System.out.println("=== PRÁCTICA DE CLASES GENÉRICAS ===");
    System.out.println("--- Uso de Caja<T> ---");
    System.out.println("Caja de texto: " + cajaString.toString());
    System.out.println("Caja de entero: " + cajaEntero.toString());
    System.out.println("Caja de decimal: " + cajaFloat.toString());
    System.out.println("¿La caja de texto está vacía?" + cajaBoolean.toString());

    System.out.println("--- Uso de Par<K, V> ---");
    System.out.println("Clave: " + cajaEnteroString.getClave() + " " + "|" + 
                        "Valor: " + cajaEnteroString.getValor());

    System.out.println("Clave: " + cajaStringEntero.getClave() + " " + "|" + 
                        "Valor: " + cajaStringEntero.getValor());

    System.out.println("Clave: " + cajaStringDouble.getClave() + " " + "|" + 
                        "Valor: " + cajaStringDouble.getValor());

    }

}
