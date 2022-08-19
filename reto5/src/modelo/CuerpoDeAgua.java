
package modelo;


public class CuerpoDeAgua extends ObjetoGeografico {
    //Atributos:
    //ya heredó municipio de clase ObjetoGeografico
    private String nombre;
    private int id;
    private String tipoCuerpoAgua;
    private String tipoAgua;
    private int IRCA;
    //String nivel;
    
    //Métodos:
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoCuerpoAgua() {
        return tipoCuerpoAgua;
    }

    public void setTipoCuerpoAgua(String tipoCuerpoAgua) {
        this.tipoCuerpoAgua = tipoCuerpoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public int getIRCA() {
        return IRCA;
    }

    public void setIRCA(int IRCA) {
        this.IRCA = IRCA;
    }
    
    
    
    //constructor
    public CuerpoDeAgua(String nombre, int id, String tipoCuerpoAgua, String tipoAgua, int IRCA, String municipio)
{
        super(municipio);
        this.nombre = nombre;
        this.id = id;
        this.tipoCuerpoAgua = tipoCuerpoAgua;
        this.tipoAgua = tipoAgua;
        this.IRCA = IRCA;
 
}

    //nivel                 ////revisar varible datosss!!!!!!!!!!!!!!!!!!!
    public String nivel() {
        int datos = 0;//variable inicializada.
        
        if (datos>=0 && datos<5)
        {
            return "INVIABLE SANITARIAMENTE";
        }
        else if (datos>=5 && datos<14)
        {
            return "ALTO";
        }
        else if (datos>=14 && datos<35)
        {
            return "MEDIO";
        }
        else if (datos>=35 && datos<80)
        {
            return "ALTO";
        }
        else if (datos>=80 && datos<100)
        {
            return "INVIABLE SANITARIAMENTE";
        }
        return null;
    }
}
