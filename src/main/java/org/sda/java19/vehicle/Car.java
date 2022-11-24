package org.sda.java19.vehicle;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Car model that derives from Vehicle
 *
 * @bahadir tasli
 */

@Data
@ToString(callSuper = true)

public class Car extends Motorcycle {

    private VehicleTransmission vehicleTransmission;


}
