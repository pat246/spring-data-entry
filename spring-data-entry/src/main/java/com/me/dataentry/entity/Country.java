package com.me.dataentry.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.ReadOnlyProperty;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.me.dataentry.exception.InvalidInputException;

@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @NotEmpty(message = "Country name can not be empty")
    @Size(min = 3, max = 100, message = "Country name must be between 3 to 100 chars")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Country name Must be alphabet")
    String name;

    @NotEmpty(message = "isActive can not be empty")
    @Size(min = 1, max = 1, message = "isactive should be of 1 character length")
    @Pattern(regexp = "^[A-Z]$", message = "Must be alphabet")
    String isActive;

    @NotNull(message = "rank can not be empty")
    @Min(value = 1, message = "Minimum value need to be 1")
    @Max(value = 100, message = "Max value need to be 100")
    Integer rank;

    @ReadOnlyProperty
    Date createdAt;
    
    @OneToMany
    @JsonIgnore
    List<State> states;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @PrePersist
    public void prePersist() {
        if (createdAt == null) {
            createdAt = new Date();
        }
        validateIsActive();
    }

    @PreUpdate
    public void preUpdate() {
        validateIsActive();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    private void validateIsActive() {
        if (!("Y".equalsIgnoreCase(isActive) || "U".equalsIgnoreCase(isActive))) {
            throw new InvalidInputException("VALIDATION_FAILED", "isactive can only be Y or U", "isActive");
        }
    }

    @JsonIgnore
    public List<State> getStates() {
        return states;
    }

    @JsonIgnore
    public void setStates(List<State> states) {
        this.states = states;
    }
}
