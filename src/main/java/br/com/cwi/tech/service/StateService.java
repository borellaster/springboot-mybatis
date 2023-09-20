package br.com.cwi.tech.service;

import br.com.cwi.tech.domain.State;
import br.com.cwi.tech.dao.IStateDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    @Autowired
    private IStateDao dao;

    public List<State> getStates() {
        return this.dao.getStates();
    }
}
