package com.microgis.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TruckInfo {

    @NotNull
    private String truckNumber;

    @NotNull
    private String plateNumber;

    private String trailerNumber;

    private String trailerPlateNumber;

}