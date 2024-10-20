package br.places.api;

import java.time.LocalDateTime;

public record PlaceResponse (String name, String slug, LocalDateTime createdAt, LocalDateTime updatedAt) {

}
