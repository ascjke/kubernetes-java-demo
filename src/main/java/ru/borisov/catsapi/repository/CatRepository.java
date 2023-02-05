package ru.borisov.catsapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.borisov.catsapi.entity.Cat;

public interface CatRepository extends JpaRepository<Cat, String> {
}
