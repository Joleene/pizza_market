package pl.wszib.pizza_market.data.entities;

import jakarta.persistence.*;



@Entity
@Table(name= "new_opinion")
public class NewOpinionEntity {
    @Id
    @GeneratedValue
    @Column(name= "id")
    private Long id;
    @Column(name= "name")
    private String Name;
    @Column(name= "opinion")
    private String Opinion;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOpinion() {
        return Opinion;
    }

    public void setOpinion(String opinion) {
        Opinion = opinion;
    }
}
