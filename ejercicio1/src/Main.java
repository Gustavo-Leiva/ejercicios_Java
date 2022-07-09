/*

Para practicar la encapsulación:
1) Crear clase Persona.
2) Crear variables las privadas edad, nombre y telefono de la clase Persona.
3) Crear gets y sets de cada propiedad.
4) Crear un objeto persona en el main.
5) Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
por último muéstralas por consola.
 */


public class Main {
    public static void main(String[] args) {
        /*punto 4) Crear un objeto persona en el main.*/
        Persona persona = new Persona();

        //Punto 5) Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono,
        persona.setEdad(40);
        persona.setNombre("Gustavo");
        persona.setTelefono(1533331243);

        //Punto 5) Utiliza los gets y por último muéstralas por consola.
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getTelefono());

    }

}

//punto 1) Crear clase Persona
class Persona{
    //punto 2) Crear variables las privadas edad, nombre y telefono de la clase Persona.
    private int edad;
    private String nombre;
    private int telefono;



        //3) Crear gets y sets de cada propiedad.
        public void setEdad (int edad){
            this.edad = edad;
        }

        public void setNombre (String nombre){
          this.nombre= nombre;
        }

        public void setTelefono (int telefono){
            this.telefono = telefono;
        }

        public int getEdad(){
           return this.edad;
        }

        public int getTelefono(){
            return  this.telefono;
        }

        public String getNombre(){
            return  this.nombre;
        }

}