package br.com.lucasromagnoli.hexagonal.adapter.in.web.v1;

import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.api.IBucketController;
import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.request.create.CreateBucketRequest;
import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.create.CreateBucketResponse;
import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.get.GetBucketResponse;
import br.com.lucasromagnoli.hexagonal.application.domain.converter.BucketConverter;
import br.com.lucasromagnoli.hexagonal.application.port.input.CreateBucketUseCase;
import br.com.lucasromagnoli.hexagonal.application.port.input.GetAllBucketsUseCase;
import br.com.lucasromagnoli.hexagonal.application.port.input.GetBucketByIdUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@RestController
@AllArgsConstructor
public class BucketController implements IBucketController {
    private final CreateBucketUseCase createBucketUseCase;
    private final GetBucketByIdUseCase getBucketByIdUseCase;
    private final GetAllBucketsUseCase getAllBucketsUseCase;

    @Override
    public CreateBucketResponse create(CreateBucketRequest createBucketRequest) {
        return createBucketUseCase.handle(BucketConverter.toDomain(createBucketRequest));
    }

    @Override
    public GetBucketResponse findById(String id) {
        return getBucketByIdUseCase.handle(id);
    }

    @Override
    public List<GetBucketResponse> findAll() {
        return getAllBucketsUseCase.handle();
    }
}
