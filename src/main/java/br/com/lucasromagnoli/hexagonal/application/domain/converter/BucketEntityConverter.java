package br.com.lucasromagnoli.hexagonal.application.domain.converter;

import br.com.lucasromagnoli.hexagonal.adapter.out.repository.entity.BucketEntity;
import br.com.lucasromagnoli.hexagonal.application.domain.Bucket;

import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
public class BucketEntityConverter {
    public static BucketEntity toEntity(Bucket bucket) {
        BucketEntity bucketEntity = new BucketEntity();
        bucketEntity.setId(bucket.getId());
        bucketEntity.setName(bucket.getName());
        bucketEntity.setPosition(bucket.getPosition());

        if (Objects.nonNull(bucket.getCards())) {
            bucketEntity.setCards(bucket.getCards().stream().map(CardEntityConverter::toEntity).collect(Collectors.toList()));
            bucketEntity.getCards().forEach(card -> card.setBucket(bucketEntity));
        }

        return bucketEntity;
    }

    public static Bucket toDomain(BucketEntity bucketEntity) {
        Bucket bucket = new Bucket();
        bucket.setId(bucketEntity.getId());
        bucket.setName(bucketEntity.getName());
        bucket.setPosition(bucketEntity.getPosition());
        if (Objects.nonNull(bucketEntity.getCards())) {
            bucket.setCards(bucketEntity.getCards().stream().map(CardEntityConverter::toDomain).collect(Collectors.toList()));
        }

        return bucket;
    }
}
