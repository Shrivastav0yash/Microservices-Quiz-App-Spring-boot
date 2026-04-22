package com.microservices.quiz_app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response {

    private Integer id;
    private String response;
}
