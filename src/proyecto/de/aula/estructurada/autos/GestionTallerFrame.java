package proyecto.de.aula.estructurada.autos;

import java.awt.Component;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GestionTallerFrame extends javax.swing.JFrame {

    DefaultTableModel modeloTablaConsulta;
    DefaultTableModel modeloTablaBusqueda;
    File file;
    String ruta;

    //region Variables Mecanico
    String cedulaMecanico;
    String nombreMecanico;
    String apellidoMecanico;
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
    String numeroLlantas;
    String tipoDanio;
    float costoArreglo;
    float ingresosTotales;

    public String[] datosAEditar;
    public float valorActual;
    public float valorNuevo;
    //endregion 

    public GestionTallerFrame() throws IOException {
        ruta = "TallerAutos.txt";
        initComponents();
        this.setVisible(true);
        consultar();
        datosAEditar = new String[12];
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
        register = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableQuery = new javax.swing.JTable();
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

        register.setText("Guardar");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
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
                        .addGroup(panelSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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

        title.setText("TALLER DE AUTOS");

        tableQuery.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CC. Mecanico", "Nombre", "Apellido", "CC. Dueño", "Nombre", "Apellido", "Placa", "Marca", "Color", "No. Llantas", "Tipo Daño", "Costo"
            }
        ));
        jScrollPane1.setViewportView(tableQuery);

        tableSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });

        buttonEdit.setText("Editar");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonDelete.setText("Eliminar");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

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

        textIngresosTotales.setEditable(false);
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
                                    .addComponent(jScrollPane2)
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

    private void textTipoDanioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTipoDanioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTipoDanioActionPerformed

    private void textCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCostoActionPerformed

    private void textCedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCedulaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCedulaClienteActionPerformed

    private void textIngresosTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIngresosTotalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIngresosTotalesActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        try {
            registrarIngresoTaller();
        } catch (IOException ex) {
            Logger.getLogger(GestionTallerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registerActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        String cedula = textCedulaCliente.getText();
        if (cedula.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe digitar la cédula a buscar");
        } else {
            try {
                Integer.parseInt(cedula);
                String[] datos = buscarCliente(cedula);
                if (datos != null) {
                    if (tableSearch.getRowCount() > 0) {
                        EliminarFila(tableSearch, 0);
                    }
                    InsertarFila(tableSearch, datos);
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado");
                    if (tableSearch.getRowCount() > 0) {
                        EliminarFila(tableSearch, 0);
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Debe digitar una cédula válida");
                if (tableSearch.getRowCount() > 0) {
                    EliminarFila(tableSearch, 0);
                }
            } catch (IOException ex) {
                Logger.getLogger(GestionTallerFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        if (tableSearch.getRowCount() > 0) {
            String cedula = tableSearch.getValueAt(0, 3).toString();
            boolean eliminado = false;
            try {
                eliminado = eliminar(cedula);
            } catch (IOException ex) {
                Logger.getLogger(GestionTallerFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (eliminado) {
                restarTotal();
                for (int i = 0; i < tableQuery.getRowCount(); i++) {
                    if (cedula.equals(tableQuery.getValueAt(i, 3))) {
                        EliminarFila(tableQuery, i);
                        EliminarFila(tableSearch, 0);
                    }
                }
                JOptionPane.showMessageDialog(null, "Registro eliminado con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar el registro");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe buscar el registro a eliminar");
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        if (tableSearch.getRowCount() > 0) {
            String[] datosAEditar = obtenerDatosAEditar();
            EditarForm editarForm = new EditarForm(this, datosAEditar);
            editarForm.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Debe buscar el registro a eliminar");
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    //region Metodos Ingreso auto al parqueadero
    void registrarIngresoTaller() throws IOException {
        String message = asignarDatosFormulario();
        if (existeCampoVacio()) {
            JOptionPane.showMessageDialog(null, "Verifique que todos los campos estén digitados");
        } else {
            if (message == null) {
                if (cedulaClienteRepetida() || placaRepetida()) {
                    JOptionPane.showMessageDialog(null, cedulaClienteRepetida() ? "El cliente con cédula "
                            + cedulaPropietario + " ya existe" : "El auto con placa " + placa + " ya fue registrado");
                } else {
                    String linea = crearLineaARegistrar();
                    String messageRegister = agregarNuevoIngreso(linea);
                    if (messageRegister == null) {
                        JOptionPane.showMessageDialog(null, "Error al guardar");
                    } else {
                        JOptionPane.showMessageDialog(null, messageRegister);
                        String[] datos = linea.split(";");
                        InsertarFila(tableQuery, datos);
                        sumarTotal(datos[11]);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, message);
            }
        }
    }

    boolean existeCampoVacio() {
        return cedulaMecanico.isEmpty() ? true : nombreMecanico.isEmpty() ? true
                : apellidoMecanico.isEmpty() ? true : cedulaPropietario.isEmpty() ? true
                : nombrePropietario.isEmpty() ? true : apellidoPropietario.isEmpty() ? true
                : placa.isEmpty() ? true : marca.isEmpty() ? true : color.isEmpty() ? true
                : numeroLlantas.isEmpty() ? true : tipoDanio.isEmpty() ? true : false;
    }

    String asignarDatosFormulario() {
        cedulaMecanico = textCedulaMechanic.getText();
        nombreMecanico = textNombreMechanic.getText();
        apellidoMecanico = textApellidoMechanic.getText();
        cedulaPropietario = textCedulaOwner.getText();
        nombrePropietario = textNombreOwner.getText();
        apellidoPropietario = textApellidoOwner.getText();
        placa = textPlaca.getText();
        marca = textMarca.getText();
        color = textColor.getText();
        numeroLlantas = textNumeroLlantas.getText();
        tipoDanio = textTipoDanio.getText();
        try {
            costoArreglo = Float.parseFloat(textCosto.getText());
        } catch (NumberFormatException e) {
            costoArreglo = 0;
            return "Verifique el valor del costo";
        }
        return null;
    }

    boolean cedulaClienteRepetida() {
        for (int i = 0; i < tableQuery.getRowCount(); i++) {
            if (cedulaPropietario.equals(tableQuery.getValueAt(i, 3))) {
                return true;
            }
        }
        return false;
    }

    boolean placaRepetida() {
        for (int i = 0; i < tableQuery.getRowCount(); i++) {
            if (placa.equals(tableQuery.getValueAt(i, 6))) {
                return true;
            }
        }
        return false;
    }

    String crearLineaARegistrar() {
        return cedulaMecanico + ";" + nombreMecanico + ";" + apellidoMecanico + ";"
                + cedulaPropietario + ";" + nombrePropietario + ";" + apellidoPropietario + ";"
                + placa + ";" + marca + ";" + color + ";" + numeroLlantas + ";" + tipoDanio + ";" + costoArreglo;
    }

    String crearLineaAEditar() {
        return datosAEditar[0] + ";" + datosAEditar[1] + ";" + datosAEditar[2] + ";"
                + datosAEditar[3] + ";" + datosAEditar[4] + ";" + datosAEditar[5] + ";"
                + datosAEditar[6] + ";" + datosAEditar[7] + ";" + datosAEditar[8] + ";"
                + datosAEditar[9] + ";" + datosAEditar[10] + ";" + datosAEditar[11];
    }

    String agregarNuevoIngreso(String linea) throws IOException {
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            file = new File(ruta);
            fileWriter = new FileWriter(file, true);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println(linea);
            return "Registro exitoso";
        } catch (IOException ex) {
            Logger.getLogger(GestionTallerFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            printWriter.close();
            fileWriter.close();
        }
        return null;
    }

    String[] buscarCliente(String cedula) throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            file = new File(ruta);
            if (file.exists()) {
                String linea;
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                while ((linea = bufferedReader.readLine()) != null) {
                    String[] datos = linea.split(";");
                    if (datos[3].equals(cedula)) {
                        return datos;
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionTallerFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionTallerFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
        return null;
    }

    //region Eliminar
    public boolean eliminar(String cedulaPropietario) throws IOException {
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            String[] lineas = this.obtenerLineasArchivo();
            if (this.file.delete()) {
                fileWriter = new FileWriter(file, true);
                printWriter = new PrintWriter(fileWriter);
                for (int i = 0; i < lineas.length; i++) {
                    String cedulaAVerificar = lineas[i].split(";")[3];
                    if (!cedulaPropietario.equals(cedulaAVerificar)) {
                        printWriter.println(lineas[i]);
                    }
                }
                return true;
            }
        } finally {
            printWriter.close();
            fileWriter.close();
        }
        return false;
    }

    String[] obtenerLineasArchivo() throws IOException, IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            if (file.exists()) {
                String linea;
                fileReader = new FileReader(ruta);
                bufferedReader = new BufferedReader(fileReader);
                int numeroRegistros = obtenerNumeroRegistros();
                String[] lineas = new String[numeroRegistros];
                for (int i = 0; i < numeroRegistros; i++) {
                    lineas[i] = bufferedReader.readLine();
                }
                return lineas;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionTallerFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionTallerFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
        return new String[0];
    }

    int obtenerNumeroRegistros() throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            int cont = 0;
            if (file.exists()) {
                String linea;
                fileReader = new FileReader(ruta);
                bufferedReader = new BufferedReader(fileReader);
                while ((linea = bufferedReader.readLine()) != null) {
                    cont += 1;
                }
            }
            return cont;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionTallerFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionTallerFrame.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
        return 0;
    }

    //endregion
    //region Editar
    public void finalizarEdicion(float valorActual) {
        boolean editado = false;
        try {
            editado = editar();
        } catch (IOException ex) {
            Logger.getLogger(GestionTallerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (editado) {
            editarTotal(valorActual, Float.parseFloat(datosAEditar[11]));
            for (int i = 0; i < tableQuery.getRowCount(); i++) {
                if (datosAEditar[3].equals(tableQuery.getValueAt(i, 3))) {
                    for (int j = 0; j < 12; j++) {
                        EditarFila(tableQuery, i, j, datosAEditar[j]);
                        EditarFila(tableSearch, 0, j, datosAEditar[j]);
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Registro editado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido editar el registro");
        }
    }

    String[] obtenerDatosAEditar() {
        String[] datos = new String[12];
        datos[0] = String.valueOf(tableSearch.getValueAt(0, 0));
        datos[1] = String.valueOf(tableSearch.getValueAt(0, 1));
        datos[2] = String.valueOf(tableSearch.getValueAt(0, 2));
        datos[3] = String.valueOf(tableSearch.getValueAt(0, 3));
        datos[4] = String.valueOf(tableSearch.getValueAt(0, 4));
        datos[5] = String.valueOf(tableSearch.getValueAt(0, 5));
        datos[6] = String.valueOf(tableSearch.getValueAt(0, 6));
        datos[7] = String.valueOf(tableSearch.getValueAt(0, 7));
        datos[8] = String.valueOf(tableSearch.getValueAt(0, 8));
        datos[9] = String.valueOf(tableSearch.getValueAt(0, 9));
        datos[10] = String.valueOf(tableSearch.getValueAt(0, 10));
        datos[11] = String.valueOf(tableSearch.getValueAt(0, 11));
        return datos;
    }

    boolean editar() throws IOException {
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            String[] lineas = this.obtenerLineasArchivo();
            if (this.file.delete()) {
                fileWriter = new FileWriter(file, true);
                printWriter = new PrintWriter(fileWriter);
                for (int i = 0; i < lineas.length; i++) {
                    String cedulaAVerificar = lineas[i].split(";")[3];
                    if (!datosAEditar[3].equals(cedulaAVerificar)) {
                        printWriter.println(lineas[i]);
                    } else {
                        printWriter.println(crearLineaAEditar());
                    }
                }
                return true;
            }
        } finally {
            printWriter.close();
            fileWriter.close();
        }
        return false;
    }

    //endregion
    //region Metodos Consulta
    void consultar() throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            file = new File(ruta);
            if (file.exists()) {
                String linea;
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                ingresosTotales = 0;
                while ((linea = bufferedReader.readLine()) != null) {
                    String[] datos = linea.split(";");
                    InsertarFila(tableQuery, datos);
                    sumarTotal(datos[11]);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionTallerFrame.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (IOException ex) {
            Logger.getLogger(GestionTallerFrame.class
                    .getName()).log(Level.SEVERE, null, ex);
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
    }

    //endregion 
    //region Utilidades
    public void InsertarFila(JTable table, String[] datos) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.addRow(datos);
    }

    public void EliminarFila(JTable table, int index) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.removeRow(index);
    }

    public void EditarFila(JTable table, int fila, int columna, String valor) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setValueAt(String.valueOf(valor), fila, columna);
    }

    public void sumarTotal(String valor) {
        ingresosTotales += Float.parseFloat(valor);
        textIngresosTotales.setText(String.valueOf(ingresosTotales));
    }

    public void restarTotal() {
        ingresosTotales -= Float.parseFloat(String.valueOf(tableSearch.getValueAt(0, 11)));
        textIngresosTotales.setText(String.valueOf(ingresosTotales));
    }

    public void editarTotal(float valorActual, float valorNuevo) {
        ingresosTotales = ingresosTotales - valorActual + valorNuevo;
        textIngresosTotales.setText(String.valueOf(ingresosTotales));
    }

    //endregion

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
    private javax.swing.JLabel labelTipoDanio;
    private javax.swing.JPanel panelOpcionesAdicionales;
    private javax.swing.JPanel panelSave;
    private javax.swing.JButton register;
    private javax.swing.JTable tableQuery;
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
    private javax.swing.JTextField textTipoDanio;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
