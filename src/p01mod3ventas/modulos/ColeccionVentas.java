/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p01mod3ventas.modulos;

import java.util.ArrayList;

/**
 *
 * @author Fake Wings
 */
public class ColeccionVentas {

    private ArrayList<Venta> base;

    public ColeccionVentas() {
        this.base = new ArrayList<Venta>();
    }

    public ArrayList<Venta> listar() {
        return this.base;
    }

    public boolean agregar(Venta venta) {
        return this.base.add(venta);
    }

    public boolean modificar(Venta venta) {
        for (int i = 0; i < this.base.size(); i++) {
            if (this.base.get(i).getCodigo().equals(venta.getCodigo())) {
                this.base.get(i).setCodigo(venta.getCodigo());
                this.base.get(i).setPrecio(venta.getPrecio());
                this.base.get(i).setCantidad(venta.getCantidad());
                return true;
            }
        }
        return false;
    }

    public boolean eliminar(String codigo) {
        for (int i = 0; i < this.base.size(); i++) {
            if (this.base.get(i).getCodigo().equals(codigo)) {
                this.base.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public int subTotal(Venta venta){
        return venta.getCantidad()*venta.getPrecio();
        
    }
}
