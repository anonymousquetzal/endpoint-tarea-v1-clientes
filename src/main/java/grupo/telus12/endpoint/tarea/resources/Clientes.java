/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo.telus12.endpoint.tarea.resources;

import java.math.BigDecimal;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 *
 * @author k0co8
 */
@Data
@EqualsAndHashCode(of = "id")
@ToString(of = "id")//nombreCommercial, dirreccion, saldo
public class Clientes {
    
    private String id;
    
    private String nombre;
    
    private String nombreCommercial;
    
    private String dirreccion;
    
    private BigDecimal saldo;
    
}
