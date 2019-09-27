/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01mod3ventas.modulos;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Fake Wings
 */
public class TestListar {
    
    public TestListar(){
        
    }
    
    @Test
    public void testListar(){
        System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> esperado = new ArrayList<>();
        ArrayList<Venta> obtenido = instance.listar();
        Assert.assertEquals(esperado, obtenido);
    }
}
