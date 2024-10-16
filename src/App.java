public class App {
    private static int numero_pieza = 0;     
    // Contador estático para llevar la cuenta de 
    //cuántas piezas se han creado fuente : https://es.stackoverflow.com/questions/259367/contador-de-objetos

    // TOTAL DE PIEZAS 32    8 peones + 2 alfies + 2 caballos + 1 rey + 1 reina + 2 torres 
    public static void main(String[] args) {
        // Llamada a GenerarPiezas
        GenerarPiezas();
    }

    // Procedimiento para generar peones

    // Genero las piezas 
    public static void GenerarPiezas() {
        
        Rey Rey_Blanco = new Rey("Blanco", "Delante", "Tenue");
        ImprimirPiezas(Rey_Blanco);

        Rey Rey_Negro = new Rey("Negro", "Delante", "Tenue");
        ImprimirPiezas(Rey_Negro);

        Reina Reina_Blanca = new Reina("Blanco", "En cuadrado", "Encarnizada");
        ImprimirPiezas(Reina_Blanca);

        Reina Reina_Negra = new Reina("Negro", "En cuadrado", "Encarnizada");
        ImprimirPiezas(Reina_Negra);
        // Las siguientes piezas segun el Ajedrez son 2 por cada color
        for (int i= 1 ; i<=2; i++)
        {
            Caballo Caballo_Negro = new Caballo("Negro", "L", "Ligero");
                
            ImprimirPiezas(Caballo_Negro);
            
            Caballo Caballo_Blanco = new Caballo("Blanco", "L", "Ligero");
                
                ImprimirPiezas(Caballo_Blanco);    
            Torre Torre_Blanca = new Torre("Blanco", "Directa", "Homerica");
                
                ImprimirPiezas(Torre_Blanca);

            Torre Torre_Negra = new Torre("Negro", "Directa", "Homerica");
                
                ImprimirPiezas(Torre_Negra);
            Alfil Alfil_Negro = new Alfil("Negro", "Oblicuo", "Sesgado");
                
                ImprimirPiezas(Alfil_Negro);

            Alfil Alfil_Blanco = new Alfil("Blanco", "Lento", "Sesgado");
                
                ImprimirPiezas(Alfil_Blanco);
        }
        //Genero 8 peones
        for (int i = 1; i <= 8; i++) {
            
            Peon Peon_Blanco = new Peon("Blanco", "Ladino", "Agresor");

                ImprimirPiezas(Peon_Blanco); 
            
            Peon Peon_Negro = new Peon("Negro", "Ladino", "Agresor");

                ImprimirPiezas(Peon_Negro);  
        }
    }

    // atributo pieza  El parámetro pieza es un objeto de tipo Pieza. Como todas las piezas del ajedrez
    // (como Peon, Alfil, Rey, etc.)
     //heredan de la clase Pieza, puedes pasar instancias de cualquier subclase de Pieza a esta función.
    
     public static void ImprimirPiezas(Pieza pieza) {
    
        int totalPiezas = ContadorPiezas();  // Obtén el número de la pieza
    
        System.out.println("Numero de pieza : " + totalPiezas + "\n");
    
        System.out.println("---"+ pieza.getTipoPieza()+"---");
    
        System.out.println("Color: " + pieza.getColorPieza());
    
        System.out.println("Movimiento: " + pieza.getMovimiento());
    
        System.out.println("Caracter: " + pieza.getCaracter());
    
        System.out.println("\n");
    }

    // Funcion para contar  piezas
    public static int ContadorPiezas() {
        
        numero_pieza++;  // Incrementa el número de pieza
        
        return numero_pieza;  // Retorna el valor actualizado
    }
}
