package br.com.lucasromagnoli.hexagonal.application.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@Getter
@Setter
public class Card {
    private String id;
    private String name;
    private Byte position;
}
