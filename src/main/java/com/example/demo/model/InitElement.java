package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class InitElement {

    @JsonProperty("nombreEmpleado")
    private String nombre;

    @JsonProperty("apellidoEmpleado")
    private String apellido;

    @JsonProperty("posicion.codigo")
    private Posicion posicionCodigo;

}
