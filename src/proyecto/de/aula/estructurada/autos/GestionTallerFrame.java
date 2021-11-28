
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSearch = new javax.swing.JTable();
        panelOpcionesAdicionales = new javax.swing.JPanel();
        labelCedulaCliente = new javax.swing.JLabel();
        textCedulaCliente = new javax.swing.JTextField();
        buttonSearch = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        labelIngresosTotales = new javax.swing.JLabel();
        textIngresosTotales = new javax.swing.JTextField();

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSaveLayout.createSequentialGroup()
                        .addComponent(dataService)
                        .addGap(106, 106, 106)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSaveLayout.setVerticalGroup(
            panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(textTipoDaño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTipoDaño))
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

        title.setText("TALLER DE AUTOS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CC. Mecanico", "Nombre", "Apellido", "CC. Dueño", "Nombre", "Apellido", "Placa", "Marca", "Color", "No. Llantas", "Tipo Daño", "Costo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        tableSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CC. Mecanico", "Nombre", "Apellido", "CC. Dueño", "Nombre", "Apellido", "Placa", "Marca", "Color", "No. Llantas", "Tipo Daño", "Costo"
            }
        ));
        jScrollPane2.setViewportView(tableSearch);

        panelOpcionesAdicionales.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        labelCedulaCliente.setText("Cédula del cliente:");

        textCedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCedulaClienteActionPerformed(evt);
            }
        });

        buttonSearch.setText("Buscar");

        buttonEdit.setText("Editar");

        buttonDelete.setText("Eliminar");

        javax.swing.GroupLayout panelOpcionesAdicionalesLayout = new javax.swing.GroupLayout(panelOpcionesAdicionales);
        panelOpcionesAdicionales.setLayout(panelOpcionesAdicionalesLayout);
        panelOpcionesAdicionalesLayout.setHorizontalGroup(
            panelOpcionesAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesAdicionalesLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(labelCedulaCliente)
                .addGap(18, 18, 18)
                .addComponent(textCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelOpcionesAdicionalesLayout.setVerticalGroup(
            panelOpcionesAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesAdicionalesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOpcionesAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCedulaCliente)
                    .addComponent(buttonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        labelIngresosTotales.setText("Ingresos totales por autos atendidos:");

        textIngresosTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIngresosTotalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                                    .addComponent(panelOpcionesAdicionales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(labelIngresosTotales)
                                .addGap(18, 18, 18)
                                .addComponent(textIngresosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(594, 594, 594)
                        .addComponent(title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(title)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelOpcionesAdicionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIngresosTotales)
                            .addComponent(textIngresosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void textCedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCedulaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCedulaClienteActionPerformed

    private void textIngresosTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIngresosTotalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIngresosTotalesActionPerformed
 
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
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JLabel dataMechanic;
    private javax.swing.JLabel dataOwner;
    private javax.swing.JLabel dataService;
    private javax.swing.JLabel dataVehicle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelApellidoMechanic;
    private javax.swing.JLabel labelApellidoOwner;
    private javax.swing.JLabel labelCedulaCliente;
    private javax.swing.JLabel labelCedulaMechanic;
    private javax.swing.JLabel labelCedulaOwner;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelCosto;
    private javax.swing.JLabel labelIngresosTotales;
    private javax.swing.JLabel labelMarca;
    private javax.swing.JLabel labelNombreMechanic;
    private javax.swing.JLabel labelNombreOwner;
    private javax.swing.JLabel labelNumeroLlantas;
    private javax.swing.JLabel labelPlaca;
    private javax.swing.JLabel labelTipoDaño;
    private javax.swing.JPanel panelOpcionesAdicionales;
    private javax.swing.JPanel panelSave;
    private javax.swing.JButton register;
    private javax.swing.JTable tableSearch;
    private javax.swing.JTextField textApellidoMechanic;
    private javax.swing.JTextField textApellidoOwner;
    private javax.swing.JTextField textCedulaCliente;
    private javax.swing.JTextField textCedulaMechanic;
    private javax.swing.JTextField textCedulaOwner;
    private javax.swing.JTextField textColor;
    private javax.swing.JTextField textCosto;
    private javax.swing.JTextField textIngresosTotales;
    private javax.swing.JTextField textMarca;
    private javax.swing.JTextField textNombreMechanic;
    private javax.swing.JTextField textNombreOwner;
    private javax.swing.JTextField textNumeroLlantas;
    private javax.swing.JTextField textPlaca;
    private javax.swing.JTextField textTipoDaño;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
