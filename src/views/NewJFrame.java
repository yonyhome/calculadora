package views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author yonyh
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uno = new java.awt.Label();
        dos = new java.awt.TextField();
        tres = new java.awt.TextField();
        cinco = new javax.swing.JComboBox<>();
        cuatro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        cinco.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "*", "-", "/", "x!", "y^x", "10^x", "sen", "cos", "y^x" }));
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        cuatro.setText("go");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuatro)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(dos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(cuatro)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        // TODO add your handling code here:
        String xs= dos.getText(), ys= tres.getText();
        if (xs.matches("[0-9]+")&& ys.matches("[0-9]+")) {
            System.out.println("datos validos ");
        int x= Integer.parseInt(dos.getText()),y = Integer.parseInt(tres.getText());
        switch (cinco.getSelectedIndex()){
            case 0:
                uno.setText(String.valueOf(sum(x,y)));
            break;
            case 1:
                uno.setText(String.valueOf(mult(x,y)));
            break;
            case 2:
                uno.setText(String.valueOf(subs(x,y)));
            break;
            case 3:
                uno.setText(String.valueOf(div(x,y)));
            break;
            case 4:
                uno.setText(String.valueOf(fact(x)));
            break;
            case 5:
                uno.setText(String.valueOf(poten(x,y)));
            break;
            case 6:
                uno.setText(String.valueOf(diez(x)));
            break;
            case 7:
                uno.setText(String.valueOf(seno(x)));
                
        }
        }else
            System.out.println("datos no validos");
    
        
    }//GEN-LAST:event_cuatroActionPerformed
    double seno(int x){
        int i;
        double s = 0;
        int signo = 1;
        for(i=1; i<10; i+=2){
        s + =  String.valueOf(div(String.valueOf(mult( signo , String.valueOf(poten(x, i)))))) , String.valueOf(fact(i)))) ;
        signo *= -1;
        } 
        return s;
    }
    
    int diez(int x){
        int nell = 10;
        String aux;
        aux="10";
        for (int i = 1; i <= x; i++) {
            aux =(String.valueOf(mult( nell ,nell)));
            nell = Integer.parseInt(aux);
        }
        
        
        
        int aux1 = Integer.parseInt(aux);
        return aux1;
    }
    int poten(int x, int y){
     String aux;
     aux ="";     
        for (int i = 1; i <=x; i++) {
            aux = (String.valueOf(mult(y,y)));
        }
        int aux1 = Integer.parseInt(aux);
        return aux1;
     
    }
    int fact(int x){
        int aux=1;
        for (int i = 1; i <=x; i++) {
            aux = aux*i;
        }
        return aux;
    }
    int div(int x, int y){
        int c; 
        c = 0;
        while( x >= y){ 
            x = x - y;
            c++;      
        }        
        return c;          
    }
    int sum(int x, int y){
        return x+y;
    }
    int mult(int x, int y){
        int result=0;
        for (int i = 0; i < y; i++) {
            result= sum(result, x);
                        
        }
        return result;
    }
    int subs(int x, int y){
        int complement= 10, counter = 0, result;
        while(y > complement)
            complement = mult(complement, 10);
        for   (int i = y; i < 10; i++) {
            counter++;
        }
        while (String.valueOf(x).length()> String.valueOf(counter).length()){
                      counter = Integer.parseInt("9"+counter);
                               
        }
         result = Integer.parseInt(String.valueOf(sum(counter,x)).substring(1));
         return result;
    }


    
    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_cincoActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tresActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cinco;
    private javax.swing.JButton cuatro;
    private java.awt.TextField dos;
    private java.awt.TextField tres;
    private java.awt.Label uno;
    // End of variables declaration//GEN-END:variables
}
