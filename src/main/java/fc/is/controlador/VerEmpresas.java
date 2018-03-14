/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fc.is.controlador;

import fc.is.modelo.Empresa;
import fc.is.modelo.EmpresaDAO;
import java.util.List;

/**
 *
 * @author Oxium
 */
public class VerEmpresas {
    private List<Empresa> empresas;
    
    public List<Empresa> getEmpresas() {
        ver();
        return empresas;
    }
    
    public void ver() {
        EmpresaDAO dao = new EmpresaDAO();
        empresas = dao.empresas();
    }
}
