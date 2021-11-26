
package proyecto.de.aula.estructurada.autos;

public class RegistroForm extends javax.swing.JFrame {
    
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
    
    public RegistroForm() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        volver.setText("VOLVER AL MENÚ PRINCIPAL");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(volver)
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(volver)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void registrarIngresoTaller(){
        String linea = crearLineaARegistrar();
        
    }
    
    String crearLineaARegistrar(){
        return cedulaMecanico + ";" + nombreMecanico + ";" + apellidoMencanico + ";" +
                ";" + cedulaPropietario + ";" + nombrePropietario + ";" + apellidoPropietario
                + placa + ";" + marca + ";" + color + numeroLlantas + ";" + tipoDanio + ";" + costoArreglo;
    }
    
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_volverActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
