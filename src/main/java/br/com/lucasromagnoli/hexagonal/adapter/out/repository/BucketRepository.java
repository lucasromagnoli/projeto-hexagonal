package br.com.lucasromagnoli.hexagonal.adapter.out.repository;

import br.com.lucasromagnoli.hexagonal.adapter.out.repository.entity.BucketEntity;
import br.com.lucasromagnoli.hexagonal.adapter.out.repository.jpa.IPostAndGetBucket;
import br.com.lucasromagnoli.hexagonal.application.port.out.BucketRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@Repository
@AllArgsConstructor
public class BucketRepository implements BucketRepositoryPort {
    private final IPostAndGetBucket iPostAndGetBucket;

    @Override
    @Transactional(readOnly = false)
    public BucketEntity save(BucketEntity bucketEntity) {
        return iPostAndGetBucket.save(bucketEntity);
    }

    @Override
    public BucketEntity findById(String id) {
        return iPostAndGetBucket.findById(id).orElseThrow(() -> new RuntimeException("Bucket not found"));
    }

    @Override
    public List<BucketEntity> findAll() {
        return iPostAndGetBucket.findAll();
    }
}
