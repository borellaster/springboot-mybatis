package br.com.cwi.tech.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class State {

    private Integer id;
    private String name;
    private String abbreviation;
    private Country country;

}