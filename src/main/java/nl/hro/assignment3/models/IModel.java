package nl.hro.assignment3.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public interface IModel {

    Long getId();
    void setId(Long id);

    String toString();
}
