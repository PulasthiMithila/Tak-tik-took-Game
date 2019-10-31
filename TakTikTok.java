
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class TakTikTok extends javax.swing.JFrame {

    
     int clicked=0;
     int marks0=0;
     int marks1=0;
     
    
     
     String one;
     String two;
     String three;
     
     String four;
     String five;
     String six;
    
     String seven;
     String eight;
     String nine;
     
     
  
   
     
     
    /**
     * Creates new form TakTikTok
     */
    public TakTikTok() {
        super("TakTikTuk");
        initComponents();
  
        
            
        
       
        
        }
                  
            public void firstRow(){
                if(one==two){
                    if(two==three){
                        JOptionPane.showMessageDialog(this, one+"  winner");
                      
                       if(one=="0"){
                           marks0++;
                           zeroLbl.setText(String.valueOf(marks0));
                           
                       }else if(one=="1"){
                           marks1++;
                           oneLbl.setText(String.valueOf(marks1));
                       }
                       
                    }
                }
            }
            
            
            public void secondRow(){
                if(four==five){
                    if(five==six){
                        JOptionPane.showMessageDialog(this, four+"  winner");
                        
                         if(four=="0"){
                           marks0++;
                           zeroLbl.setText(String.valueOf(marks0));
                           
                       }else if(four=="1"){
                           marks1++;
                           oneLbl.setText(String.valueOf(marks1));
                       }
                    }
                }
            }
            
            
            public void thirdRow(){
                if(seven==eight){
                    if(eight==nine){
                        JOptionPane.showMessageDialog(this, seven+"  winner");
                        
                         if(seven=="0"){
                           marks0++;
                           zeroLbl.setText(String.valueOf(marks0));
                           
                       }else if(seven=="1"){
                           marks1++;
                           oneLbl.setText(String.valueOf(marks1));
                       }
                    }
                }
            }
            
            
            public void firstColumn(){
                if(one==four){
                    if(four==seven){
                        JOptionPane.showMessageDialog(this, one+"  winner");
                        
                         if(one=="0"){
                           marks0++;
                           zeroLbl.setText(String.valueOf(marks0));
                           
                       }else if(one=="1"){
                           marks1++;
                           oneLbl.setText(String.valueOf(marks1));
                       }
                    }
                }
            }
    
   
            public void secondColumn(){
                if(two==five){
                    if(five==eight){
                        JOptionPane.showMessageDialog(this, two+"  winner");
                        
                         if(two=="0"){
                           marks0++;
                           zeroLbl.setText(String.valueOf(marks0));
                           
                       }else if(two=="1"){
                           marks1++;
                           oneLbl.setText(String.valueOf(marks1));
                       }
                    }
                }
            }
            
            
            public void thirdColumn(){
                if(three==six){
                    if(six==nine){
                        JOptionPane.showMessageDialog(this, three+"  winner");
                        
                         if(three=="0"){
                           marks0++;
                           zeroLbl.setText(String.valueOf(marks0));
                           
                       }else if(three=="1"){
                           marks1++;
                           oneLbl.setText(String.valueOf(marks1));
                       }
                    }
                }
            }
            
            public void crosOne(){
                if(one==five){
                    if(five==nine){
                        JOptionPane.showMessageDialog(this, one+" is winner");
                        
                         if(one=="0"){
                           marks0++;
                           zeroLbl.setText(String.valueOf(marks0));
                           
                       }else if(one=="1"){
                           marks1++;
                           oneLbl.setText(String.valueOf(marks1));
                       }
                    }
                }
            }
            
            
            public void crosTwo(){
                if(three==five){
                    if(five==seven){
                        JOptionPane.showMessageDialog(this, three+" is winner");
                        
                         if(three=="0"){
                           marks0++;
                           zeroLbl.setText(String.valueOf(marks0));
                           
                       }else if(three=="1"){
                           marks1++;
                           oneLbl.setText(String.valueOf(marks1));
                       }
                    }
                }
            }
            
            
            public void newOne(){
                tb00.setText("");
                tb01.setText("");
                tb02.setText("");
                tb10.setText("");
                tb11.setText("");
                tb12.setText("");
                tb20.setText("");
                tb21.setText("");
                tb22.setText("");
                
                tb00.setEnabled(true);
                tb01.setEnabled(true);
                tb02.setEnabled(true);
                tb10.setEnabled(true);
                tb11.setEnabled(true);
                tb12.setEnabled(true);
                tb20.setEnabled(true);
                tb21.setEnabled(true);
                tb22.setEnabled(true);
               
                one="";
                two="";
                three="";
                four="";
                five="";
                six="";
                seven="";
                eight="";
                nine="";
                
                clicked=0;
            }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tb00 = new javax.swing.JToggleButton();
        tb01 = new javax.swing.JToggleButton();
        tb02 = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        tb20 = new javax.swing.JToggleButton();
        tb21 = new javax.swing.JToggleButton();
        tb22 = new javax.swing.JToggleButton();
        jPanel4 = new javax.swing.JPanel();
        tb10 = new javax.swing.JToggleButton();
        tb11 = new javax.swing.JToggleButton();
        tb12 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        oneLbl = new javax.swing.JLabel();
        zeroLbl = new javax.swing.JLabel();
        continueBtn = new javax.swing.JButton();
        newBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        tb00.setBackground(new java.awt.Color(51, 255, 204));
        tb00.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        tb00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb00ActionPerformed(evt);
            }
        });
        jPanel2.add(tb00);

        tb01.setBackground(new java.awt.Color(255, 102, 255));
        tb01.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        tb01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb01ActionPerformed(evt);
            }
        });
        jPanel2.add(tb01);

        tb02.setBackground(new java.awt.Color(51, 255, 204));
        tb02.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        tb02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb02ActionPerformed(evt);
            }
        });
        jPanel2.add(tb02);

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        tb20.setBackground(new java.awt.Color(51, 255, 204));
        tb20.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        tb20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb20ActionPerformed(evt);
            }
        });
        jPanel3.add(tb20);

        tb21.setBackground(new java.awt.Color(255, 102, 255));
        tb21.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        tb21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb21ActionPerformed(evt);
            }
        });
        jPanel3.add(tb21);

        tb22.setBackground(new java.awt.Color(51, 255, 204));
        tb22.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        tb22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb22ActionPerformed(evt);
            }
        });
        jPanel3.add(tb22);

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        tb10.setBackground(new java.awt.Color(255, 102, 255));
        tb10.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        tb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb10ActionPerformed(evt);
            }
        });
        jPanel4.add(tb10);

        tb11.setBackground(new java.awt.Color(51, 255, 204));
        tb11.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        tb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb11ActionPerformed(evt);
            }
        });
        jPanel4.add(tb11);

        tb12.setBackground(new java.awt.Color(255, 102, 255));
        tb12.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        tb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb12ActionPerformed(evt);
            }
        });
        jPanel4.add(tb12);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Marks of 0  :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Marks of 1  :");

        oneLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        oneLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        zeroLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        zeroLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        continueBtn.setBackground(new java.awt.Color(255, 255, 102));
        continueBtn.setText("Continue");
        continueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueBtnActionPerformed(evt);
            }
        });

        newBtn.setBackground(new java.awt.Color(255, 255, 102));
        newBtn.setText("New Game");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zeroLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(continueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zeroLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oneLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continueBtn)
                    .addComponent(newBtn)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb00ActionPerformed
    
        if(clicked%2==0){
            tb00.setText("0");
            tb00.setEnabled(false);
           
            
        }
        else{
            tb00.setText("1");
            tb00.setEnabled(false);
        }
        
        
    one=tb00.getText().trim();
   
    
    
    
    firstRow();
    firstColumn();
    crosOne();
        clicked++;
        
      
        
// TODO add your handling code here:
    }//GEN-LAST:event_tb00ActionPerformed

    private void tb01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb01ActionPerformed
      
         if(clicked%2==0){
            tb01.setText("0");
            tb01.setEnabled(false);
        }
        else{
            tb01.setText("1");
            tb01.setEnabled(false);
        }
        
         two=tb01.getText().trim();
        
         firstRow();
         secondColumn();
         clicked++;
        
       
// TODO add your handling code here:
    }//GEN-LAST:event_tb01ActionPerformed

    private void tb02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb02ActionPerformed
        
         if(clicked%2==0){
            tb02.setText("0");
            tb02.setEnabled(false);
        }
        else{
            tb02.setText("1");
            tb02.setEnabled(false);
        }
        
         three=tb02.getText().trim();
         
         firstRow();
         thirdColumn();
         crosTwo();
        clicked++;
// TODO add your handling code here:
    }//GEN-LAST:event_tb02ActionPerformed

    private void tb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb10ActionPerformed
       
          if(clicked%2==0){
            tb10.setText("0");
            tb10.setEnabled(false);
        }
        else{
            tb10.setText("1");
            tb10.setEnabled(false);
        }
          
          four=tb10.getText().trim();
          
          secondRow();
          firstColumn();
          
        clicked++;
// TODO add your handling code here:
    }//GEN-LAST:event_tb10ActionPerformed

    private void tb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb11ActionPerformed
       
          if(clicked%2==0){
            tb11.setText("0");
            tb11.setEnabled(false);
        }
        else{
            tb11.setText("1");
            tb11.setEnabled(false);
        }
        
          five=tb11.getText().trim();
          
          secondRow();
          secondColumn();
          crosOne();
          crosTwo();
          
        clicked++;
// TODO add your handling code here:
    }//GEN-LAST:event_tb11ActionPerformed

    private void tb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb12ActionPerformed
       
          if(clicked%2==0){
            tb12.setText("0");
            tb12.setEnabled(false);
        }
        else{
            tb12.setText("1");
            tb12.setEnabled(false);
        }
        
          six=tb12.getText().trim();
          
          secondRow();
          thirdColumn();
        clicked++;
// TODO add your handling code here:
    }//GEN-LAST:event_tb12ActionPerformed

    private void tb20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb20ActionPerformed
       
          if(clicked%2==0){
            tb20.setText("0");
            tb20.setEnabled(false);
        }
        else{
            tb20.setText("1");
            tb20.setEnabled(false);
        }
        
          seven=tb20.getText().trim();
          
          thirdRow();
           firstColumn();
          crosTwo(); 
        clicked++;
// TODO add your handling code here:
    }//GEN-LAST:event_tb20ActionPerformed

    private void tb21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb21ActionPerformed
       
          if(clicked%2==0){
            tb21.setText("0");
            tb21.setEnabled(false);
        }
        else{
            tb21.setText("1");
            tb21.setEnabled(false);
        }
        
          eight=tb21.getText().trim();
          
          thirdRow();
          secondColumn();
        clicked++;
// TODO add your handling code here:
    }//GEN-LAST:event_tb21ActionPerformed

    private void tb22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb22ActionPerformed
       
          if(clicked%2==0){
            tb22.setText("0");
            tb22.setEnabled(false);
        }
        else{
            tb22.setText("1");
            tb22.setEnabled(false);
        }
        
          nine=tb22.getText().trim();
          
          thirdRow();
          thirdColumn();
          crosOne();
        clicked++;
// TODO add your handling code here:
    }//GEN-LAST:event_tb22ActionPerformed

    private void continueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueBtnActionPerformed
       
    newOne();

    // TODO add your handling code here:
    }//GEN-LAST:event_continueBtnActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        
        newOne();
        
        zeroLbl.setText("");
        oneLbl.setText("");
        
        marks0=0;
        marks1=0;
        
        
    // TODO add your handling code here:
    }//GEN-LAST:event_newBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TakTikTok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakTikTok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakTikTok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakTikTok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakTikTok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton newBtn;
    private javax.swing.JLabel oneLbl;
    private javax.swing.JToggleButton tb00;
    private javax.swing.JToggleButton tb01;
    private javax.swing.JToggleButton tb02;
    private javax.swing.JToggleButton tb10;
    private javax.swing.JToggleButton tb11;
    private javax.swing.JToggleButton tb12;
    private javax.swing.JToggleButton tb20;
    private javax.swing.JToggleButton tb21;
    private javax.swing.JToggleButton tb22;
    private javax.swing.JLabel zeroLbl;
    // End of variables declaration//GEN-END:variables
}
