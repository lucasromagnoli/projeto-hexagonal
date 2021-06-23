package br.com.lucasromagnoli.hexagonal.application.service;

import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.get.GetBucketResponse;
import br.com.lucasromagnoli.hexagonal.adapter.out.repository.BucketRepository;
import br.com.lucasromagnoli.hexagonal.application.domain.converter.BucketConverter;
import br.com.lucasromagnoli.hexagonal.application.port.input.GetBucketByIdUseCase;
import br.com.lucasromagnoli.hexagonal.application.port.out.BucketRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@Service
@AllArgsConstructor
public class GetBucketByIdService implements GetBucketByIdUseCase {
    private final BucketRepositoryPort bucketRepository;

    @Override
    public GetBucketResponse handle(String id) {
        var bucketEntity = bucketRepository.findById(id);
        return BucketConverter.toGetResponse(bucketEntity);
    }
}
