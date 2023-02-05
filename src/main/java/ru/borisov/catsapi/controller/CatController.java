package ru.borisov.catsapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.borisov.catsapi.dto.CatDto;
import ru.borisov.catsapi.entity.Cat;
import ru.borisov.catsapi.service.CatService;

@RestController
@RequestMapping("/cats")
@RequiredArgsConstructor
public class CatController {

    private final CatService catService;

    @PostMapping
    public Cat save(@RequestBody CatDto catDto) {
        return catService.save(catDto);
    }

    @GetMapping
    public Iterable<Cat> getAll() {
        return catService.getAll();
    }
}
