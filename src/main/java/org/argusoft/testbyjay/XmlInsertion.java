/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.argusoft.testbyjay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class XmlInsertion {

    List<MyResources> list;

    public XmlInsertion() {
        list = new ArrayList<>();
        System.out.println("====================================================");
        MyResources object1 = new MyResources();
        object1.setId(1);
        object1.setName("jaykalariya");

        MyResources object2 = new MyResources();
        object2.setId(2);
        object2.setName("pradeep");

        list.add(object1);
        list.add(object2);
    }

    public List<MyResources> getMyResources() {
        return list;
    }

}
