package br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.request.create;

import lombok.Getter;
import lombok.Setter;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@Getter
@Setter
public class CreateCardRequest {
    private String name;
    private Byte position;
}
