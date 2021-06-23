package br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.get;

import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.create.CreateCardResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@Getter
@Setter
public class GetBucketResponse {
    private String id;

    private String name;

    private Byte position;

    private List<GetCardResponse> cards;
}
