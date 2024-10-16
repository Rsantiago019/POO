public class Tablero {
    private   Casillero [][] casilleros;// Matriz de objetos Casillero
    private int filas;
    private int columnas;

    

    // Constructor Vacio
    public Tablero() {
    }

    //Constructor

   
    public Tablero(int filas, int columnas)
    {
        this.filas= filas;
        this.columnas = columnas;
        this.casilleros = new Casillero[filas][columnas];
        GenerarCasilleros(); // Este metodo llena los casilleros con objetos Casillero

    }
    private void GenerarCasilleros()
    {
        for (int i = 0; i<filas ; i++)
        {
            for(int j = 0; j < columnas;j++)
            {
                casilleros[i][j] = new Casillero("Blanco");
            }
        }
    }

    public Casillero getCasillero (int fila, int columna)
    {
         return casilleros [fila][columna];
    }
    public void setCasillero(int fila, int columna, Casillero casillero) {
        casilleros[fila][columna] = casillero ;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public Casillero[][] getCasilleros() {
        return casilleros;
    }

    public void setCasilleros(Casillero[][] casilleros) {
        this.casilleros = casilleros;
    }
    
    

    


    
}
