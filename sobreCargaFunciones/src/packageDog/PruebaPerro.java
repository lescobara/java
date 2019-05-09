package packageDog;

public class PruebaPerro
{
    public static void main(String[] args)
    {
        Perro perro1 = new Perro("Chispas", 5);
        Perro perro2 = new Perro("Sombra", 3);
        Perro perro3 = new Perro("Zeus", 7);

        System.out.println(perro1.getNombre() + " tiene " + perro1.getEdad() + " años.");
        System.out.println(perro2.getNombre() + " tiene " + perro2.getEdad() + " años.");
        System.out.println(perro3.getNombre() + " tiene " + perro3.getEdad() + " años.");

        perro1.cambiar("Jaque");
        perro2.cambiar(4);
        perro3.cambiar("Goku", 8);

        System.out.println("\nDespués de los cambios:");

        System.out.println(perro1.getNombre() + " tiene " + perro1.getEdad() + " años.");
        System.out.println(perro2.getNombre() + " tiene " + perro2.getEdad() + " años.");
        System.out.println(perro3.getNombre() + " tiene " + perro3.getEdad() + " años.");
    }
}
