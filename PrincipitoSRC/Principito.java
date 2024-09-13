public class Principito {
      
    private String actitud;
    private String personalidad;
    private Flor miFlor;

    

    public String getPersonalidad(){
        return personalidad; 
    }

    public Flor getMiFlor()
    {
        return miFlor;
    }

    

    public void setPersonalidad(String newPersonalidad){
        this.personalidad = newPersonalidad;
    }

    public void setMiFlor(Flor newFlor)
    {
        this.miFlor = newFlor;
    }

    public Principito(){

    }
    public Principito(String actitud, String personalidad){
        this.actitud = actitud;
        this.personalidad = personalidad;
        
    }


    public String getActitud() {
        return actitud;
    }

    public void setActitud(String actitud) {
        this.actitud = actitud;
    }}
