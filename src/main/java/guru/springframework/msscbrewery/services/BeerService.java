package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDtoV2);

    void updateBeer(UUID beerId, BeerDto beerDtoV2);

    void deleteById(UUID beerId);
}
