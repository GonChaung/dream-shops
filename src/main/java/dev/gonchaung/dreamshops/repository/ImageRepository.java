package dev.gonchaung.dreamshops.repository;

import dev.gonchaung.dreamshops.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
