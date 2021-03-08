package Presentacion;

import javax.swing.JOptionPane;
import Negocio.Dibujo;
import java.util.Random;
/**
 *
 * @author Pferd
 */
public class Interfaz extends javax.swing.JFrame {

    private Dibujo D;
    public Interfaz() {
        initComponents();
        D=new Dibujo(Pn);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Modos = new javax.swing.ButtonGroup();
        Pn = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Modo_Mover = new javax.swing.JRadioButton();
        Modo_CArista = new javax.swing.JRadioButton();
        Modo_CNodo = new javax.swing.JRadioButton();
        btn_tray = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb_nodos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1300, 803));
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 803));

        Pn.setBackground(new java.awt.Color(255, 255, 255));
        Pn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Pn.setForeground(new java.awt.Color(255, 255, 255));
        Pn.setMaximumSize(new java.awt.Dimension(950, 587));
        Pn.setPreferredSize(new java.awt.Dimension(950, 587));
        Pn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MoverMouse(evt);
            }
        });
        Pn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClicIzq(evt);
            }
        });

        javax.swing.GroupLayout PnLayout = new javax.swing.GroupLayout(Pn);
        Pn.setLayout(PnLayout);
        PnLayout.setHorizontalGroup(
            PnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 946, Short.MAX_VALUE)
        );
        PnLayout.setVerticalGroup(
            PnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Acción"));

        Modos.add(Modo_Mover);
        Modo_Mover.setText("Mover Nodo");

        Modos.add(Modo_CArista);
        Modo_CArista.setText("Crear Arista");

        Modos.add(Modo_CNodo);
        Modo_CNodo.setText("Crear Nodo");
        Modo_CNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modo_CNodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Modo_CNodo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modo_CArista, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modo_Mover, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Modo_CNodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modo_CArista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modo_Mover)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_tray.setText("Trayectos");
        btn_tray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_trayActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Nodos"));

        lb_nodos.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        lb_nodos.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lb_nodos.setMaximumSize(new java.awt.Dimension(127, 111));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_nodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_nodos, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_tray, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(Pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btn_tray)
                        .addGap(51, 51, 51)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private boolean F=true;  //true=1er clic , false=2do clic
    private boolean M=false;    //true=mover nodo
    private void ClicIzq(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClicIzq
        int x=evt.getX();
        int y=evt.getY();
        if(Modo_CNodo.isSelected()){
            String nom= JOptionPane.showInputDialog(this, "Ingrese el nombre del Nodo: ");
            if(nom!=null){
                if(!D.CrearNodo(nom, x, y)){
                    JOptionPane.showMessageDialog(this, "Ya existe un nodo con ese nombre\nInténtelo de nuevo.");
                }
            }
        }
        if(Modo_CArista.isSelected()){
            //1er clic
            if(F){
                if(D.CrearArista(x, y)){
                    JOptionPane.showMessageDialog(this, "Seleccione el Nodo Destino");
                    F=false;
                }
            //2do clic
            }else{
                String costo=JOptionPane.showInputDialog(this, "Introduzca el Costo de la Arista");
                if(D.CrearArista(Integer.parseInt(costo),x, y)){
                    F=true;
                }
            }
        }
        if(Modo_Mover.isSelected()){
            if(!M){
                if(D.VerifNodo(x, y)!=null){
                    D.Seleccionar(x, y);
                    M=true;
                }
            }else{
                D.Deseleccionar();
                M=false;
            }
        }
        D.DibGrafo();
        lb_nodos.setText("<html>"+D.Nodos()+"</html>");
    }//GEN-LAST:event_ClicIzq

    private void btn_trayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_trayActionPerformed
        JOptionPane.showMessageDialog(this, D.Trayectos());
    }//GEN-LAST:event_btn_trayActionPerformed

    private void MoverMouse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoverMouse
        if(Modo_Mover.isSelected() && M){
            D.Mover(evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_MoverMouse

    private void Modo_CNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modo_CNodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Modo_CNodoActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Modo_CArista;
    private javax.swing.JRadioButton Modo_CNodo;
    private javax.swing.JRadioButton Modo_Mover;
    private javax.swing.ButtonGroup Modos;
    private javax.swing.JPanel Pn;
    private javax.swing.JButton btn_tray;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_nodos;
    // End of variables declaration//GEN-END:variables
}
