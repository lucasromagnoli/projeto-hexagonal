package br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.create;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@Getter
@Setter
public class CreateBucketResponse {
    private String id;

    private String name;

    private Byte position;

    private List<CreateCardResponse> cards;
}
