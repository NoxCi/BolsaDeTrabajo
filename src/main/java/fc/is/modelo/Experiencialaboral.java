package fc.is.modelo;
// Generated 20/02/2018 02:36:48 PM by Hibernate Tools 4.3.1



/**
 * Experiencialaboral generated by hbm2java
 */
public class Experiencialaboral  implements java.io.Serializable {


     private ExperiencialaboralId id;
     private Empresa empresa;
     private Profesionista profesionista;
     private String cargo;
     private String periodo;

    public Experiencialaboral() {
    }

    public Experiencialaboral(ExperiencialaboralId id, Empresa empresa, Profesionista profesionista, String cargo, String periodo) {
       this.id = id;
       this.empresa = empresa;
       this.profesionista = profesionista;
       this.cargo = cargo;
       this.periodo = periodo;
    }
   
    public ExperiencialaboralId getId() {
        return this.id;
    }
    
    public void setId(ExperiencialaboralId id) {
        this.id = id;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public Profesionista getProfesionista() {
        return this.profesionista;
    }
    
    public void setProfesionista(Profesionista profesionista) {
        this.profesionista = profesionista;
    }
    public String getCargo() {
        return this.cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getPeriodo() {
        return this.periodo;
    }
    
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }




}


