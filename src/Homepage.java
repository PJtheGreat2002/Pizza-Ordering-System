import java.io.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Homepage extends javax.swing.JFrame {

    ImageIcon imagePizza = new ImageIcon("pizza.jpg");
    static int x = 0;
    static int tot=0;  
    static int[] arr = new int[100];
    public Homepage() {
        initComponents();
        pic.setText("");
        pic.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("pizza.jpg")).getImage().getScaledInstance(250, 180, Image.SCALE_DEFAULT)));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Size = new javax.swing.ButtonGroup();
        Type = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        s1 = new javax.swing.JRadioButton();
        s2 = new javax.swing.JRadioButton();
        p1 = new javax.swing.JRadioButton();
        p2 = new javax.swing.JRadioButton();
        p3 = new javax.swing.JRadioButton();
        t2 = new javax.swing.JCheckBox();
        t3 = new javax.swing.JCheckBox();
        t4 = new javax.swing.JCheckBox();
        t5 = new javax.swing.JCheckBox();
        t6 = new javax.swing.JCheckBox();
        t7 = new javax.swing.JCheckBox();
        t1 = new javax.swing.JCheckBox();
        s3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pic = new javax.swing.JLabel();

        Size.add(s1);
        Size.add(s2);
        Size.add(s3);

        Type.add(p1);
        Type.add(p2);
        Type.add(p3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(236, 76, 47));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JAP Pizza's");

        s1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        s1.setText("Regular");

        s2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        s2.setText("Medium");

        p1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        p1.setText("Hand Tossed");

        p2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        p2.setText("Fresh Pan");

        p3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        p3.setText("Cheese Burst");

        t2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        t2.setText("Tomato");

        t3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        t3.setText("Corn");

        t4.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        t4.setText("Capsicum");

        t5.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        t5.setText("Mushroom");

        t6.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        t6.setText("Black Olives");

        t7.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        t7.setText("Jalepeno");

        t1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        t1.setText("Onion");

        s3.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        s3.setText("Large");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 18)); // NOI18N
        jLabel2.setText("Size");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 18)); // NOI18N
        jLabel3.setText("Pizza Type");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 3, 18)); // NOI18N
        jLabel4.setText("Toppings");

        jButton1.setBackground(new java.awt.Color(51, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Add to cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Cart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        pic.setText("jLabel5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(s1)
                                    .addComponent(s2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(s3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(115, 115, 115))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(p1)
                                        .addGap(99, 99, 99))
                                    .addComponent(p2)
                                    .addComponent(p3))))
                        .addGap(2, 2, 2)
                        .addComponent(jButton2)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(pic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t4)
                                    .addComponent(t5)
                                    .addComponent(t3)
                                    .addComponent(t2)
                                    .addComponent(t1))
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(t6)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t7)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton2))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(s1)
                        .addComponent(p1))
                    .addComponent(t1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p2)
                            .addComponent(s2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p3)
                            .addComponent(s3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(t2)
                        .addGap(5, 5, 5)
                        .addComponent(t3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(t7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(pic)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    int flag = 0;
    int sflag = 0;
        if(!(s1.isSelected()))
            flag++;
        else
            sflag = 50;
        if(!(s2.isSelected()))
            flag++;
        else
            sflag = 100;
        if(!(s3.isSelected()))
            flag++;
        else
            sflag = 150;
               
        if(flag==3)
            JOptionPane.showMessageDialog(null, "Size not Selected");
        else
            arr[x]  = sflag;
        
        flag =  0;
        int pflag = 0;
        
        if(!(p1.isSelected()))
            flag++;
        else
            pflag = 30;
        if(!(p2.isSelected()))
            flag++;
        else
            pflag = 50;
        if(!(p3.isSelected()))
            flag++;
        else
            pflag = 70;
        
        if(flag==3)
            JOptionPane.showMessageDialog(null, "Pizza Type not Selected");
        else
            arr[x] += pflag;
        
        if(t1.isSelected())
            arr[x]+=10;
        if(t2.isSelected())
            arr[x]+=10;
        if(t3.isSelected())
            arr[x]+=30;
        if(t4.isSelected())
            arr[x]+=20;
        if(t5.isSelected())
            arr[x]+=25;
        if(t6.isSelected())
            arr[x]+=50;
        if(t7.isSelected())
            arr[x]+=70;
        
        x++;
        
        Size.clearSelection();
        Type.clearSelection();
        t1.setSelected(false);
        t2.setSelected(false);
        t3.setSelected(false);
        t4.setSelected(false);
        t5.setSelected(false);
        t6.setSelected(false);
        t7.setSelected(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
        FileWriter f = new FileWriter("Temp.txt");
        BufferedWriter b = new BufferedWriter(f);
        PrintWriter p = new PrintWriter(b);
        for(int i=0; i<x ;i++)
            tot+=arr[i];
    
        p.println((float)tot);
        p.println((float)tot*18/100);
        for(int i=0; i<x ;i++)
            p.println("Pizza "+String.valueOf(i+1)+":\t\t"+String.valueOf(arr[i]));

        p.close();
        b.close();
        f.close();
        Bill b1 = new Bill();
        b1.show();
        dispose();
        
        }catch(IOException e)
        {
            System.out.println("File not found");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homepage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Size;
    private javax.swing.ButtonGroup Type;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton p1;
    private javax.swing.JRadioButton p2;
    private javax.swing.JRadioButton p3;
    private javax.swing.JLabel pic;
    private javax.swing.JRadioButton s1;
    private javax.swing.JRadioButton s2;
    private javax.swing.JRadioButton s3;
    private javax.swing.JCheckBox t1;
    private javax.swing.JCheckBox t2;
    private javax.swing.JCheckBox t3;
    private javax.swing.JCheckBox t4;
    private javax.swing.JCheckBox t5;
    private javax.swing.JCheckBox t6;
    private javax.swing.JCheckBox t7;
    // End of variables declaration//GEN-END:variables
}
