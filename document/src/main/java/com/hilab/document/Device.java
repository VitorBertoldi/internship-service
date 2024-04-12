package com.hilab.document;

public class Device {

    private String deviceCode;
    private Status status;

    public enum Status {
        IDLE,
        PROCESSING
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
