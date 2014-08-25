/* 
 * Copyright 2014 hunter.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.meta1203.plugins.cryptocashier.api.currency;

/**
 *
 * @author hunter
 */
public class PlayerAccount {
    private final String username;
    private final String address;
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
