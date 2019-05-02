/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraficalUserInterface;

/**
 *
 * @author fabianzach
 */
public class FleetGUI extends javax.swing.JFrame
{

  /**
   * Creates new form FleetGUI
   */
  public FleetGUI()
  {
    initComponents();
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

    buttonGroup1 = new javax.swing.ButtonGroup();
    jPanel3 = new javax.swing.JPanel();
    jPanel5 = new javax.swing.JPanel();
    rbPKW = new javax.swing.JRadioButton();
    rbLKW = new javax.swing.JRadioButton();
    jPanel4 = new javax.swing.JPanel();
    jButton1 = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    paParent = new javax.swing.JPanel();
    paPKW = new javax.swing.JPanel();
    tfID = new javax.swing.JTextField();
    jTextField2 = new javax.swing.JTextField();
    jTextField4 = new javax.swing.JTextField();
    jTextField3 = new javax.swing.JTextField();
    paLKW = new javax.swing.JPanel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel3.setLayout(new java.awt.BorderLayout());

    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Filter"));
    jPanel5.setLayout(new java.awt.GridLayout(1, 2));

    buttonGroup1.add(rbPKW);
    rbPKW.setText("PKW");
    rbPKW.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onFilterPKW(evt);
      }
    });
    jPanel5.add(rbPKW);

    buttonGroup1.add(rbLKW);
    rbLKW.setText("LKW");
    rbLKW.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        onFilterLKW(evt);
      }
    });
    jPanel5.add(rbLKW);

    jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

    jPanel4.setLayout(new java.awt.GridLayout());

    jButton1.setText("Add");
    jButton1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton1ActionPerformed(evt);
      }
    });
    jPanel4.add(jButton1);

    jPanel3.add(jPanel4, java.awt.BorderLayout.WEST);

    getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

    jPanel1.setLayout(new java.awt.GridLayout());

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][]
      {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String []
      {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    jScrollPane1.setViewportView(jTable1);

    jPanel1.add(jScrollPane1);

    getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

    paParent.setLayout(new java.awt.CardLayout());

    paPKW.setLayout(new java.awt.GridLayout(3, 3));
    paPKW.add(tfID);

    jTextField2.setText("jTextField2");
    paPKW.add(jTextField2);

    jTextField4.setText("jTextField4");
    paPKW.add(jTextField4);

    jTextField3.setText("jTextField3");
    paPKW.add(jTextField3);

    paParent.add(paPKW, "card3");

    javax.swing.GroupLayout paLKWLayout = new javax.swing.GroupLayout(paLKW);
    paLKW.setLayout(paLKWLayout);
    paLKWLayout.setHorizontalGroup(
      paLKWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 407, Short.MAX_VALUE)
    );
    paLKWLayout.setVerticalGroup(
      paLKWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 100, Short.MAX_VALUE)
    );

    paParent.add(paLKW, "card2");

    getContentPane().add(paParent, java.awt.BorderLayout.PAGE_END);

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void onFilterPKW(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onFilterPKW
  {//GEN-HEADEREND:event_onFilterPKW
    paParent.removeAll();
    paParent.add(paPKW);
    repaint();
  }//GEN-LAST:event_onFilterPKW

  private void onFilterLKW(java.awt.event.ActionEvent evt)//GEN-FIRST:event_onFilterLKW
  {//GEN-HEADEREND:event_onFilterLKW
    paParent.removeAll();
    paParent.add(paLKW);
    repaint();
  }//GEN-LAST:event_onFilterLKW

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
  {//GEN-HEADEREND:event_jButton1ActionPerformed
   
  }//GEN-LAST:event_jButton1ActionPerformed

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
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals(info.getName()))
        {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }
    catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger(FleetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(FleetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(FleetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(FleetGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new FleetGUI().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JButton jButton1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable jTable1;
  private javax.swing.JTextField jTextField2;
  private javax.swing.JTextField jTextField3;
  private javax.swing.JTextField jTextField4;
  private javax.swing.JPanel paLKW;
  private javax.swing.JPanel paPKW;
  private javax.swing.JPanel paParent;
  private javax.swing.JRadioButton rbLKW;
  private javax.swing.JRadioButton rbPKW;
  private javax.swing.JTextField tfID;
  // End of variables declaration//GEN-END:variables
}
