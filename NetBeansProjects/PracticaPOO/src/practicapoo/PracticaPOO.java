package practicapoo;

public class PracticaPOO {

    public static void main(String[] args) {
        CRUDPerro cp = new CRUDPerro();
        cp.setVisible(true);//Para hacerlo visible 
        cp.setResizable(false);//Para que el usuario no pueda modificar el tamano de la ventana
        cp.setLocationRelativeTo(null);//Para que la ventana este centrada y no en la esquina
        
        
        
        
        
        /*Perro perroUno = new Perro();
       Perro perroDos = new Perro("Bulldog");
       System.out.println(perroDos.getRaza());
       Perro perroTres = new Perro((byte)10);
       System.out.println(perroTres.getEdad());
       Perro perroCuatro = new Perro("Salchichon",(byte)2);
       System.out.println(perroCuatro.toString());
       perroUno.comer();*/
    }

}
