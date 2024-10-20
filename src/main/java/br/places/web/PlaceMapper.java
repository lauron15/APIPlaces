package br.places.web;

import br.places.api.PlaceResponse;
import br.places.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place){
        return new PlaceResponse(place.name(), place.slug(),place.createdAt(),place.updatedAt());
    }
}
