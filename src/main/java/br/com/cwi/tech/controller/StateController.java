package br.com.cwi.tech.controller;

import br.com.cwi.tech.domain.State;
import br.com.cwi.tech.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("states")
public class StateController {

    @Autowired
    private StateService service;

    @GetMapping("/list")
    public List<State> list() {
        return service.getStates();
    }
}
