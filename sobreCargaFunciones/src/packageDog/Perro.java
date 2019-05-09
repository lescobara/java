package packageDog;

//tomado de https://www.abrirllave.com/java/sobrecarga-de-metodos-y-constructores.php


public class Perro
{
    private String nombre;
    private int edad;

    public Perro(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public void cambiar(String nombre)
    {
        this.nombre = nombre;
    }

    public void cambiar(int edad)
    {
        this.edad = edad;
    }

    public void cambiar(String nombre, int edad )
    {
        this.nombre = nombre;
        this.edad = edad;
    }
}