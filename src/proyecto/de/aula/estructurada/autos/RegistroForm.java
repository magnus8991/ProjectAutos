
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    String crearLineaAregistrar()
    {
        return cedulaMecanico + ";" + nombreMecanico + ";";
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
