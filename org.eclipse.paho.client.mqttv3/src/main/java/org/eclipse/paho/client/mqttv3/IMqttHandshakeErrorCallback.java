package org.eclipse.paho.client.mqttv3;

public interface IMqttHandshakeErrorCallback {
    void onHandshakeError(String response, Exception e);
}
