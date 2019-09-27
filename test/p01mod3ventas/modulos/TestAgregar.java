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
public class TestAgregar {
    
    public TestAgregar(){
        
    }
    
    @Test
    public void testAgregar(){
        System.out.println("Agregar");
        Venta venta = new Venta ("cod001", 20000, 10);
        ColeccionVentas instance = new ColeccionVentas();
        boolean esperado = true;
        boolean obtenido = instance.agregar(venta);
        Assert.assertEquals(esperado, obtenido);
        
    }
    
}
