/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01mod3ventas.modulos;


import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Fake Wings
 */
public class TestSubTotal {
    
    public TestSubTotal() {
    
}
    
    @Test
    public void testSubTotal(){
        System.out.println("Subtotal");
        Venta venta = new Venta ("cod123", 100000, 30);
        ColeccionVentas instance = new ColeccionVentas();
        assertTrue(instance.subTotal(venta)==3000000);
        
    }
    
}
