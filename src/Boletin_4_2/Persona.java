package Boletin_4_2;

import java.time.LocalDate;

public class Persona {
    // Atributos
    private String nombre;
    private LocalDate fechaNacimiento;
    private int dni;
    private char sexo;
    private float altura;
    private float peso;

    // Constructor
    public Persona(String nombre, LocalDate fechaNacimiento, int dni, char sexo, float altura, float peso) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    // Método para obtener la letra del DNI
    public char getLetraDni() {
        // Se asume que el DNI tiene 8 dígitos
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indiceLetra = dni % 23;
        return letras.charAt(indiceLetra);
    }

    // Método para calcular el Índice de Masa Corporal (IMC)
    public float getIMC() {
        // Convertir la altura a metros
        float alturaMetros = altura / 100;
        // Calcular el IMC
        return peso / (alturaMetros * alturaMetros);
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Ejemplo de uso
        Persona persona = new Persona("Juan", LocalDate.of(1990, 5, 15), 12345678, 'M', 175.5f, 70.0f);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());
        System.out.println("DNI: " + persona.getDni() + persona.getLetraDni());
        System.out.println("Sexo: " + persona.getSexo());
        System.out.println("Altura: " + persona.getAltura() + " cm");
        System.out.println("Peso: " + persona.getPeso() + " kg");
        System.out.println("IMC: " + persona.getIMC());
    }
}
