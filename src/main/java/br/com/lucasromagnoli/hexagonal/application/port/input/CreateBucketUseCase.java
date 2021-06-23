package br.com.lucasromagnoli.hexagonal.application.port.input;

import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.create.CreateBucketResponse;
import br.com.lucasromagnoli.hexagonal.application.domain.Bucket;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
public interface CreateBucketUseCase {
    CreateBucketResponse handle(Bucket bucket);
}
