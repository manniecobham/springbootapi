package com.manniedev.firstspringbootapi.controllers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.manniedev.firstspringbootapi.model.EnumStatus;


@RestController
public class ApiBuilder {

    @GetMapping
    public String getServerResponse() {
        return "App checker is working...";
    }

    @GetMapping("/check")
    public String getStatusMessages(@RequestParam String url) {
        EnumStatus returnMessage;
        try {
            URL urlobj = new URL(url);
            try {
                HttpURLConnection conn = (HttpURLConnection) urlobj.openConnection();
                conn.setRequestMethod("GET");
                conn.connect();

                int responseCodeCate = conn.getResponseCode() / 100;
                if (responseCodeCate != 2 && responseCodeCate != 3) {
                    returnMessage = EnumStatus.NOT_ACTIVE;
                } else {
                    returnMessage = EnumStatus.ACTIVE;
                }
                return returnMessage.getMessage();
            } catch (IOException e) {
                returnMessage = EnumStatus.NOT_ACTIVE;
                return returnMessage.getMessage();
            }
        } catch (MalformedURLException e) {
            returnMessage = EnumStatus.INVALID_URL;
            return returnMessage.getMessage();
        }
    }
}
