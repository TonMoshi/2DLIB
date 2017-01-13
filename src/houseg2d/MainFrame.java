/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseg2d;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import no.geosoft.cc.geometry.Geometry;
import no.geosoft.cc.graphics.*;

/**
 *
 * @author dam2
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        jPanel1.setSize(600, 600);
        this.setSize(550,550);

        GWindow window = new GWindow();
        jPanel1.add(window.getCanvas());

        GScene scene = new GScene(window);
        HelloWorld obj = new HelloWorld(this);
        scene.add(obj);

        window.getCanvas().setPreferredSize(new Dimension(500, 500));

        scene.redraw();     //Mega
        scene.refresh();    //Importante. No viene en ningún sitio.
    }

    public class HelloWorld extends GObject {

        private final GSegment house_;
        private final GSegment door_;
        private final GSegment window_;
        private final GSegment roof_;
        private final GSegment anotherWindow_;
        private final GSegment anotherWindow2_;
        private final MainFrame mf;
        public HelloWorld(MainFrame mf) {
            
            this.mf = mf;
            house_ = new GSegment();
            GStyle houseStyle = new GStyle();
            houseStyle.setForegroundColor(new Color(255, 0, 0));
            houseStyle.setBackgroundColor(new Color(255, 255, 0));
            houseStyle.setLineWidth(3);
            house_.setStyle(houseStyle);
            addSegment(house_);
            
            roof_ = new GSegment();
            GStyle roofStyle = new GStyle();
            roofStyle.setForegroundColor(new Color(0, 102, 0));
            roofStyle.setBackgroundColor(new Color(153, 0, 0));
            roofStyle.setLineWidth(3);
            roof_.setStyle(roofStyle);
            addSegment(roof_);
            
            window_ = new GSegment();
            GStyle windowStyle = new GStyle();
            windowStyle.setForegroundColor(new Color(0, 0, 0));
            windowStyle.setBackgroundColor(new Color(102, 255, 255));
            windowStyle.setLineWidth(3);
            window_.setStyle(windowStyle);
            addSegment(window_);
            
            door_ = new GSegment();
            GStyle doorStyle = new GStyle();
            doorStyle.setForegroundColor(new Color(51, 25, 0));
            doorStyle.setBackgroundColor(new Color(153, 76, 0));
            doorStyle.setLineWidth(3);
            door_.setStyle(doorStyle);
            addSegment(door_);
            
            anotherWindow_ = new GSegment();
            GStyle anotherWindowStyle = new GStyle();
            anotherWindowStyle.setForegroundColor(new Color(0, 0, 0));
            anotherWindowStyle.setBackgroundColor(new Color(102, 255, 255));
            anotherWindowStyle.setLineWidth(3);
            anotherWindow_.setStyle(anotherWindowStyle);
            addSegment(anotherWindow_);
            
            anotherWindow2_ = new GSegment();
            GStyle anotherWindow2Style = new GStyle();
            anotherWindow2Style.setForegroundColor(new Color(0, 0, 0));
            anotherWindow2Style.setBackgroundColor(new Color(102, 255, 255));
            anotherWindow2Style.setLineWidth(3);
            anotherWindow2_.setStyle(anotherWindow2Style);
            addSegment(anotherWindow2_);
            
            
            

//            GText text = new GText("HelloWorld", GPosition.MIDDLE);
//            GStyle textStyle = new GStyle();
//            textStyle.setForegroundColor(new Color(100, 100, 150));
//            textStyle.setBackgroundColor(null);
//            textStyle.setFont(new Font("Dialog", Font.BOLD, 48));
//            text.setStyle(textStyle);
//            star_.setText(text);
        }

        /**
         * This method is called whenever the canvas needs to redraw this
         * object. For efficiency, prepare as much of the graphic object up
         * front (such as sub object, segment and style setup) and set geometry
         * only in this method.
         */
        public void draw() {
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            int x = dim.width / 2 - mf.getSize().width / 2;
            int y = dim.height / 2 - mf.getSize().height / 2;
            house_.setGeometry(Geometry.createRectangle(100, 100, 100, 100));
            int[] xa = new int[] {75,225,150,75};
            int[] ya = new int[] {100,100,60,100};
            window_.setGeometry(Geometry.createCircle(150, 80, 10));
            roof_.setGeometry(xa, ya);
            door_.setGeometry(Geometry.createRectangle(140, 150, 20, 50));
            anotherWindow_.setGeometry(Geometry.createRectangle(110, 110, 20, 20));
            anotherWindow2_.setGeometry(Geometry.createRectangle(170, 110, 20, 20));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
