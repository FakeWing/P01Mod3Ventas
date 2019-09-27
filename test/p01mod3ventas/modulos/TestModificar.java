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
public class TestModificar {
    
    public TestModificar(){
        
    }
    
    @Test
    public void testModificar(){
        System.out.println("Modificar");
        Venta venta = new Venta("cod1312", 89898, 4);
        ColeccionVentas instance = new ColeccionVentas();
        instance.agregar(venta);
        boolean esperado = true;
        venta = new Venta("cod1312", 999999, 10);
        boolean obtenido = instance.modificar(venta);
        Assert.assertEquals(esperado, obtenido);
        
    }
    
}
