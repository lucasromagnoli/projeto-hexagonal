package br.com.lucasromagnoli.hexagonal.application.domain.converter;

import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.request.create.CreateBucketRequest;
import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.create.CreateBucketResponse;
import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.get.GetBucketResponse;
import br.com.lucasromagnoli.hexagonal.adapter.out.repository.entity.BucketEntity;
import br.com.lucasromagnoli.hexagonal.application.domain.Bucket;

import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
public class BucketConverter {
    public static CreateBucketResponse toCreateResponse(Bucket bucket) {
        CreateBucketResponse createBucketResponse = new CreateBucketResponse();
        createBucketResponse.setId(bucket.getId());
        createBucketResponse.setName(bucket.getName());
        createBucketResponse.setPosition(bucket.getPosition());
        if (Objects.nonNull(bucket.getCards())) {
            createBucketResponse.setCards(bucket.getCards().stream().map(CardConverter::createCardResponse).collect(Collectors.toList()));
        }
        return createBucketResponse;
    }

    public static Bucket toDomain(CreateBucketRequest createBucketRequest) {
        Bucket bucket = new Bucket();
        bucket.setId(UUID.randomUUID().toString());
        bucket.setName(createBucketRequest.getName());
        bucket.setPosition(createBucketRequest.getPosition());
        if (Objects.nonNull(createBucketRequest.getCards())) {
            bucket.setCards(createBucketRequest.getCards().stream().map(CardConverter::toDomain).collect(Collectors.toList()));
        }
        return bucket;
    }

    public static GetBucketResponse toGetResponse(BucketEntity bucketEntity) {
        GetBucketResponse getBucketResponse = new GetBucketResponse();
        getBucketResponse.setId(bucketEntity.getId());
        getBucketResponse.setName(bucketEntity.getName());
        getBucketResponse.setPosition(bucketEntity.getPosition());
        getBucketResponse.setCards(bucketEntity.getCards().stream().map(CardConverter::getCardResponse).collect(Collectors.toList()));
        return getBucketResponse;
    }
}
