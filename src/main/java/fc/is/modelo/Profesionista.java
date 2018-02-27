package fc.is.modelo;
// Generated 20/02/2018 02:36:48 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Profesionista generated by hbm2java
 */
public class Profesionista  implements java.io.Serializable {


     private int idprofesionista;
     private String nombre;
     private String correo;
     private String telefono;
     private String contrasena;
     private String nacionalidad;
     private String carrera;
     private Set formacionacademicas = new HashSet(0);
     private Set skillses = new HashSet(0);
     private Set vacantes = new HashSet(0);
     private Set experiencialaborals = new HashSet(0);

    public Profesionista() {
    }

	
    public Profesionista(int idprofesionista, String nombre, String contrasena) {
        this.idprofesionista = idprofesionista;
        this.nombre = nombre;
        this.contrasena = contrasena;
    }
    public Profesionista(int idprofesionista, String nombre, String correo, String telefono, String contrasena, String nacionalidad, String carrera, Set formacionacademicas, Set skillses, Set vacantes, Set experiencialaborals) {
       this.idprofesionista = idprofesionista;
       this.nombre = nombre;
       this.correo = correo;
       this.telefono = telefono;
       this.contrasena = contrasena;
       this.nacionalidad = nacionalidad;
       this.carrera = carrera;
       this.formacionacademicas = formacionacademicas;
       this.skillses = skillses;
       this.vacantes = vacantes;
       this.experiencialaborals = experiencialaborals;
    }
   
    public int getIdprofesionista() {
        return this.idprofesionista;
    }
    
    public void setIdprofesionista(int idprofesionista) {
        this.idprofesionista = idprofesionista;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public String getNacionalidad() {
        return this.nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getCarrera() {
        return this.carrera;
    }
    
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public Set getFormacionacademicas() {
        return this.formacionacademicas;
    }
    
    public void setFormacionacademicas(Set formacionacademicas) {
        this.formacionacademicas = formacionacademicas;
    }
    public Set getSkillses() {
        return this.skillses;
    }
    
    public void setSkillses(Set skillses) {
        this.skillses = skillses;
    }
    public Set getVacantes() {
        return this.vacantes;
    }
    
    public void setVacantes(Set vacantes) {
        this.vacantes = vacantes;
    }
    public Set getExperiencialaborals() {
        return this.experiencialaborals;
    }
    
    public void setExperiencialaborals(Set experiencialaborals) {
        this.experiencialaborals = experiencialaborals;
    }




}

