/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo.telus12.endpoint.tarea;

import grupo.telus12.endpoint.tarea.resources.Clientes;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import service.ClientesService;

/**
 *
 * @author k0co8
 */
@Path("/clientes")
public class UsuarioEndpoint {
    @Inject
    private ClientesService clientesService;
   
   // private List<Clientes> clientesList;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findUsuarios() {
        //var usuarioList = this.usuarioService.findUsuarios();
        //return Response.ok(usuarioList).build();
        var clientesList = this.clientesService.buscarClientes();
        return Response.ok(clientesList).build();
        
    }
    
}
