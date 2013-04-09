/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webscrpInstall;

/**
 *
 * @author U AMD
 */
import java.io.*; // files!
import java.util.ArrayList; // for scanning

public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    private File payload;

    public GUI() {
        initComponents();
    }

// console operations
    private void consoleClear() {
        console.setText("");
    }

    private void consoleWrite(String message) {
        String currentText = console.getText();
        console.setText(currentText + message);
    }

    private void consoleWriteLn(String message) {
        String currentText = console.getText();
        console.setText(currentText + "\n>" + message);
    }
    
    private void update(String message){
        consoleWriteLn(message);
        currentAction.setText(message);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popUp = new javax.swing.JOptionPane();
        jProgressBar1 = new javax.swing.JProgressBar();
        install = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        progress = new javax.swing.JProgressBar();
        lblProgress = new javax.swing.JLabel();
        currentAction = new javax.swing.JLabel();
        tabbedPain = new javax.swing.JTabbedPane();
        fileWrap = new javax.swing.JPanel();
        fileChooser = new javax.swing.JFileChooser();
        lblLocate = new javax.swing.JLabel();
        logWrap = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        console = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WEBSCRP Installer");

        install.setText("Install");
        install.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                installActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("WEBSCRP Installer");

        lblProgress.setText("Progress:");

        currentAction.setText("-");

        fileChooser.setControlButtonsAreShown(false);
        fileChooser.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);

        lblLocate.setText("Please locate htdocs:");

        javax.swing.GroupLayout fileWrapLayout = new javax.swing.GroupLayout(fileWrap);
        fileWrap.setLayout(fileWrapLayout);
        fileWrapLayout.setHorizontalGroup(
            fileWrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fileWrapLayout.createSequentialGroup()
                .addGroup(fileWrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fileChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                    .addGroup(fileWrapLayout.createSequentialGroup()
                        .addComponent(lblLocate)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fileWrapLayout.setVerticalGroup(
            fileWrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fileWrapLayout.createSequentialGroup()
                .addComponent(lblLocate, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fileChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
        );

        tabbedPain.addTab("File Locator", fileWrap);

        console.setEditable(false);
        console.setBackground(new java.awt.Color(0, 0, 0));
        console.setColumns(20);
        console.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        console.setForeground(new java.awt.Color(255, 255, 255));
        console.setLineWrap(true);
        console.setRows(5);
        console.setText("Installation Console:");
        jScrollPane1.setViewportView(console);

        javax.swing.GroupLayout logWrapLayout = new javax.swing.GroupLayout(logWrap);
        logWrap.setLayout(logWrapLayout);
        logWrapLayout.setHorizontalGroup(
            logWrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );
        logWrapLayout.setVerticalGroup(
            logWrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        tabbedPain.addTab("Instalation Console", logWrap);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tabbedPain)
                                    .addComponent(progress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblProgress)
                                .addGap(42, 42, 42)
                                .addComponent(currentAction, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(install)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedPain, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(install)
                    .addComponent(currentAction)
                    .addComponent(lblProgress))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean fileExists() {
        update("Checking If Selected Directory Exists");
        File target = fileChooser.getSelectedFile(); // this is the file!
        try {
            if (target.exists()) {
                progress.setValue(2); // update progress bar
                return true;
            } else {
                popUp.showMessageDialog(null, "No File Chosen, Please Select A File", "ERROR: No File Chosen", 0);
                update("Install Aborted");
                return false;
            }
        } catch (Exception e) {
            popUp.showMessageDialog(null, "No File Chosen, Please Select A File", "ERROR: No File Chosen", 0);
            update("Install Aborted");
            progress.setValue(0);
            return false;
        }
    }

    private File getSelectedFile() {
        update("Accessing Selected Directory");
        File target = fileChooser.getSelectedFile();
        progress.setValue(5);
        return target;
    }

    private boolean isHtdocs(File target) {
        String path = target.getAbsolutePath();
        update("Checking '" + path + "' for htdocs");
        String[] splitDirString = path.split("\\\\"); // regex for backslash
        int len = splitDirString.length;
        String fileName = splitDirString[len - 1];
        if (fileName.equals("htdocs")) {
            progress.setValue(8);
            return true;
        } else {
            popUp.showMessageDialog(null, "Invalid File Selected, Please Select htdocs", "ERROR: Invalid File Chosen", 0);
            update("Install Aborted");
            progress.setValue(0);
            return false;
        }
    }

    private boolean directoryExists() {
        // scan C - K of possible locations (it's likely to be ina  drive past K
        ArrayList<File> potentialFiles = new ArrayList<File>();

        update("Configuring Scan");
        potentialFiles.add(new File("C:/612136"));
        potentialFiles.add(new File("D:/612136"));
        potentialFiles.add(new File("E:/612136"));
        potentialFiles.add(new File("F:/612136"));
        potentialFiles.add(new File("G:/612136"));
        potentialFiles.add(new File("H:/612136"));
        potentialFiles.add(new File("I:/612136"));
        potentialFiles.add(new File("J:/612136"));

        for (File currentFile : potentialFiles) {
            String currentPath = currentFile.getAbsolutePath();
            update("Scanning: " + currentPath);
            if (currentFile.exists()) {
                update("Directory Found: " + currentPath);
                progress.setValue(10);
                payload = currentFile;
                return true;
            }
        }

        popUp.showMessageDialog(null, "Directory Not Found \n Is The CD In The Machine?", "ERROR: Directory Not Found", 0);
        update("Install Aborted");
        progress.setValue(0);
        return false;


    }

    private void installActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_installActionPerformed
        // INSTALL THE WEBSCRP!
        payload = null; // nullify payload
        progress.setValue(0); // init progress bar
        long start = System.currentTimeMillis();

        if (fileExists()) {
            File target = getSelectedFile();
            if (isHtdocs(target)) {
                if (directoryExists()) {
                    // payload is now assigned
                    // integigate payload
                    // copy files
                    progress.setValue(100);
                    long end = System.currentTimeMillis();
                    long elapsed = end - start;

                    update("Install Complete, Time Elapsed:" + String.valueOf(elapsed) + "ms");
                }


            }
        }






    }//GEN-LAST:event_installActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea console;
    private javax.swing.JLabel currentAction;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JPanel fileWrap;
    private javax.swing.JButton install;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLocate;
    private javax.swing.JLabel lblProgress;
    private javax.swing.JPanel logWrap;
    private javax.swing.JOptionPane popUp;
    private javax.swing.JProgressBar progress;
    private javax.swing.JTabbedPane tabbedPain;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
