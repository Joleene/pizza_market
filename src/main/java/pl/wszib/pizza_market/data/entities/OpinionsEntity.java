package pl.wszib.pizza_market.data.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


    @Entity
    @Table(name = "opinions")
    public class OpinionsEntity {
        @Id
        @GeneratedValue
        @Column(name = "id")
        private Long id;
        @Column(name = "name")
        private String name;
        @Column(name = "opinion")
        private String opinion;

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

        public String getOpinion() {
            return opinion;
        }

        public void setOpinion(String opinion) {
            this.opinion = opinion;
        }


    }