

 /*
  * MagePane.java
  *
  * Created on 15-Dec-2009, 9:34:25 PM
  */
 package mage.client;

 import java.awt.*;

 /**
  * @author BetaSteward_at_googlemail.com
  */
 public abstract class MagePane extends javax.swing.JLayeredPane {

     private String title = "no title set";

     /**
      * Creates new form MagePane
      */
     public MagePane() {
         initComponents();
     }

     public void changeGUISize() {

     }

     public void setTitle(String title) {
         this.title = title;
     }

     public String getTitle() {
         return title;
     }

     public void hideFrame() {
         MageFrame.deactivate(this);
     }

     public void removeFrame() {
         KeyboardFocusManager.getCurrentKeyboardFocusManager().clearGlobalFocusOwner();
         MageFrame.deactivate(this);
         MageFrame.getDesktop().remove(this);
     }

     public void activated() {

     }

     public void deactivated() {

     }

     public void handleEvent(AWTEvent event) {
     }

     public Container getContentPane() {
         return this;
     }

     /**
      * This method is called from within the constructor to initialize the form.
      * WARNING: Do NOT modify this code. The content of this method is always
      * regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

         setBorder(null);

     }// </editor-fold>//GEN-END:initComponents

     // Variables declaration - do not modify//GEN-BEGIN:variables
     // End of variables declaration//GEN-END:variables
 }
