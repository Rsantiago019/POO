public class App {
    public static void main(String[] args) throws Exception {

        // Creo un Principito
        Principito unPrincipito = new Principito();
        // Asignación atributos Principito
        unPrincipito.setPersonalidad("Laburador");
        unPrincipito.setActitud("Programador");

        Flor MiFlor = new Flor();  // Creo MiFlor, el cual es un tipo de dato Flor
        Flor MiFlor2 = new Flor();
        // Asignación atributos flor
        MiFlor.setActitud("vanidosa");
        MiFlor.setApariencia("hermosa");

        System.out.println("\t----Valores de la Flor Originales----\n");
        System.out.println("Actitud :" + MiFlor.getActitud());
        System.out.println("Apariencia :" + MiFlor.getApariencia());
        System.out.println("\n");
        unPrincipito.setMiFlor(MiFlor); 
        ImprimirTexto(unPrincipito);
        System.out.println("\n");

        // Asigno una flor al Principito
        System.out.println("\n");

        // Llamada al método para imprimir los datos de la flor del Principito
        ImprimirFlorPrincipito(unPrincipito);
        
        System.out.println("----------------Ejercicio 3-------------------------------------\n");
            // Modificacion de mi  valores  Flor

            //Asigno una flor a  un principito 
        unPrincipito.setMiFlor(MiFlor2);
        MiFlor2.setActitud("Bondadosa"); //asignacion de la nueva Actitud
        MiFlor2.setApariencia("Delicada"); // asignacion de la nueva Apariencia

      // Nuevos valores para Personalidad y Actitud (solamente utilizo la personalidad)
        unPrincipito.setPersonalidad("predisposición ");  
        unPrincipito.setActitud(" estudioso ");
        ImprimirFlorPrincipito(unPrincipito); // Llamo al metodo para imprimir

        System.out.println("\n----------------Texto Modificado------------------------------------\n");

        ImprimirTexto(unPrincipito);
        
    }

    // Método para imprimir los datos de la flor del Principito
    public static void ImprimirFlorPrincipito(Principito unPrincipito) {
        System.out.println("Datos de la flor del Principito :");
        System.out.println("\nActitud: " + unPrincipito.getMiFlor().getActitud());
        System.out.println("\nApariencia: " + unPrincipito.getMiFlor().getApariencia());
        System.out.println("\nApariencia del Principito: "+ unPrincipito.getPersonalidad());
        System.out.println("\nActitud del principito "+unPrincipito.getActitud());

    }

    public static void ImprimirTexto(Principito unPrincipito)
    {
        System.out.println("El principito tenía una flor que amaba mucho. "+
        "Cuidaba de ella todos los días, la regaba y le quitaba las orugas."+" La flor, aunque un poco "+unPrincipito.getMiFlor().getActitud()+", era muy "+unPrincipito.getMiFlor().getApariencia()+" y agradecía al principito por su "+unPrincipito.getPersonalidad()+
         "Un día, el principito decidió explorar otros planetas y, aunque no quería dejar sola a su flor, sabía que debía continuar su viaje para aprender más sobre el universo.");
    }
}
