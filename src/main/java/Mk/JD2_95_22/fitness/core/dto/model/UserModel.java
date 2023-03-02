package Mk.JD2_95_22.fitness.core.dto.model;

import Mk.JD2_95_22.fitness.converter.number_format.InstantConverter;
import Mk.JD2_95_22.fitness.orm.entity.RoleEntity;
import Mk.JD2_95_22.fitness.orm.entity.StatusEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.Instant;
import java.util.UUID;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserModel {
    @JsonProperty("uuid")
    private UUID uuid;

    @JsonSerialize(converter = InstantConverter.Serializer.class)
    @JsonProperty("dt_create")
    private Instant dt_create;
    @JsonSerialize(converter = InstantConverter.Serializer.class)
    @JsonProperty("dt_update")
    private  Instant dt_update;
    @JsonProperty("mail")
    private String mail;
    @JsonProperty("fio")
    private String name;
    @JsonProperty("role")
    private RoleEntity role;
    @JsonProperty("status")
    private StatusEntity status;

    public UserModel() {
    }

    public UserModel(UUID uuid, Instant dt_create, Instant dt_update, String mail, RoleEntity role, StatusEntity status) {
        this.uuid = uuid;
        this.dt_create = dt_create;
        this.dt_update = dt_update;
        this.mail = mail;
        this.name = name;
        this.role = role;
        this.status = status;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Instant getDt_create() {
        return dt_create;
    }

    public void setDt_create(Instant dt_create) {
        this.dt_create = dt_create;
    }

    public Instant getDt_update() {
        return dt_update;
    }

    public void setDt_update(Instant dt_update) {
        this.dt_update = dt_update;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public StatusEntity getStatus() {
        return status;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }
}
