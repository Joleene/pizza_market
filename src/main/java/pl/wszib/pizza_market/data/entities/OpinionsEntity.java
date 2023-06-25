package pl.wszib.pizza_market.data.entities;

import jakarta.persistence.*;


    @Entity
    @Table(name = "opinions")


    public class OpinionsEntity {
        @Id
        @GeneratedValue
        @Column(name = "name")
        private String name;
        @Column(name = "opinion")
        private String opinion;

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
