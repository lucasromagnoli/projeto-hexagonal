package br.com.lucasromagnoli.hexagonal.application.port.input;

import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.get.GetBucketResponse;

import java.util.List;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
public interface GetAllBucketsUseCase {
    List<GetBucketResponse> handle();
}
