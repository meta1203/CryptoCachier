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
public class PlayerAccount {
    private String username;
    private String address;
    private float value;
    
    public PlayerAccount(String username, String address, float value) {
        this.address = address;
        this.username = username;
        this.value = value;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public float getValue() {
        return value;
    }
    
    public float addValue(float add) {
        value = value + add;
        return value;
    }
    
    public float subtractValue(float subtract) throws Exception {
        value = value - subtract;
        if (value < 0) {
            throw new Exception();
        }
        return value;
    }
}
