package utils;

import java.awt.Dimension;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Utils {

    private void setLookAndFeel() {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            System.out.println(ex.getClass());
            System.out.println(ex.toString());
        }
    }

    public String browseForImage(String... args) {
        setLookAndFeel();
        JFileChooser chooser = new JFileChooser();
        chooser.setPreferredSize(new Dimension(800, 600));
        chooser.setDialogTitle("Select test image...");
        chooser.setApproveButtonText("Select");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setAccessory(new ImagePreview(chooser));
        chooser.setFileFilter(new FileNameExtensionFilter("Images Only (jpg, jpeg, png, bmp)", "jpg", "jpeg", "png", "bmp"));
        if (args.length > 0 && args[0] != null) {
            chooser.setCurrentDirectory(new File(args[0]));
        } else {
            chooser.setCurrentDirectory(new File("C:/Users/Ammar Yasser/Pictures"));
        }
        int status = chooser.showOpenDialog(null);
        if (status == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            if (file != null) {
                return file.getAbsolutePath();
            }
        }
        System.exit(0);
        return "No file selected";
    }

    public void showErrorPane(String title, String message) {
        JOptionPane.showMessageDialog(new main.Main(), message, title, JOptionPane.ERROR_MESSAGE);
    }

    public void showSuccessPane(String message) {
        ImageIcon icon = new ImageIcon(getClass().getResource("/utils/checked.png"));
        JOptionPane.showMessageDialog(new main.Main(), message, "Success", JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
