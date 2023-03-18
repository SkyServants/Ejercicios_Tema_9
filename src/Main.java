public class Main {
    public static void main(String[] args) {

        //Creacion de Objeto de la clase Cliente que hereda de la clase Persona
        Cliente cliente = new Cliente();

        cliente.setNombre("Charlotte");
        System.out.println("Nombre del cliente:"+" "+ cliente.getNombre());
        cliente.setEdad(20);
        System.out.println("Edad del cliente:"+" "+ cliente.getEdad());
        cliente.setTelefono("992334567");
        System.out.println("Número de teléfono del cliente:"+" "+ cliente.getTelefono());

        cliente.setCredito((float)500.05);
        System.out.println("El crédito del cliente:"+" "+ cliente.getCredito()  +" "+ "Euros");

        //Creacion de Objeto de la clase Trabajador que hereda de la clase Persona
        Trabajador trabajador = new Trabajador();

        trabajador.setNombre("Alexander");
        System.out.println("Nombre del Trabajador:"+" "+ trabajador.getNombre());
        trabajador.setEdad(32);
        System.out.println("Edad del Trabajador:"+" "+ trabajador.getEdad());
        trabajador.setTelefono("3210000000");
        System.out.println("Número de teléfono del Trabajador:"+" "+ trabajador.getTelefono());

        trabajador.setSalario((float)7000.25);
        System.out.println("El Salario del Trabajador:"+" "+ trabajador.getSalario() +" "+ "Euros");



    }
}

//Clase Persona
class Persona{
    String nombre;
    int edad;
    String telefono;

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return this.telefono;
    }



}

//Clase Cliente que hereda de Persona
class Cliente extends Persona
{
    float credito;

    public void setCredito(float credito){
        this.credito = credito;
    }

    public float getCredito(){
        return this.credito;
    }

}

//Clase trabajador que hereda de Persona;
class Trabajador extends Persona
{
    float salario;

    public void setSalario(float salario){
        this.salario = salario;
    }

    public float getSalario(){
        return this.salario;
    }

}
