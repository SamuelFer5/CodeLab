
package practicapoo;
public class Perro {

    private String raza;
    private byte edad;

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public Perro(byte edad) {
        this.edad = edad;
    }

    public Perro(String raza, byte edad) {
        this.raza = raza;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
    
    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }
    public void comer(){
        System.out.println("El perro esta comiendo");
    }
    @Override
    public String toString() {
        return "---Perro---\n" + "Raza: " + this.raza + " Edad: " + this.edad + "\n";
    }

}
