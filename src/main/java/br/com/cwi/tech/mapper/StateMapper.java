package br.com.cwi.tech.mapper;

import br.com.cwi.tech.domain.State;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StateMapper {

    @Results(id = "states",value = {
            @Result(property = "id", column = "codigo", id=true),
            @Result(property = "name", column = "nome"),
            @Result(property = "abbreviation", column = "abreviacao")
    })

    @Select("SELECT * FROM estado")
    List<State> getStates();
}
/*
public interface MeuMapper {

    @Select("SELECT a.id AS a_id, a.nome AS a_nome, b.id AS b_id, b.descricao AS b_descricao
             FROM TabelaA a INNER JOIN TabelaB b ON a.b_id = b.id
             WHERE a.id = #{id}")
    @Results({
        @Result(column = "a_id", property = "id"),
        @Result(column = "a_nome", property = "nome"),
        @Result(column = "b_id", property = "classeB.id"),
        @Result(column = "b_descricao", property = "classeB.descricao")
    })
    ClasseA selecionarPorId(int id);
}

public class ClasseA {
    private int id;
    private String nome;
    private ClasseB classeB;
    // getters e setters
}

public class ClasseB {
    private int id;
    private String descricao;
    // getters e setters
}


* */