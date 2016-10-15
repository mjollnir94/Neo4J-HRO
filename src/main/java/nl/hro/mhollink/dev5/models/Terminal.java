package nl.hro.mhollink.dev5.models;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

@NodeEntity
public class Terminal implements IModel{

    @GraphId
    private Long id;

    private String code;
    private String status;

    @Relationship(type = "BELONGS")
    private Set<Gate> gates;

    @Relationship(type = "BASED")
    private Set<Company> companies;

    public Terminal() {
    }

    public Terminal(String code, String status) {
        this.code = code;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Gate> getGates() {
        return gates;
    }

    public void setGates(Set<Gate> gates) {
        this.gates = gates;
    }

    public Set<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(Set<Company> companies) {
        this.companies = companies;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", status='" + status + '\'' +
                ", gates=" + gates +
                ", companies=" + companies +
                '}';
    }
}
