/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01mod3ventas.modulos;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Fake Wings
 */
public class TestEliminar {
    
    public TestEliminar(){
        
    }
    
    @Test
    public void testEliminar(){
        System.out.println("Eliminar");
        String codigo= "cod123";
        Venta venta= new Venta("cod123", 100000, 3);
        ColeccionVentas instance = new ColeccionVentas();
        instance.agregar(venta);
        boolean esperado = true;
        boolean obtenido= instance.eliminar(codigo);
        Assert.assertEquals(esperado, obtenido);
    }
}
