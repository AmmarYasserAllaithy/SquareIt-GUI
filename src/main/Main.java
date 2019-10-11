package main;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import utils.Utils;

/**
 * @author Ammar Yasser
 */
public class Main extends javax.swing.JFrame {

    private final Utils utils;
    private String parent;
    private File imageFile;

    public Main() {
        initComponents();
        utils = new Utils();
        parent = null;
        imageFile = null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addr_LBL = new javax.swing.JLabel();
        square_BTN = new javax.swing.JButton();
        browse_BTN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        color_TF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        padding_TF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Square Images");

        addr_LBL.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        addr_LBL.setForeground(new java.awt.Color(50, 50, 50));
        addr_LBL.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        square_BTN.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        square_BTN.setForeground(new java.awt.Color(50, 50, 50));
        square_BTN.setText("Square it");
        square_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                square_BTNActionPerformed(evt);
            }
        });

        browse_BTN.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        browse_BTN.setForeground(new java.awt.Color(50, 50, 50));
        browse_BTN.setText("Browse");
        browse_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browse_BTNActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Background-Color");

        color_TF.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        color_TF.setForeground(new java.awt.Color(50, 50, 50));
        color_TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        color_TF.setText("d3e0df");
        color_TF.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(color_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(color_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Padding");

        padding_TF.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        padding_TF.setForeground(new java.awt.Color(50, 50, 50));
        padding_TF.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        padding_TF.setText("25");
        padding_TF.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel4)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(padding_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(padding_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("d3e0df, e9e9e9, 45423b, f7cbc8 ..etc");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("The space between border and image");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(browse_BTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addr_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(square_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(browse_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addr_LBL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(square_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void browse_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browse_BTNActionPerformed
        imageFile = new File(utils.browseForImage(parent));
        parent = imageFile.getParent();
        addr_LBL.setText(imageFile.getAbsolutePath());
    }//GEN-LAST:event_browse_BTNActionPerformed

    private void square_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_square_BTNActionPerformed
        if (imageFile != null && imageFile.exists()) {
            try {
                BufferedImage bi = ImageIO.read(imageFile);
                BufferedImage sqBI;
                int width = bi.getWidth();
                int height = bi.getHeight();
                int x, y,
                        padding = Integer.parseInt(padding_TF.getText().trim());

                if (height > width) {
                    height += padding * 2;
                    sqBI = new BufferedImage(16 * height / 9, height, bi.getType());
                    x = (sqBI.getWidth() - width) / 2;
                    y = padding;
                } else {
                    int sqWidth = width + padding * 2;
                    int sqHeight = 9 * sqWidth / 16;
                    if (sqHeight <= height) {
                        sqHeight = height + 2 * padding;
                        sqWidth = 16 * sqHeight / 9;
                    }
                    sqBI = new BufferedImage(sqWidth, sqHeight, bi.getType());
                    x = (sqWidth - width) / 2;
                    y = (sqHeight - height) / 2;
                }

                Graphics2D g2d = sqBI.createGraphics();
                g2d.setColor(utils.hex2rgb(color_TF.getText().trim()));
                g2d.fillRect(0, 0, sqBI.getWidth(), sqBI.getHeight());
                g2d.drawImage(bi, x, y, null);
                g2d.dispose();

                String path = imageFile.getAbsolutePath();
                String sqPath = path.substring(0, path.lastIndexOf('.')) + "_sq";
                String sqType = path.substring(path.lastIndexOf('.') + 1);
                File sqFile = utils.checkFileName(sqPath, sqType);

                ImageIO.write(sqBI, sqType, sqFile);

                utils.showSuccessPane("Image squarized successfully");

            } catch (IOException ex) {
                utils.showErrorPane(Main.class.getName(), ex.getMessage());
            }
        } else {
            utils.showErrorPane("Invalid image file", "(The system cannot find the file specified)");
        }
    }//GEN-LAST:event_square_BTNActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addr_LBL;
    private javax.swing.JButton browse_BTN;
    private javax.swing.JTextField color_TF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField padding_TF;
    private javax.swing.JButton square_BTN;
    // End of variables declaration//GEN-END:variables
}
