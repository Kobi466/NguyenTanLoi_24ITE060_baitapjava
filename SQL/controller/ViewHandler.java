package SQL.controller;

import SQL.view.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewHandler implements ActionListener {
    private View view;
    public ViewHandler(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Add Product")) {
            this.view.addProductToOrder();
        }else if (command.equals("Create Order")) {
            this.view.taoOrder();
        } else if (command.equals("Show Order History")) {
            this.view.showLichSu();
        }
    }
}
