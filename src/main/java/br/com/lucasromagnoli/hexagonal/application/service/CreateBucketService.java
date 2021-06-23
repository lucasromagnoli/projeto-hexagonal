package br.com.lucasromagnoli.hexagonal.application.service;

import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.create.CreateBucketResponse;
import br.com.lucasromagnoli.hexagonal.application.domain.Bucket;
import br.com.lucasromagnoli.hexagonal.application.domain.converter.BucketConverter;
import br.com.lucasromagnoli.hexagonal.application.port.input.CreateBucketUseCase;
import br.com.lucasromagnoli.hexagonal.application.port.out.BucketRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@Service
@AllArgsConstructor
public class CreateBucketService implements CreateBucketUseCase {
    private final BucketRepositoryPort bucketRepositoryPort;

    @Override
    public CreateBucketResponse handle(Bucket bucket) {
        Bucket createdBucket = bucket.save(bucketRepositoryPort);
        return BucketConverter.toCreateResponse(createdBucket);
    }
}
