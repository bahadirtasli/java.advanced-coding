package org.sda.java19.vehicle;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Motorcycle model that derives from vehicle
 *
 * @author bahadir tasli
 */
@Data
@ToString(callSuper = true)
public class Motorcycle extends Vehicle{
    private float topSpeed;
    private VehicleShape vehicleShape;
}

