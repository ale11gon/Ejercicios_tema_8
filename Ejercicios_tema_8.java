
public class Main
{
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setEdad(20);
        persona.setNombre("Alberto");
        persona.setTelefono(123456);
        
        System.out.println("Tiene "+persona.getEdad()+" anos");
        System.out.println("Se llama "+persona.getNombre());
        System.out.println("Su telefono es "+persona.getTelefono());
        
    }
}

class Persona{
    private int edad;
    private String nombre;
    private int telefono;
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    
    public int getTelefono(){
        return this.telefono;
    }
}
