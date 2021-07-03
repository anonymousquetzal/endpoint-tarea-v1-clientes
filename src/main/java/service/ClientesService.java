/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import grupo.telus12.endpoint.tarea.resources.Clientes;
import jakarta.enterprise.context.RequestScoped;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author k0co8
 */
@RequestScoped
public class ClientesService {
    
    
    List<Clientes> clientesList;
    Clientes cliente;
    
    public List<Clientes> buscarClientes(){
        //http://localhost:8080/endpoint-tarea/v1/clientes
        clientesList = new ArrayList<>();
        cliente = new Clientes();
        BigDecimal b = new BigDecimal("10.001");
        cliente.setId("1");
        cliente.setNombre("julio");
        cliente.setNombreCommercial("Walmart");
        cliente.setSaldo(b);
        cliente.setDirreccion("123 Calle");
        
        
        clientesList.add(cliente);
    
        return clientesList;
    
    }
    
}
