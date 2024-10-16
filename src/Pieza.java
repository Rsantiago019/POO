
public class  Pieza {
    private String Color_Pieza;
    private String Movimiento;
    private String Caracter;
    private String Velocidad;
    private String Tipo_Pieza;
    
   
     // Constructor 
     public Pieza(String color_Pieza, String movimiento, String caracter, String velocidad, String tipo_Pieza) {
        this.Color_Pieza = color_Pieza;
        this.Movimiento = movimiento;
        this.Caracter = caracter;
        this.Velocidad = velocidad;
        this.Tipo_Pieza = tipo_Pieza;
    }

    //Creacion de los Getters 
    public String getColor()
    {
     return Color_Pieza;
    }

    public String getMovimiento()
    {
        return Movimiento;
    }

    public String getCaracter() {
        return Caracter;
    }

    public String getVelocidad() {
        return Velocidad;
    }

    public String getColor_Pieza() {
        return Color_Pieza;
    }


     //Creacion de los Setters 
    public void setColor_Pieza(String color_Pieza) {
        Color_Pieza = color_Pieza;
    }

    public String getTipo_Pieza() {
        return Tipo_Pieza;
    }

    // Creacion de los Setters 
    public void setColor(String color) {
        Color_Pieza = color;
    }

    public void setMovimiento(String movimiento) {
        Movimiento = movimiento;
    }

    public void setCaracter(String caracter) {
        Caracter = caracter;
    }

    public void setVelocidad(String velocidad) {
        Velocidad = velocidad;
    }

    public void setTipo_Pieza(String tipo_Pieza) {
        Tipo_Pieza = tipo_Pieza;
    }

}
   
    // Constructor  vacio
   
