/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fx
 */
public class tablasCombos {
    public tablasCombos(){
        
    }
    public void getInventarioPC(String busqueda, JTable tabla){
        ConexionSegura conexion = new ConexionSegura();
        ResultSet r=null;
        DefaultTableModel m;
        String titulos[] = {"ID", "Dirección IP", "Nombre", "Usuario", "Sector"};
        m = new DefaultTableModel(null, titulos);
        String fila[] = new String[5];
        if(!busqueda.equals("")){
            try{
                conexion.setPs("select id, ip, nombrentbios, usuario, sector from inventariopc where ip like ? or nombrentbios like ? or usuario like ? or sector like ? or numeroinventario like ? or mother like ? or micro like ? or memoria = ? or seriemonitor like ? order by INET_ATON(ip) asc");
                conexion.ps.setString(1, "%"+busqueda+"%");
                conexion.ps.setString(2, "%"+busqueda+"%");
                conexion.ps.setString(3, "%"+busqueda+"%");
                conexion.ps.setString(4, "%"+busqueda+"%");
                conexion.ps.setString(5, "%"+busqueda+"%");
                conexion.ps.setString(6, "%"+busqueda+"%");
                conexion.ps.setString(7, "%"+busqueda+"%");
                conexion.ps.setString(8, "%"+busqueda+"%");
                conexion.ps.setString(9, "%"+busqueda+"%");
                r = conexion.ps.executeQuery();
                while(r.next()){
                    fila[0] = r.getString("id");
                    fila[1] = r.getString("ip");
                    fila[2] = r.getString("nombrentbios");
                    fila[3] = r.getString("usuario");
                    fila[4] = r.getString("sector");
                    m.addRow(fila);
                }
                tabla.setModel(m);
            }catch(Exception e){
                System.out.println("Error búsqueda: "+e);
            }
        }else{
            try{
                conexion.setPs("select id, ip, nombrentbios, usuario, sector from inventariopc order by INET_ATON(ip) asc");
                r = conexion.ps.executeQuery();    
                while(r.next()){
                    fila[0] = r.getString("id");
                    fila[1] = r.getString("ip");
                    fila[2] = r.getString("nombrentbios");
                    fila[3] = r.getString("usuario");
                    fila[4] = r.getString("sector");
                    m.addRow(fila);
                }
                tabla.setModel(m);
            }catch(Exception e){
                System.out.println("Error en búsqueda de todo: "+e);
            }
        }
        conexion.cerrar();

    }
    public void getReparacionesTabla(int id, String busqueda, JTable tabla){
        DefaultTableModel m;
        ConexionSegura con = new ConexionSegura();
        try{
            String titulos[] = {"Id", "Fecha", "Accion"};
            m = new DefaultTableModel(null, titulos);
            String fila[] = new String[3];            
            con.setPs("Select id, accion, fecha from reparaciones where (accion like ? or fecha like ? or descripcion like ?) and idequipo=?");
            con.ps.setString(1, "%"+busqueda+"%");
            con.ps.setString(2, "%"+busqueda+"%");
            con.ps.setString(3, "%"+busqueda+"%");
            con.ps.setInt(4, id);
            ResultSet r = con.ps.executeQuery();
            while(r.next()){
                fila[0] = r.getString("id");
                fila[1] = r.getString("accion");
                fila[2] = r.getString("fecha");
                m.addRow(fila);
            }
            tabla.setModel(m);
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        con.cerrar();
    }

    public void getProvinciasCombo(JComboBox combo){
            ConexionSegura conexion = new ConexionSegura();
            try{
                conexion.setPs("select provincia from localidades group by provincia");
                ResultSet r = conexion.ps.executeQuery();//conexion.consulta("select localidad from localidades where cp = '"+txt_cp.getText().toString()+"' and provincia = '"+cboprovincia.getSelectedItem().toString()+"'");
                combo.removeAllItems();
                while(r.next()){
                    combo.addItem(r.getString("provincia"));
                }
            }catch(Exception e){
                System.out.println(e);
            }
            conexion.cerrar();
    }
    public void getLocalidadComboByCpAndProvincia(String cp, String provincia, JComboBox combo){
        if(cp.length() == 4){    
        ConexionSegura conexion = new ConexionSegura();
            try{
                conexion.setPs("select localidad from localidades where cp = ? and provincia = ?");
                conexion.ps.setString(1, cp.trim());
                conexion.ps.setString(2, provincia.trim());
                ResultSet r = conexion.ps.executeQuery();
                combo.removeAllItems();
                while(r.next()){
                    combo.addItem(r.getString("localidad"));
                }
            }catch(Exception e){
                System.out.println(e);
            }
            conexion.cerrar();
        }
    }
}