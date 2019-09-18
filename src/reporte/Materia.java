
package reporte;

public class Materia {
      String Nom_Materia="";
    int examen_1=0;
    int examen_2=0;
        

    public String getNom_Materia() {
        return Nom_Materia;
    }

    public void setNom_Materia(String Nom_Materia) {
        this.Nom_Materia = Nom_Materia;
    }

    public int getExamen_1() {
        return examen_1;
    }

    public void setExamen_1(int examen_1) {
        this.examen_1 = examen_1;
    }

    public int getExamen_2() {
        return examen_2;
    }

    public void setExamen_2(int examen_2) {
        this.examen_2 = examen_2;
    }
       public boolean pasa_materia(){
      boolean aprueba= false;
      if (!(((examen_1 + examen_2)/2)< 7)){
      aprueba= true;
      } return aprueba;
}

   
   
}
