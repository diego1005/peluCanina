package Logica;


public class Cliente {
    private int num_cliente;
    private String nombre_perro;
    private String raza;
    private String color;
    private boolean alergico;
    private boolean atencion_especial;
    private String nombre_dueño;
    private String celular_dueño;
    private String observaciones;

    public Cliente() {
    }

    public Cliente(int num_cliente, String nombre_perro, String raza, String color, boolean alergico, boolean atencion_especial, String nombre_dueño, String celular_dueño, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.nombre_dueño = nombre_dueño;
        this.celular_dueño = celular_dueño;
        this.observaciones = observaciones;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAlergico() {
        return alergico;
    }

    public void setAlergico(boolean alergico) {
        this.alergico = alergico;
    }

    public boolean isAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(boolean atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getNombre_dueño() {
        return nombre_dueño;
    }

    public void setNombre_dueño(String nombre_dueño) {
        this.nombre_dueño = nombre_dueño;
    }

    public String getCelular_dueño() {
        return celular_dueño;
    }

    public void setCelular_dueño(String celular_dueño) {
        this.celular_dueño = celular_dueño;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
    
    
}
