package io.codelex.oop.exercise7_8;

import java.util.Objects;

public class Computer {

    private double processor;
    private int ram;
    private String graphicsCard;
    private String company;
    private String model;

    public String getProcessor() {
        return processor + " Ghz";
    }

    public void setProcessor(double processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram + " GB";
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Computer(double processor, int ram, String graphicsCard, String company, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
        this.company = company;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + getProcessor() +
                ", ram=" + getRam() +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.processor, processor) == 0 && ram == computer.ram && Objects.equals(graphicsCard, computer.graphicsCard) && Objects.equals(company, computer.company) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processor, ram, graphicsCard, company, model);
    }
}
