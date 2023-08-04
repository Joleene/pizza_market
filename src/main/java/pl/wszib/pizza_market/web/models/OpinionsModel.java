package pl.wszib.pizza_market.web.models;

public class OpinionsModel {
    private Long opinion_id;
    private String name;
    private String opinion;

    public OpinionsModel(Long opinion_id, String name, String opinion) {
        this.opinion_id = opinion_id;
        this.name = name;
        this.opinion = opinion;
    }

    public Long getOpinion_id() {
        return opinion_id;
    }

    public void setOpinion_id(Long opinion_id) {
        this.opinion_id = opinion_id;
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

