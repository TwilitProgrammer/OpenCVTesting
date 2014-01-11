package opencvtesting;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kyle
 */
public class CameraWindow extends javax.swing.JFrame
{

    static int i_dp;
    static int i_param1;
    static int i_param2;
    /**
     * Creates new form CameraWindow
     */
    public CameraWindow()
    {
        initComponents();
        i_dp = 1;
        i_param1 = 100;
        i_param2 = 200;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        sld_dpVal = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        sld_param1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        sld_param2 = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sld_dpVal.setMajorTickSpacing(2);
        sld_dpVal.setMaximum(10);
        sld_dpVal.setMinimum(1);
        sld_dpVal.setMinorTickSpacing(1);
        sld_dpVal.setPaintLabels(true);
        sld_dpVal.setPaintTicks(true);
        sld_dpVal.setSnapToTicks(true);
        sld_dpVal.setToolTipText("");
        sld_dpVal.setValue(5);
        sld_dpVal.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                sld_dpValStateChanged(evt);
            }
        });

        jLabel1.setText("dp value");

        sld_param1.setMajorTickSpacing(100);
        sld_param1.setMaximum(600);
        sld_param1.setMinimum(1);
        sld_param1.setMinorTickSpacing(20);
        sld_param1.setPaintLabels(true);
        sld_param1.setPaintTicks(true);
        sld_param1.setSnapToTicks(true);
        sld_param1.setToolTipText("");
        sld_param1.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                sld_param1StateChanged(evt);
            }
        });

        jLabel2.setText("param1");

        sld_param2.setMajorTickSpacing(50);
        sld_param2.setMaximum(300);
        sld_param2.setMinimum(1);
        sld_param2.setMinorTickSpacing(10);
        sld_param2.setPaintLabels(true);
        sld_param2.setPaintTicks(true);
        sld_param2.setSnapToTicks(true);
        sld_param2.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                sld_param2StateChanged(evt);
            }
        });

        jLabel3.setText("param2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sld_param2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sld_dpVal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sld_param1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sld_dpVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sld_param1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sld_param2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sld_param2StateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_sld_param2StateChanged
    {//GEN-HEADEREND:event_sld_param2StateChanged
        i_param2 = sld_param2.getValue();
    }//GEN-LAST:event_sld_param2StateChanged

    private void sld_param1StateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_sld_param1StateChanged
    {//GEN-HEADEREND:event_sld_param1StateChanged
        i_param1 = sld_param1.getValue();
    }//GEN-LAST:event_sld_param1StateChanged

    private void sld_dpValStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_sld_dpValStateChanged
    {//GEN-HEADEREND:event_sld_dpValStateChanged
        i_dp = sld_dpVal.getValue();
    }//GEN-LAST:event_sld_dpValStateChanged

    public  int get_dp()
    {
        return i_dp;
    }
    
    public  int get_param1()
    {
        return i_param1;
    }
    
    public int get_param2()
    {
        return i_param2;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CameraWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CameraWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CameraWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CameraWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new CameraWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSlider sld_dpVal;
    private javax.swing.JSlider sld_param1;
    private javax.swing.JSlider sld_param2;
    // End of variables declaration//GEN-END:variables
}