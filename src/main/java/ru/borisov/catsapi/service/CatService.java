package ru.borisov.catsapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.borisov.catsapi.dto.CatDto;
import ru.borisov.catsapi.entity.Cat;
import ru.borisov.catsapi.repository.CatRepository;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {

    private final CatRepository catRepository;

    public Cat save(CatDto catDto) {
        Cat cat = Cat.builder()
                .id(UUID.randomUUID().toString())
                .name(catDto.getName())
                .birthDay(catDto.getBirthDay())
                .createdAt(LocalDateTime.now())
                .build();

        return catRepository.save(cat);
    }

    public Iterable<Cat> getAll() {

        return catRepository.findAll();
    }
}
