/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consola;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

/**
 *
 * @author jpalazzesi
 */
public class fechato {
    String fechamysql;
    public fechato(){
    
    }
    public String ddmmyyyyToMysql(String fecha){
                //ConVertir Fecha a Date
                SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                String fecha1 = fecha;//Este es el formato de fecha de la mayoria de paises latino americanos 
                String [] fecha2 = fecha1.split("/");//El metodo split de java permite dividir una cadena de String como si fuera un array, 
                //Sencillamente le especificamos cual es el parametro para hacer la divicion. 
                String fechaMySql = fecha2[2]+"-"+ fecha2[1]+"-"+ fecha2[0];//Ya con este pequeno fragmento de codigo podemos convertir 
                return  fechaMySql;
    }
    public String dateToMysql(Date fecha){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(fecha);
        return currentTime;
    }
    public String horaSinSegundos(String hora){
        String sinsegundos=null;
        String [] tiempo = hora.split(":");
        sinsegundos = tiempo[0]+tiempo[1];
        return  sinsegundos;
    }
    public String sumaMinutos(String hora, String minutos){
        String [] tiempo = hora.split(":");
        Calendar cTotal = Calendar.getInstance(); 
        cTotal.set(1982,3,7,Integer.parseInt(tiempo[0]),Integer.parseInt(tiempo[1]),0);
        cTotal.add(Calendar.MINUTE, Integer.parseInt(minutos));
        Formatter formateador = new Formatter();
        Formatter formateador2 = new Formatter();
        return formateador.format("%02d",cTotal.get(cTotal.HOUR_OF_DAY))+":"+formateador2.format("%02d",cTotal.get(cTotal.MINUTE));
    }
    public String restaMinutos(String hora, String minutos){
        String [] tiempo = hora.split(":");
        Calendar cTotal = Calendar.getInstance(); 
        cTotal.set(1982,3,7,Integer.parseInt(tiempo[0]),Integer.parseInt(tiempo[1]),0);
        cTotal.add(Calendar.MINUTE, -Integer.parseInt(minutos));
        Formatter formateador = new Formatter();
        Formatter formateador2 = new Formatter();
        return formateador.format("%02d",cTotal.get(cTotal.HOUR_OF_DAY))+":"+formateador2.format("%02d",cTotal.get(cTotal.MINUTE));
    }
    public String mysqlToArgentino(String fecha){
                    //ConVertir Fecha a Date
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
                String fecha1 = fecha;//Este es el formato de fecha de la mayoria de paises latino americanos 
                String [] fecha2 = fecha1.split("-");//El metodo split de java permite dividir una cadena de String como si fuera un array, 
                //Sencillamente le especificamos cual es el parametro para hacer la divicion. 
                String fechaNormal = fecha2[2]+"/"+ fecha2[1]+"/"+ fecha2[0];//Ya con este pequeno fragmento de codigo podemos convertir 
                return  fechaNormal;
    }

    public String HoyMysql() {
         String DATE_FORMAT_NOW = "yyyy-MM-dd HH:mm:ss";
         Calendar cal = Calendar.getInstance();
         SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
         return sdf.format(cal.getTime());
    }
    public String horaActual() {
         String DATE_FORMAT_NOW = "HH:mm";
         Calendar cal = Calendar.getInstance();
         SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT_NOW);
         return sdf.format(cal.getTime());
    }
}
