public class Flor {
    private String actitud;
    private String apariencia;

    // Getter para la actitud  
    //Getter: Es un método que permite obtener el valor de un atributo privado.
    public String getActitud() {
        return actitud;
    }

    // Getter para la apariencia
    public String getApariencia() {
        return apariencia;
    }

    // Setter para la actitud
    // Setter: Es un método que permite modificar el valor de un atributo privado.
    public void setActitud(String newActitud) {
        this.actitud = newActitud;
    }

    // Setter para la apariencia
    public void setApariencia(String newApariencia) {
        this.apariencia = newApariencia;
    }
}
