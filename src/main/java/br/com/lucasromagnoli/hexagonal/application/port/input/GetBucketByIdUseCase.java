package br.com.lucasromagnoli.hexagonal.application.port.input;

import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.get.GetBucketResponse;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
public interface GetBucketByIdUseCase {
    GetBucketResponse handle(String id);
}
