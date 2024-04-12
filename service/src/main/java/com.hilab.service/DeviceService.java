package com.hilab.service;

import com.hilab.document.Device;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.hilab.document.Device.Status.IDLE;
import static com.hilab.document.Device.Status.PROCESSING;

@Service
public class DeviceService {

    public Long ping() {
        return System.currentTimeMillis();
    }

    public List<Device> getDevices() {

        List<Device> devices = new ArrayList<>();

        // This creates a new device
        Device idleDevice = new Device();
        idleDevice.setDeviceCode(String.format("DEVICE-LT-001-%1s", generateRandomHash()));
        idleDevice.setStatus(IDLE);
        // This adds the created device to the list
        devices.add(idleDevice);

        // This creates a new device
        Device processingDevice = new Device();
        processingDevice.setDeviceCode(String.format("DEVICE-LT-001-%1s", generateRandomHash()));
        processingDevice.setStatus(PROCESSING);
        // This adds the created device to the list
        devices.add(processingDevice);

        return devices;
    }

    private String generateRandomHash() {

        Random random = new Random();
        int randomNumber = random.nextInt(1000000);
        return String.format("%06d", randomNumber);
    }
}