/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject4;

import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

/**
 *
 * @author andre
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PDDocument doc;
        doc = new PDDocument();
        doc.addPage(new PDPage());
        try {
            doc.save("Empty PDF.pdf");
            doc.close();
        } catch (Exception io) {
            System.out.println(io);
        }
    }
}
