package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Phone {

    private String model;
    private LocalDate manufactureYear;
    private Color color;

    public enum Color {
        BLACK(12L), BLUE(13L), WHITE(14L);

        private final Long colorId;

        Color(Long colorId) {
            this.colorId = colorId;
        }

        public Long getColorId() {
            return colorId;
        }
    }

    public Phone(String model, LocalDate manufactureYear, Color color) {
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(LocalDate manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(model, phone.model) && Objects.equals(manufactureYear, phone.manufactureYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, manufactureYear);
    }
}
