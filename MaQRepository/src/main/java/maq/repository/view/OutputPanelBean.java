/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.view;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ApplicationScoped
public class OutputPanelBean {
    private String path = "x1";

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        System.err.println(path);
        this.path = path;
    }
}
