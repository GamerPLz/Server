package umc.aehopark.domain.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import umc.aehopark.domain.product.entity.IngredientImage;

public interface IngredientImageRepository extends JpaRepository<IngredientImage, Long> {
}
