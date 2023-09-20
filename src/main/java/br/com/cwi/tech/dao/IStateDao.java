package br.com.cwi.tech.dao;

import br.com.cwi.tech.domain.State;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IStateDao {

    @Results(id = "states",value = {
            @Result(property = "id", column = "codigo", id=true),
            @Result(property = "name", column = "nome"),
            @Result(property = "abbreviation", column = "abreviacao"),
            @Result(property = "country.id", column = "codigopais"),
            @Result(property = "country.name", column = "nomepais")
    })

    @Select("select e.codigo, e.nome, e.abreviacao, p.codigo as codigopais, p.nome as nomepais \n" +
            "from estado e \n" +
            "inner join pais p on p.codigo = e.pais_codigo")
    List<State> getStates();
}