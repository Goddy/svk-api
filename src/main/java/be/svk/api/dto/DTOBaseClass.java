package be.svk.api.dto;

/**
 * Created by u0090265 on 10/06/16.
 */
public abstract class DTOBaseClass {
    private Long id;

    public DTOBaseClass() {

    }

    public DTOBaseClass(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
