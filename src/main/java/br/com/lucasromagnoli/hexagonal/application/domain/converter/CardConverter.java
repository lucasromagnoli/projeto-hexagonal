package br.com.lucasromagnoli.hexagonal.application.domain.converter;

import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.request.create.CreateCardRequest;
import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.create.CreateCardResponse;
import br.com.lucasromagnoli.hexagonal.adapter.in.web.v1.response.get.GetCardResponse;
import br.com.lucasromagnoli.hexagonal.adapter.out.repository.entity.CardEntity;
import br.com.lucasromagnoli.hexagonal.application.domain.Bucket;
import br.com.lucasromagnoli.hexagonal.application.domain.Card;

import java.util.UUID;

/**
 * @author github.com/lucasromagnoli
 * @since 06/2021
 */
public class CardConverter {
    public static CreateCardResponse createCardResponse (Card card) {
        CreateCardResponse createCardResponse = new CreateCardResponse();
        createCardResponse.setId(card.getId());
        createCardResponse.setName(card.getName());
        createCardResponse.setPosition(card.getPosition());

        return createCardResponse;
    }

    public static Card toDomain(CreateCardRequest createCardRequest) {
        Card card = new Card();
        card.setId(UUID.randomUUID().toString());
        card.setName(createCardRequest.getName());
        card.setPosition(createCardRequest.getPosition());
        return card;
    }

    public static GetCardResponse getCardResponse(CardEntity cardEntity) {
        GetCardResponse getCardResponse = new GetCardResponse();
        getCardResponse.setId(cardEntity.getId());
        getCardResponse.setName(cardEntity.getName());
        getCardResponse.setPosition(cardEntity.getPosition());
        return getCardResponse;
    }
}
