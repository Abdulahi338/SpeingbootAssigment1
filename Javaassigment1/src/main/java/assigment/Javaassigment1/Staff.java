package assigment.Javaassigment1;

import lombok.*;

@Getter
@Setter
public class Staff {
    private Long id;
    private String name;
    private String role;

    // Constructors
//    public Staff() {}

    public Staff(Long id, String name, String role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
