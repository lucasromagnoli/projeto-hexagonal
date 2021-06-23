package br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.request.create;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@Getter
@Setter
public class CreateBucketRequest {
    private String name;
    private Byte position;
    private List<CreateCardRequest> cards;
}
