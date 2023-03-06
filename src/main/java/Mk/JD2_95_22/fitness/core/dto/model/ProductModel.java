package Mk.JD2_95_22.fitness.core.dto.model;

import Mk.JD2_95_22.fitness.converter.number_format.InstantConverter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.Instant;
import java.util.UUID;
@JsonIgnoreProperties
public class ProductModel {
        @JsonProperty("uuid")
        private UUID uuid;
        @JsonSerialize(converter = InstantConverter.Serializer.class)
        @JsonProperty("dt_create")
        private Instant dtCreate;
        @JsonSerialize(converter = InstantConverter.Serializer.class)
        @JsonProperty("dt_update")
        private Instant dtUpdate;
        @JsonProperty("title")
        private String title;
        @JsonProperty("weight")
        private Double weight;
        @JsonProperty("calories")
        private Double calories;
        @JsonProperty("proteins")
        private Double proteins;
        @JsonProperty("fats")
        private Double fats;
        @JsonProperty("carbohydrates")
        private Double carbohydrates;


    public ProductModel(UUID uuid, Instant dtCreate, Instant dtUpdate, String title, Double weight, Double calories, Double proteins, Double fats, Double carbohydrates) {
        this.uuid = uuid;
        this.dtCreate = dtCreate;
        this.dtUpdate = dtUpdate;
        this.title = title;
        this.weight = weight;
        this.calories = calories;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Instant getDtCreate() {
        return dtCreate;
    }

    public void setDtCreate(Instant dtCreate) {
        this.dtCreate = dtCreate;
    }

    public Instant getDtUpdate() {
        return dtUpdate;
    }

    public void setDtUpdate(Instant dtUpdate) {
        this.dtUpdate = dtUpdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getCalories() {
        return calories;
    }

    public void setCalories(Double calories) {
        this.calories = calories;
    }

    public Double getProteins() {
        return proteins;
    }

    public void setProteins(Double proteins) {
        this.proteins = proteins;
    }

    public Double getFats() {
        return fats;
    }

    public void setFats(Double fats) {
        this.fats = fats;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }
}

