/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.meta1203.plugins.cryptocashier.api.currency;
import com.avaje.ebean.EbeanServer;
import java.io.File;

/**
 *
 * @author hunter
 */
public interface CurrencyInterface {
    // Startup Functions
    public Class[] getPersistanceClasses(); 
    public boolean start(File storageFolder, EbeanServer persistance);
    public boolean stop();
    public void handleError();
    
    // Ingame money access
    public String getPlayernameFromAddress();
}
