
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

        panelSave = new javax.swing.JPanel();
        dataMechanic = new javax.swing.JLabel();
        textCedulaMechanic = new javax.swing.JTextField();
        labelCedulaMechanic = new javax.swing.JLabel();
        labelNombreMechanic = new javax.swing.JLabel();
        textNombreMechanic = new javax.swing.JTextField();
        labelApellidoMechanic = new javax.swing.JLabel();
        textApellidoMechanic = new javax.swing.JTextField();
        dataOwner = new javax.swing.JLabel();
        labelCedulaOwner = new javax.swing.JLabel();
        textCedulaOwner = new javax.swing.JTextField();
        labelNombreOwner = new javax.swing.JLabel();
        textNombreOwner = new javax.swing.JTextField();
        labelApellidoOwner = new javax.swing.JLabel();
        textApellidoOwner = new javax.swing.JTextField();
        dataVehicle = new javax.swing.JLabel();
        labelMarca = new javax.swing.JLabel();
        textMarca = new javax.swing.JTextField();
        labelColor = new javax.swing.JLabel();
        textColor = new javax.swing.JTextField();
        labelNumeroLlantas = new javax.swing.JLabel();
        textNumeroLlantas = new javax.swing.JTextField();
        labelPlaca = new javax.swing.JLabel();
        textPlaca = new javax.swing.JTextField();
        dataService = new javax.swing.JLabel();
        labelTipoDaño = new javax.swing.JLabel();
        textTipoDaño = new javax.swing.JTextField();
        labelCosto = new javax.swing.JLabel();
        textCosto = new javax.swing.JTextField();
        register = new javax.swing.JButton();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dataMechanic.setText("Datos del mecánico");

        textCedulaMechanic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCedulaMechanicActionPerformed(evt);
            }
        });

        labelCedulaMechanic.setText("Cédula:");

        labelNombreMechanic.setText("Nombre:");

        textNombreMechanic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreMechanicActionPerformed(evt);
            }
        });

        labelApellidoMechanic.setText("Apellido:");

        textApellidoMechanic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textApellidoMechanicActionPerformed(evt);
            }
        });

        dataOwner.setText("Datos del dueño");

        labelCedulaOwner.setText("Cédula:");

        textCedulaOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCedulaOwnerActionPerformed(evt);
            }
        });

        labelNombreOwner.setText("Nombre:");

        textNombreOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreOwnerActionPerformed(evt);
            }
        });

        labelApellidoOwner.setText("Apellido:");

        textApellidoOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textApellidoOwnerActionPerformed(evt);
            }
        });

        dataVehicle.setText("Datos del vehículo");

        labelMarca.setText("Marca:");

        textMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMarcaActionPerformed(evt);
            }
        });

        labelColor.setText("Color:");

        textColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textColorActionPerformed(evt);
            }
        });

        labelNumeroLlantas.setText("No Llantas:");

        textNumeroLlantas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNumeroLlantasActionPerformed(evt);
            }
        });

        labelPlaca.setText("Placa:");

        textPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPlacaActionPerformed(evt);
            }
        });

        dataService.setText("Datos del servicio");

        labelTipoDaño.setText("Tipo de daño:");

        textTipoDaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTipoDañoActionPerformed(evt);
            }
        });

        labelCosto.setText("Costo:");

        textCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCostoActionPerformed(evt);
            }
        });

        register.setText("Guardar");

        javax.swing.GroupLayout panelSaveLayout = new javax.swing.GroupLayout(panelSave);
        panelSave.setLayout(panelSaveLayout);
        panelSaveLayout.setHorizontalGroup(
            panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSaveLayout.createSequentialGroup()
                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSaveLayout.createSequentialGroup()
                        .addComponent(dataVehicle)
                        .addGap(93, 93, 93))
                    .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelSaveLayout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(dataMechanic))
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelSaveLayout.createSequentialGroup()
                                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelSaveLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(labelMarca))
                                    .addComponent(labelColor)
                                    .addComponent(labelNumeroLlantas))
                                .addGap(18, 18, 18)
                                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNumeroLlantas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelSaveLayout.createSequentialGroup()
                                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelSaveLayout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(labelCedulaMechanic))
                                    .addGroup(panelSaveLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labelNombreMechanic)
                                            .addComponent(labelApellidoMechanic))))
                                .addGap(18, 18, 18)
                                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(textCedulaMechanic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textApellidoMechanic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNombreMechanic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelSaveLayout.createSequentialGroup()
                                .addComponent(labelPlaca)
                                .addGap(18, 18, 18)
                                .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaveLayout.createSequentialGroup()
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dataOwner)
                            .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelSaveLayout.createSequentialGroup()
                                    .addComponent(labelCosto)
                                    .addGap(18, 18, 18)
                                    .addComponent(textCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelSaveLayout.createSequentialGroup()
                                    .addComponent(labelTipoDaño)
                                    .addGap(18, 18, 18)
                                    .addComponent(textTipoDaño, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelSaveLayout.createSequentialGroup()
                                    .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelSaveLayout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(labelCedulaOwner))
                                        .addComponent(labelNombreOwner)
                                        .addComponent(labelApellidoOwner))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textCedulaOwner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textApellidoOwner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textNombreOwner, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaveLayout.createSequentialGroup()
                        .addComponent(dataService)
                        .addGap(130, 130, 130))))
        );
        panelSaveLayout.setVerticalGroup(
            panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSaveLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSaveLayout.createSequentialGroup()
                        .addComponent(dataOwner)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textCedulaOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCedulaOwner))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNombreOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombreOwner))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textApellidoOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelApellidoOwner)))
                    .addGroup(panelSaveLayout.createSequentialGroup()
                        .addComponent(dataMechanic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textCedulaMechanic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCedulaMechanic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNombreMechanic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNombreMechanic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textApellidoMechanic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelApellidoMechanic))))
                .addGap(18, 18, 18)
                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataVehicle)
                    .addComponent(dataService))
                .addGap(18, 18, 18)
                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSaveLayout.createSequentialGroup()
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPlaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMarca))
                        .addGap(18, 18, 18)
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelColor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textNumeroLlantas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNumeroLlantas))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(panelSaveLayout.createSequentialGroup()
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textTipoDaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTipoDaño))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCosto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        title.setText("TALLER DE AUTOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(panelSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(423, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(413, 413, 413))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(title)
                .addGap(37, 37, 37)
                .addComponent(panelSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textCedulaMechanicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCedulaMechanicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCedulaMechanicActionPerformed

    private void textNombreMechanicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreMechanicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreMechanicActionPerformed

    private void textApellidoMechanicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellidoMechanicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellidoMechanicActionPerformed

    private void textCedulaOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCedulaOwnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCedulaOwnerActionPerformed

    private void textNombreOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreOwnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNombreOwnerActionPerformed

    private void textApellidoOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textApellidoOwnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textApellidoOwnerActionPerformed

    private void textMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMarcaActionPerformed

    private void textColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textColorActionPerformed

    private void textNumeroLlantasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNumeroLlantasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNumeroLlantasActionPerformed

    private void textPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPlacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPlacaActionPerformed

    private void textTipoDañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTipoDañoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTipoDañoActionPerformed

    private void textCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCostoActionPerformed
 
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
    private javax.swing.JLabel dataMechanic;
    private javax.swing.JLabel dataOwner;
    private javax.swing.JLabel dataService;
    private javax.swing.JLabel dataVehicle;
    private javax.swing.JLabel labelApellidoMechanic;
    private javax.swing.JLabel labelApellidoOwner;
    private javax.swing.JLabel labelCedulaMechanic;
    private javax.swing.JLabel labelCedulaOwner;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelCosto;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelNombreMechanic;
    private javax.swing.JLabel labelNombreOwner;
    private javax.swing.JLabel labelNumeroLlantas;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelTipoDaño;
    private javax.swing.JPanel panelSave;
    private javax.swing.JButton register;
    private javax.swing.JTextField textApellidoMechanic;
    private javax.swing.JTextField textApellidoOwner;
    private javax.swing.JTextField textCedulaMechanic;
    private javax.swing.JTextField textCedulaOwner;
    private javax.swing.JTextField textColor;
    private javax.swing.JTextField textCosto;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textNombreMechanic;
    private javax.swing.JTextField textNombreOwner;
    private javax.swing.JTextField textNumeroLlantas;
    private javax.swing.JTextField textPlaca;
    private javax.swing.JTextField textTipoDaño;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
