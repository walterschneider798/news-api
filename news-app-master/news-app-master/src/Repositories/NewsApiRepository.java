package Repositories;

import Models.NewsApiResponseObject;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NewsApiRepository {

    private String apiKey = "8ec1ea8385f54f24b40dec53e228204b";
    private Gson gson = new Gson();

    public NewsApiResponseObject getTopHeadlinesSwitzerland() throws IOException {
        URL url = new URL("http://newsapi.org/v2/top-headlines?country=ch&apiKey=" + this.apiKey);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        return this.gson.fromJson(String.valueOf(content), NewsApiResponseObject.class);
    }

    public NewsApiResponseObject getTopHeadlinesSwitzerlandBusiness() throws IOException {
        URL url = new URL("http://newsapi.org/v2/top-headlines?country=ch&category=business&apiKey=" + this.apiKey);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        return this.gson.fromJson(String.valueOf(content), NewsApiResponseObject.class);
    }

    public NewsApiResponseObject getTopHeadlinesSwitzerlandEnterteainment() throws IOException {
        URL url = new URL("http://newsapi.org/v2/top-headlines?country=ch&category=entertainment&apiKey=" + this.apiKey);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        return this.gson.fromJson(String.valueOf(content), NewsApiResponseObject.class);
    }

    public NewsApiResponseObject getTopHeadlinesSwitzerlandHealth() throws IOException {
        URL url = new URL("http://newsapi.org/v2/top-headlines?country=ch&category=health&apiKey=" + this.apiKey);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        return this.gson.fromJson(String.valueOf(content), NewsApiResponseObject.class);
    }

    public NewsApiResponseObject getTopHeadlinesSwitzerlandScience() throws IOException {
        URL url = new URL("http://newsapi.org/v2/top-headlines?country=ch&category=science&apiKey=" + this.apiKey);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        return this.gson.fromJson(String.valueOf(content), NewsApiResponseObject.class);
    }

    public NewsApiResponseObject getTopHeadlinesSwitzerlandSports() throws IOException {
        URL url = new URL("http://newsapi.org/v2/top-headlines?country=ch&category=sports&apiKey=" + this.apiKey);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        return this.gson.fromJson(String.valueOf(content), NewsApiResponseObject.class);
    }

    public NewsApiResponseObject getTopHeadlinesSwitzerlandTechnology() throws IOException {
        URL url = new URL("http://newsapi.org/v2/top-headlines?country=ch&category=technology&apiKey=" + this.apiKey);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        return this.gson.fromJson(String.valueOf(content), NewsApiResponseObject.class);
    }
}
    