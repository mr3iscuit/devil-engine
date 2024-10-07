package org.devilengine;

import static org.assertj.core.api.Assertions.assertThat;

import org.devilengine.controller.Controller;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.test.web.client.TestRestTemplate;


@SpringBootTest
class Tests {

    @Autowired
    private Controller controller;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

}