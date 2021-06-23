package br.com.lucasromagnoli.hexagonal.adapter.out.repository.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
@Entity
@Getter
@Setter
public class BucketEntity {
    @Id
    private String id;

    private String name;

    private byte position;

    @OneToMany(mappedBy = "bucket", cascade = CascadeType.ALL)
    private List<CardEntity> cards;
}
