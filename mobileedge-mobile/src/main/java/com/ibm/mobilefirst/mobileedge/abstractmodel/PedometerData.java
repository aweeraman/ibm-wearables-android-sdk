/*
 *    © Copyright 2016 IBM Corp.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.ibm.mobilefirst.mobileedge.abstractmodel;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Holds the pedometer data
 */
public class PedometerData extends BaseSensorData {

    public int steps;

    public PedometerData(int steps){
        super();
        this.steps = steps;
    }

    @Override
    public JSONObject asJSON() {
        JSONObject json = super.asJSON();

        try {
            JSONObject data = new JSONObject();
            data.put("steps",steps);
            json.put("pedometer",data);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return json;
    }
}