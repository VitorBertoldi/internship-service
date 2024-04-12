package com.hilab.api;

import com.hilab.document.Device;
import com.hilab.service.DeviceService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/device/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class DeviceController {

    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("ping")
    public ResponseEntity<Long> ping() {
        return ResponseEntity.ok(deviceService.ping());
    }

    @GetMapping("get-devices")
    public ResponseEntity<List<Device>> devices() {
        return ResponseEntity.ok(deviceService.getDevices());
    }

}