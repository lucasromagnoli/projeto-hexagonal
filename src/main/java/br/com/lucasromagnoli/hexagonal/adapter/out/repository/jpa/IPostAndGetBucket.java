package br.com.lucasromagnoli.hexagonal.adapter.out.repository.jpa;

import br.com.lucasromagnoli.hexagonal.adapter.out.repository.entity.BucketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
public interface IPostAndGetBucket extends JpaRepository<BucketEntity, String> {

}
