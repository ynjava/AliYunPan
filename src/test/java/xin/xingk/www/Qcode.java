package xin.xingk.www;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: 陈靖杰
 * @Date: 2022/2/10 18:07
 * @Description:
 */
@Getter
public class Qcode {
    private JPanel code;
    private JLabel jlebel;

    private static Qcode qcode;

    private Qcode() {

    }

    public static Qcode getInstance() {
        if (qcode == null) {
            qcode = new Qcode();
        }
        return qcode;
    }

    public void init() {
        qcode = getInstance();
        jlebel.setText("123");
        code.add(jlebel);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        code.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        jlebel = new JLabel();
        jlebel.setText("Label");
        code.add(jlebel, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return code;
    }
}
