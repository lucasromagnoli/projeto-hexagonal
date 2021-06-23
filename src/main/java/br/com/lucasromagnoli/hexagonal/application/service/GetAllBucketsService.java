package br.com.lucasromagnoli.hexagonal.application.service;

import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.get.GetBucketResponse;
import br.com.lucasromagnoli.hexagonal.application.domain.converter.BucketConverter;
import br.com.lucasromagnoli.hexagonal.application.domain.converter.BucketEntityConverter;
import br.com.lucasromagnoli.hexagonal.application.port.input.GetAllBucketsUseCase;
import br.com.lucasromagnoli.hexagonal.application.port.out.BucketRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@Service
@AllArgsConstructor
public class GetAllBucketsService  implements GetAllBucketsUseCase {
    private final BucketRepositoryPort bucketRepositoryPort;

    @Override
    public List<GetBucketResponse> handle() {
        return bucketRepositoryPort.findAll().stream().map(BucketConverter::toGetResponse).collect(Collectors.toList());
    }
}
