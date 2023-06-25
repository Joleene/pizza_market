package pl.wszib.pizza_market.web.models;

public class OpinionsModel {
    private String name;
    private String opinion;

    public OpinionsModel(String name, String opinion) {
        this.name = name;
        this.opinion = opinion;
    }

    public String getName() {
        return name;
    }

    public String getOpinion() {
        return opinion;
    }
}

