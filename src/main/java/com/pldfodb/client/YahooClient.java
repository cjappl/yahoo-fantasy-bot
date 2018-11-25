package com.pldfodb.client;

import com.pldfodb.controller.model.yahoo.FantasyContentResource;
import com.pldfodb.controller.model.yahoo.LeagueResource;
import com.pldfodb.controller.model.yahoo.TransactionResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class YahooClient {

    @Autowired protected RestTemplate restTemplate;
    private static String leagueId = "380.l.939571";

    public YahooClient(RestTemplate template) {
        this.restTemplate = template;
    }

    public LeagueResource getLeague() {
        return restTemplate.getForObject("https://fantasysports.yahooapis.com/fantasy/v2/league/" + leagueId, FantasyContentResource.class).getLeague();
    }

    public List<TransactionResource> getTransactions(int count) {
        return restTemplate.getForObject("https://fantasysports.yahooapis.com/fantasy/v2/league/380.l.939571/transactions;count=" + String.valueOf(count), FantasyContentResource.class).getLeague().getTransactions();
    }
}
