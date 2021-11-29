package proyecto.de.aula.estructurada.autos;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EditarForm extends javax.swing.JFrame {

    GestionTallerFrame formEdicion;
    String[] datosAEditar;
    float valorActual;

    public EditarForm(GestionTallerFrame form, String[] datosAEditar) {
        initComponents();
        formEdicion = form;
        valorActual = Float.parseFloat(datosAEditar[11]);
        this.datosAEditar = datosAEditar;
        llenarCampos();
    }
    
    void llenarCampos() {
        textCedulaMechanic.setText(datosAEditar[0]);
        textNombreMechanic.setText(datosAEditar[1]);
        textApellidoMechanic.setText(datosAEditar[2]);
        textCedulaOwner.setText(datosAEditar[3]);
        textNombreOwner.setText(datosAEditar[4]);
        textApellidoOwner.setText(datosAEditar[5]);
        textPlaca.setText(datosAEditar[6]);
        textMarca.setText(datosAEditar[7]);
        textColor.setText(datosAEditar[8]);
        textNumeroLlantas.setText(datosAEditar[9]);
        textTipoDanio.setText(datosAEditar[10]);
        textCosto.setText(datosAEditar[11]);
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
        labelTipoDanio = new javax.swing.JLabel();
        textTipoDanio = new javax.swing.JTextField();
        labelCosto = new javax.swing.JLabel();
        textCosto = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        cancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelSave.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        labelTipoDanio.setText("Tipo de daño:");

        textTipoDanio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTipoDanioActionPerformed(evt);
            }
        });

        labelCosto.setText("Costo:");

        textCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCostoActionPerformed(evt);
            }
        });

        edit.setText("Editar");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSaveLayout = new javax.swing.GroupLayout(panelSave);
        panelSave.setLayout(panelSaveLayout);
        panelSaveLayout.setHorizontalGroup(
            panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dataMechanic, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataVehicle, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSaveLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(labelPlaca)
                                .addGap(18, 18, 18)
                                .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaveLayout.createSequentialGroup()
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
                                    .addComponent(textColor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(panelSaveLayout.createSequentialGroup()
                            .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelSaveLayout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(labelCedulaMechanic))
                                .addComponent(labelNombreMechanic)
                                .addComponent(labelApellidoMechanic))
                            .addGap(18, 18, 18)
                            .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(textCedulaMechanic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textApellidoMechanic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textNombreMechanic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dataOwner)
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelSaveLayout.createSequentialGroup()
                                .addComponent(labelCosto)
                                .addGap(18, 18, 18)
                                .addComponent(textCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelSaveLayout.createSequentialGroup()
                                .addComponent(labelTipoDanio)
                                .addGap(18, 18, 18)
                                .addComponent(textTipoDanio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addGroup(panelSaveLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaveLayout.createSequentialGroup()
                        .addComponent(dataService)
                        .addGap(106, 106, 106)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelSaveLayout.setVerticalGroup(
            panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSaveLayout.createSequentialGroup()
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                    .addComponent(labelApellidoMechanic))
                                .addGap(18, 18, 18)
                                .addComponent(dataVehicle)
                                .addGap(18, 18, 18)
                                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPlaca))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelMarca)))
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
                                    .addComponent(labelApellidoOwner))
                                .addGap(18, 18, 18)
                                .addComponent(dataService)
                                .addGap(18, 18, 18)
                                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textTipoDanio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTipoDanio))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelCosto))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelColor)
                            .addComponent(textColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNumeroLlantas)
                            .addComponent(textNumeroLlantas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(2, 2, 2)
                    .addComponent(panelSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void textTipoDanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTipoDanioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTipoDanioActionPerformed

    private void textCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCostoActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        String message = asignarDatosFormulario();
        if (existeCampoVacio()) {
            JOptionPane.showMessageDialog(null, "Verifique que todos los campos estén digitados");
        } else {
            if (message == null) {
                formEdicion.finalizarEdicion(valorActual);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, message);
            }
        }
    }//GEN-LAST:event_editActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    String asignarDatosFormulario() {
        formEdicion.datosAEditar[0] = textCedulaMechanic.getText();
        formEdicion.datosAEditar[1] = textNombreMechanic.getText();
        formEdicion.datosAEditar[2] = textApellidoMechanic.getText();
        formEdicion.datosAEditar[3] = textCedulaOwner.getText();
        formEdicion.datosAEditar[4] = textNombreOwner.getText();
        formEdicion.datosAEditar[5] = textApellidoOwner.getText();
        formEdicion.datosAEditar[6] = textPlaca.getText();
        formEdicion.datosAEditar[7] = textMarca.getText();
        formEdicion.datosAEditar[8] = textColor.getText();
        formEdicion.datosAEditar[9] = textNumeroLlantas.getText();
        formEdicion.datosAEditar[10] = textTipoDanio.getText();
        try {
            float costo = Float.parseFloat(textCosto.getText());
            formEdicion.datosAEditar[11] = String.valueOf(costo);
        } catch (NumberFormatException e) {
            formEdicion.datosAEditar[11] = "0";
            return "Verifique el valor del costo";
        }
        return null;
    }

    boolean existeCampoVacio() {
        return formEdicion.datosAEditar[0].isEmpty() ? true : formEdicion.datosAEditar[1].isEmpty() ? true
                : formEdicion.datosAEditar[2].isEmpty() ? true : formEdicion.datosAEditar[3].isEmpty() ? true
                : formEdicion.datosAEditar[4].isEmpty() ? true : formEdicion.datosAEditar[5].isEmpty() ? true
                : formEdicion.datosAEditar[6].isEmpty() ? true : formEdicion.datosAEditar[7].isEmpty() ? true
                : formEdicion.datosAEditar[8].isEmpty() ? true : formEdicion.datosAEditar[9].isEmpty() ? true
                : formEdicion.datosAEditar[10].isEmpty() ? true : false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel dataMechanic;
    private javax.swing.JLabel dataOwner;
    private javax.swing.JLabel dataService;
    private javax.swing.JLabel dataVehicle;
    private javax.swing.JButton edit;
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
    private javax.swing.JLabel labelTipoDanio;
    private javax.swing.JPanel panelSave;
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
    private javax.swing.JTextField textTipoDanio;
    // End of variables declaration//GEN-END:variables
}
