
package controlador;

//importar modelo Y ARRAYLIST----------------------------------------------------
import java.util.ArrayList;
import modelo.CuerpoDeAgua;

public class Controlador {
    
    
    
    //Métodos
    
    //inicializar lista----------------------------------------------
    
    ArrayList<CuerpoDeAgua> cuerpos=new ArrayList<>();
  
    
    // Metodo agregar:  llenado de vector con los objetos cuerposdeagua:
    
    public void agregar (String nombre, int id, String tipoCuerpoAgua, String tipoAgua, float IRCA, String municipio){
        
    CuerpoDeAgua  inputcuerpodeagua;    
    inputcuerpodeagua = new CuerpoDeAgua(nombre,id,tipoCuerpoAgua,tipoAgua,IRCA,municipio);
    cuerpos.add(inputcuerpodeagua);
    
    }
    
    //Método hallar el nivel de riesgo de cada cuerpo de agua:
    
    public void niveltodos (){
    
    for (int i=0;i<cuerpos.size();i++){
        String riesgo;
        riesgo = cuerpos.get(i).nivel();
        
    }
    
    }
}
