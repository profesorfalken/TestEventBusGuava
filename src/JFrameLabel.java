import com.google.common.eventbus.Subscribe;

/**
 * <p>
 * @author Carlos Hoces
 * @author Javier Garcia
 */
public class JFrameLabel extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrameLabel
     */
    public JFrameLabel() {
        initComponents();
    }

    @Subscribe
    public void setLabel(String text) {
        jLabel.setText(text);
    }

    @SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code"> 
    private void initComponents() {

        jLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

// Variables declaration - do not modify 
    private javax.swing.JLabel jLabel;
// End of variables declaration 
}
