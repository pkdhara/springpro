/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.argusoft.testbyjay;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pradeepkumar
 */
@XmlRootElement
public class MyResources {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
