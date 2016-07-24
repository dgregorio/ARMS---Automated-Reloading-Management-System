import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 public class SelectTransactionType{
 public static void main(String[] args) {
 Frame fm=new Frame("Transaction Type");
 Label la=new Label("Select Transaction Type:");
 Button bt=new Button("Next");

 fm.setLayout(new GridLayout(0, 1));
 CheckboxGroup cg1=new CheckboxGroup();

 fm.add(la);
 fm.add(new Checkbox("Reload", cg1, true));
 fm.add(new Checkbox("Smart Padala", cg1, false));

 fm.add(bt);

 fm.setSize(300,300);
 fm.setVisible(true);
 fm.addWindowListener(new WindowAdapter(){

 public void windowClosing(WindowEvent we){
 System.exit(0);
 }
 });

 }
}
