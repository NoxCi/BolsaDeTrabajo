package fc.is.modelo;
// Generated 20/02/2018 02:36:48 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Vacante generated by hbm2java
 */
public class Vacante  implements java.io.Serializable {


     private int idvacante;
     private Empresa empresa;
     private String actividades;
     private String descripcion;
     private String puesto;
     private String horario;
     private String lugar;
     private int salario;
     private Set profesionistas = new HashSet(0);

    public Vacante() {
    }

	
    public Vacante(int idvacante, Empresa empresa, String actividades, String descripcion, String puesto, String horario, String lugar, int salario) {
        this.idvacante = idvacante;
        this.empresa = empresa;
        this.actividades = actividades;
        this.descripcion = descripcion;
        this.puesto = puesto;
        this.horario = horario;
        this.lugar = lugar;
        this.salario = salario;
    }
    public Vacante(int idvacante, Empresa empresa, String actividades, String descripcion, String puesto, String horario, String lugar, int salario, Set profesionistas) {
       this.idvacante = idvacante;
       this.empresa = empresa;
       this.actividades = actividades;
       this.descripcion = descripcion;
       this.puesto = puesto;
       this.horario = horario;
       this.lugar = lugar;
       this.salario = salario;
       this.profesionistas = profesionistas;
    }
   
    public int getIdvacante() {
        return this.idvacante;
    }
    
    public void setIdvacante(int idvacante) {
        this.idvacante = idvacante;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getActividades() {
        return this.actividades;
    }
    
    public void setActividades(String actividades) {
        this.actividades = actividades;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    public String getHorario() {
        return this.horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getLugar() {
        return this.lugar;
    }
    
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public int getSalario() {
        return this.salario;
    }
    
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public Set getProfesionistas() {
        return this.profesionistas;
    }
    
    public void setProfesionistas(Set profesionistas) {
        this.profesionistas = profesionistas;
    }




}


