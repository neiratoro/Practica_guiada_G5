package org.example.AYUDAS;

import java.time.LocalDate;

public class Licor {
    private String identificacion;
    private String marca;
    private Double vlrUnitario;
    LocalDate  fechaProduccion;
    private Double porcentajeAlcohol;

    public Licor() {
    }
 // clase llena - clic derecho, generate,
    public Licor(String identificacion, String marca, Double vlrUnitario, LocalDate fechaProduccion, Double porcentajeAlcohol) {
        this.identificacion = identificacion;
        this.marca = marca;
        this.vlrUnitario = vlrUnitario;
        this.fechaProduccion = fechaProduccion;
        this.porcentajeAlcohol = porcentajeAlcohol;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getVlrUnitario() {
        return vlrUnitario;
    }

    public void setVlrUnitario(Double vlrUnitario) {
        this.vlrUnitario = vlrUnitario;
    }

    public LocalDate getFechaProduccion() {
        return fechaProduccion;
    }

    public void setFechaProduccion(LocalDate fechaProduccion) {
        this.fechaProduccion = fechaProduccion;
    }

    public Double getPorcentajeAlcohol() {
        return porcentajeAlcohol;
    }

    public void setPorcentajeAlcohol(Double porcentajeAlcohol) {
        this.porcentajeAlcohol = porcentajeAlcohol;
    }
}

