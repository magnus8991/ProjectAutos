package proyecto.de.aula.estructurada.autos;

import javax.swing.JFrame;

public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setVisible(true);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloMenuPrincipal = new javax.swing.JLabel();
        registro = new javax.swing.JButton();
        consultaIndividual = new javax.swing.JButton();
        consultaGeneral = new javax.swing.JButton();
        edicion = new javax.swing.JButton();
        eliminacion = new javax.swing.JButton();
        costosTotales = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloMenuPrincipal.setText("TALLER DE AUTOS");

        registro.setText("REGISTRO");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });

        consultaIndividual.setText("CONSULTA INDIVIDUAL");
        consultaIndividual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaIndividualActionPerformed(evt);
            }
        });

        consultaGeneral.setText("CONSULTA GENERAL");
        consultaGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaGeneralActionPerformed(evt);
            }
        });

        edicion.setText("EDITAR REGISTRO");
        edicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edicionActionPerformed(evt);
            }
        });

        eliminacion.setText("ELIMINAR REGISTRO");
        eliminacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminacionActionPerformed(evt);
            }
        });

        costosTotales.setText("COSTOS TOTALES");
        costosTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costosTotalesActionPerformed(evt);
            }
        });

        salir.setText("SALIR DE LA APLICACIÓN");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(edicion, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                            .addComponent(eliminacion))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(consultaIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(consultaGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(costosTotales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(salir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(tituloMenuPrincipal)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tituloMenuPrincipal)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registro)
                    .addComponent(consultaIndividual))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consultaGeneral)
                    .addComponent(edicion))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminacion)
                    .addComponent(costosTotales))
                .addGap(31, 31, 31)
                .addComponent(salir)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        RegistroForm registroForm = new RegistroForm();
        this.AbrirFormulario(registroForm);
    }//GEN-LAST:event_registroActionPerformed

    private void consultaIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaIndividualActionPerformed
        BusquedaForm busquedaForm = new BusquedaForm();
        this.AbrirFormulario(busquedaForm);
    }//GEN-LAST:event_consultaIndividualActionPerformed

    private void edicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edicionActionPerformed
        EdicionForm edicionForm = new EdicionForm();
        this.AbrirFormulario(edicionForm);
    }//GEN-LAST:event_edicionActionPerformed

    private void consultaGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaGeneralActionPerformed
        ConsultasForm consultasForm = new ConsultasForm();
        this.AbrirFormulario(consultasForm);
    }//GEN-LAST:event_consultaGeneralActionPerformed

    private void eliminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminacionActionPerformed
        EliminacionForm eliminacionForm = new EliminacionForm();
        this.AbrirFormulario(eliminacionForm);
    }//GEN-LAST:event_eliminacionActionPerformed

    private void costosTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costosTotalesActionPerformed
        CostosTotalesForm costosTotalesForm = new CostosTotalesForm();
        this.AbrirFormulario(costosTotalesForm);
    }//GEN-LAST:event_costosTotalesActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed
    
    public void AbrirFormulario(JFrame formulario) {
        formulario.setVisible(true);
        this.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultaGeneral;
    private javax.swing.JButton consultaIndividual;
    private javax.swing.JButton costosTotales;
    private javax.swing.JButton edicion;
    private javax.swing.JButton eliminacion;
    private javax.swing.JButton registro;
    private javax.swing.JButton salir;
    private javax.swing.JLabel tituloMenuPrincipal;
    // End of variables declaration//GEN-END:variables
}
