package org.sda.java19.vehicle;

import lombok.Data;
import lombok.ToString;

/**
 * Tractor model that derives from vehicle
 *
 * @author bahadir tasli
 */

@Data

public class Tractor extends Vehicle{

    private float maxPulledWeight;

}
