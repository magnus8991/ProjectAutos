
package proyecto.de.aula.estructurada.autos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GestionTallerFrame extends javax.swing.JFrame {

    String ruta;
    
    //region Variables Mecanico
        String cedulaMecanico;
        String nombreMecanico;
        String apellidoMencanico;
    //endregion
        
    //region Variables Propietario
        String cedulaPropietario;
        String nombrePropietario;
        String apellidoPropietario;
    //endregion    
        
    //region Variables Auto
        String placa;
        String marca;
        String color;
        int numeroLlantas;
        String tipoDanio;
        float costoArreglo;
    //endregion 
    
    public GestionTallerFrame() {
        ruta = "TallerAutos.txt";
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 832, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    void registrarIngresoTaller(){
        String linea = crearLineaARegistrar();
        agregarNuevoIngreso(linea);
    }
    
    void agregarNuevoIngreso(String linea){
        
        try {
            File file = new File(ruta);
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(linea);
            fileWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(GestionTallerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    String crearLineaARegistrar(){
        return cedulaMecanico + ";" + nombreMecanico + ";" + apellidoMencanico + ";" +
                ";" + cedulaPropietario + ";" + nombrePropietario + ";" + apellidoPropietario
                + placa + ";" + marca + ";" + color + numeroLlantas + ";" + tipoDanio + ";" + costoArreglo;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
