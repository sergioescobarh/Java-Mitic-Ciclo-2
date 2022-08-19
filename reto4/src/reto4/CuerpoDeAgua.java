
package reto4;


public class CuerpoDeAgua extends ObjetoGeografico {
    
      //Parámetros:
    int IRCA;
    String nivel;
    String tipoCuerpoAgua;
    String tipoAgua;
    int id;
    String municipio;
    
    //Métodos:
    //Constructor:
    public CuerpoDeAgua(int id,String municipio,int IRCA){
    this.id=id; 
    this.municipio=municipio;
    this.IRCA=IRCA;    
    }
     //nivel
    public String nivel()
{
    int datos = 0;//variable inicializada.
        
    if (datos>=0 && datos<5)
    {   
    nivel="INVIABLE SANITARIAMENTE";
    }
    else if (datos>=5 && datos<14)
    {
    nivel="ALTO";  
    }
    else if (datos>=14 && datos<35)
    {
    nivel="MEDIO";
    }
    else if (datos>=35 && datos<80)
    {
    nivel="ALTO";
    }
    else if (datos>=80 && datos<100)
    {
    nivel="INVIABLE SANITARIAMENTE";
    }
    return nivel;
}
}
