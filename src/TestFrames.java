import com.google.common.eventbus.EventBus;

/**
 * <p>
 * @author Carlos Hoces
 * @author Javier Garcia
 */
public class TestFrames {  
    //For a real project it should be used perhaps as a singleton injected by Guice or other inyection tool
    public static EventBus appEventBus = new EventBus();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            JFrameLabel jFrameLabel = new JFrameLabel();
            jFrameLabel.setVisible(true);
            JFrameButton jFrameButton = new JFrameButton();
            jFrameButton.setVisible(true);
            
            //Registered all jframes, although strictly in this example we needed to register only the one with the button
            appEventBus.register(jFrameLabel);
            appEventBus.register(jFrameButton);
        });
    }
}
