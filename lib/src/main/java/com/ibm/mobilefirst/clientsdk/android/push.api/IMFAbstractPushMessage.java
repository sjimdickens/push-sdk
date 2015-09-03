/*
    Copyright 2015 IBM Corp.
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
        http://www.apache.org/licenses/LICENSE-2.0
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package com.ibm.mobilefirst.clientsdk.android.push.api;

/**
 * Created by jialfred on 9/2/15.
 */
public abstract class IMFAbstractPushMessage implements IMFPushMessage {

	protected String alert;
	protected String id;

	public IMFAbstractPushMessage(String alert, String id) {
		this.alert = alert;
		this.id = id;
	}

	public IMFAbstractPushMessage(IMFInternalPushMessage message) {
		this.alert = message.getAlert();
		this.id = message.getId();
	}

	@Override
	public String getAlert() {
		return alert;
	}

	@Override
	public String getId() {
		return id;
	}

}
