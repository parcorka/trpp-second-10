package ru.mirea.trppsecond10.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.opencsv.bean.CsvBindByName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/** Сущность игры. */
@Getter
@Setter
@ToString
public class Game {

    /** Идентификатор. */
    @JsonProperty("id")
    @CsvBindByName(column = "id")
    private Long id;
    /** Название. */
    @JsonProperty("name")
    @CsvBindByName(column = "name")
    private String name;
    /** Издатель. */
    @JsonProperty("publisher")
    @CsvBindByName(column = "publisher")
    private String publisher;
    /** Студия. */
    @JsonProperty("studio")
    @CsvBindByName(column = "studio")
    private String studio;
    /** Дата выхода. */
    @JsonProperty("created")
    @CsvBindByName(column = "created")
    private String created;


}
