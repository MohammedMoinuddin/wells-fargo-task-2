package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class Portfolio {

    @Id
    @GeneratedValue()
    private Long portfolioId;

    @Column(nullable = false)
    private int creationDate;

    @OneToOne(mappedBy = "portfolio")
    private Client clientId;

    public Portfolio() {
    }

    public Portfolio(Long portfolioId, int creationDate, Client client) {
        this.portfolioId = portfolioId;
        this.creationDate = creationDate;
        this.clientId = client;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    public Client getClient() {
        return clientId;
    }

    public void setClient(Client client) {
        this.clientId = client;
    }
}
