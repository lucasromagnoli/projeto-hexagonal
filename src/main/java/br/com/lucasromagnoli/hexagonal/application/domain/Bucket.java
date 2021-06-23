package br.com.lucasromagnoli.hexagonal.application.domain;

import br.com.lucasromagnoli.hexagonal.adapter.out.repository.entity.BucketEntity;
import br.com.lucasromagnoli.hexagonal.application.domain.converter.BucketEntityConverter;
import br.com.lucasromagnoli.hexagonal.application.port.out.BucketRepositoryPort;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@Getter
@Setter
public class Bucket {
    private String id;
    private String name;
    private Byte position;
    private List<Card> cards;

    public Bucket save(BucketRepositoryPort bucketRepositoryPort) {
        var bucketEntity = bucketRepositoryPort.save(BucketEntityConverter.toEntity(this));
        return BucketEntityConverter.toDomain(bucketEntity);
    }
}
