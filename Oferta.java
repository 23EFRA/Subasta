
public class Oferta
{
    // instance variables - replace the example below with your own
    private Persona ofertante;
    private long monto;
    
    public Oferta(Persona ofertante,long monto)
    {
        this.ofertante=ofertante;
        this.monto=monto;
       
    }
    
    public long getMonto()
    {
        return this.monto;
    }
    public String getNombre()
    {
        return ofertante.getPersona();
    }
}
