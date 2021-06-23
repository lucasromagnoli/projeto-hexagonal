package br.com.lucasromagnoli.hexagonal.application.port.out;

import br.com.lucasromagnoli.hexagonal.adapter.out.repository.entity.BucketEntity;

import java.util.List;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
public interface BucketRepositoryPort {
    BucketEntity save(BucketEntity bucketEntity);
    BucketEntity findById(String id);
    List<BucketEntity> findAll();
}
