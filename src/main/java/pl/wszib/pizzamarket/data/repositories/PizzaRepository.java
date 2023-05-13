package pl.wszib.pizzamarket.data.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wszib.pizzamarket.data.entities.PizzaEntity;

public interface PizzaRepository extends JpaRepository<PizzaEntity, Long> {
}
