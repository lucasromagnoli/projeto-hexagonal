package br.com.lucasromagnoli.hexagonal.application.domain.converter;

import br.com.lucasromagnoli.hexagonal.adapter.out.repository.entity.CardEntity;
import br.com.lucasromagnoli.hexagonal.application.domain.Card;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
public class CardEntityConverter {
    public static CardEntity toEntity(Card card) {
        CardEntity cardEntity = new CardEntity();
        cardEntity.setId(card.getId());
        cardEntity.setName(card.getName());
        cardEntity.setPosition(card.getPosition());
        return cardEntity;
    }

    public static Card toDomain(CardEntity cardEntity) {
        Card card = new Card();
        card.setId(cardEntity.getId());
        card.setName(cardEntity.getName());
        card.setPosition(cardEntity.getPosition());
        return card;
    }
}
