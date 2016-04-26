/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maq.repository.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
 
@ManagedBean
@SessionScoped
public class EditorView {
     
    private String text;
 
    public String getText() {
        return text;
    }
 
    public void setText(String text) {
        this.text = text;
    }
}