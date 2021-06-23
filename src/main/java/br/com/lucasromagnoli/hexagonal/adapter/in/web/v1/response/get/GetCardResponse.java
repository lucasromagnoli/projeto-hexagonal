package br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.get;

import lombok.Getter;
import lombok.Setter;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@Getter
@Setter
public class GetCardResponse {
    private String id;
    private String name;
    private Byte position;
}
