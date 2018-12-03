package com.sample;

import java.awt.*;
import javax.swing.*;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
    	
    	
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	Frame frame = new Frame();
        	kSession.insert(frame);
            // go !
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    
    public static class Gra {

        private String typ;
        private String nazwa;
        
        public Gra(String nazwa, String typ){
        	this.typ = typ;
        	this.nazwa = nazwa;
        }

        public String getTyp() {
            return this.typ;
        }

        public void setTyp(String typ) {
            this.typ = typ;
        }

        public String getNazwa() {
            return this.nazwa;
        }

        public void setNazwa(String nazwa) {
            this.nazwa = nazwa;
        }

    }

}
