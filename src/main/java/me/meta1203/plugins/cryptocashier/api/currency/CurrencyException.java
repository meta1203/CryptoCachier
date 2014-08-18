/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.meta1203.plugins.cryptocashier.api.currency;

/**
 *
 * @author hunter
 */
public class CurrencyException extends Exception {
    private String errorType;
    
    public CurrencyException(String errorType) {
        this.errorType = errorType;
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public String getMessage() {
        return errorType;
    }
    
}
