package com.api.reservavuelos.DTO.Request;

import com.api.reservavuelos.annotations.ValidClase;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReservaRequestDTO {
    @NotEmpty(message = "La clase no puede estar vacia")
    @ValidClase
    private String clase;
    @NotNull
    private int numero_asiento;
}
