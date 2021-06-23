package br.com.lucasromagnoli.hexagonal.adapter.out.repository.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@Entity
@Getter
@Setter
public class CardEntity {
    @Id
    private String id;

    private byte position;

    private String name;

    @ManyToOne
    private BucketEntity bucket;
}
