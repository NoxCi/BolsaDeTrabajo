/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fc.is.controlador;

import fc.is.modelo.Empresa;
import fc.is.modelo.EmpresaDAO;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Oxium
 */
public class GuardaEmpresa {
     private int idempresa;
     private String nombre;
     private String oficinas;
     private String fundacion;
     private int numeroempleados;
     private String contacto;
     private String presidente;
     private Set experiencialaborals = null;
     private Set vacantes = null;

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOficinas() {
        return oficinas;
    }

    public void setOficinas(String oficinas) {
        this.oficinas = oficinas;
    }

    public String getFundacion() {
        return fundacion;
    }

    public void setFundacion(String fundacion) {
        this.fundacion = fundacion;
    }

    public int getNumeroempleados() {
        return numeroempleados;
    }

    public void setNumeroempleados(int numeroempleados) {
        this.numeroempleados = numeroempleados;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }
     
    public void guardaEmpresa() {
        Empresa e = new Empresa(idempresa, nombre, oficinas, fundacion, numeroempleados, contacto, presidente, null, null);
        EmpresaDAO dao = new EmpresaDAO();
        dao.guarda(e);
    }
}
