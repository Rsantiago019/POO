public class Jugador {
    private String Tiempo;
    private String Resultado;
    private String Color_Jugador;


    public String getTiempo() {
        return Tiempo;
    }
    public void setTiempo(String tiempo) {
        Tiempo = tiempo;
    }
   
    
    public String getResultado() {
        return Resultado;
    }
    public void setResultado(String resultado) {
        Resultado = resultado;
    }
    public String getColor_Jugador() {
        return Color_Jugador;
    }
    public void setColor_Jugador(String color_Jugador) {
        Color_Jugador = color_Jugador;
    }
    
    // Constructor Vacio
        public Jugador() {
    }
    
    //Constructor
    public Jugador(String tiempo, String resultado, String color_Jugador) {
        Tiempo = tiempo;
        Resultado = resultado;
        Color_Jugador = color_Jugador;
    }
}
     




    

