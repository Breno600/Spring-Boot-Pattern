package com.estudo.patterns.controller;

import com.estudo.patterns.domain.model.Patterns;
import com.estudo.patterns.dto.PatternDataTransferObject;
import com.estudo.patterns.service.PatternService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin
@RequestMapping("pattern/v1")
public class PatternsController {

    private final PatternService patternService;

    public PatternsController(PatternService patternService) {
        this.patternService = patternService;
    }

    @GetMapping("/")
    private Collection<Patterns> findAll(){
        return this.patternService.getAll();
    }

    @GetMapping("name/{namePattern}")
    private ResponseEntity<PatternDataTransferObject> findNamePattern(
            @PathVariable("namePattern") String namePattern){
        return ResponseEntity.ok(this.patternService.findNamePattern(namePattern));
    }

    @GetMapping("number/{numberPatter}")
    private ResponseEntity<PatternDataTransferObject> findNumberPatter(
            @PathVariable("numberPatter") Integer numberPattern){
        return ResponseEntity.ok(this.patternService.findNumberPatter(numberPattern));
    }

    @PostMapping("/save")
    private ResponseEntity<Patterns> save(@RequestBody @Validated Patterns patterns){
        return ResponseEntity.ok(this.patternService.savePattern(patterns));
    }
}
