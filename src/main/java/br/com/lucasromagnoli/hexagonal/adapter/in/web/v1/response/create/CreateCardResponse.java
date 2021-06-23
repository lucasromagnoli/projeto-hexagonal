package br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.create;

import lombok.Getter;
import lombok.Setter;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@Getter
@Setter
public class CreateCardResponse {
    private String id;
    private String name;
    private Byte position;
}
