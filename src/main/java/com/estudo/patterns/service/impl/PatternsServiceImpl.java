package com.estudo.patterns.service.impl;

import com.estudo.patterns.domain.model.Patterns;
import com.estudo.patterns.domain.repository.PatternRepository;
import com.estudo.patterns.dto.PatternDataTransferObject;
import com.estudo.patterns.exception.PatternNotFoundException;
import com.estudo.patterns.service.PatternService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PatternsServiceImpl implements PatternService {

    private final PatternRepository repository;

    public PatternsServiceImpl(PatternRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<Patterns> getAll() throws PatternNotFoundException {
        return Stream.of(this.repository.findAll()
                .stream()
                .findAny()
                .orElseThrow(() -> new PatternNotFoundException("Is Empty")))
                .collect(Collectors.toList());
    }

    @Override
    public PatternDataTransferObject findNamePattern(String namePattern) throws PatternNotFoundException{
        return this.repository.findNamePattern(namePattern)
                .orElseThrow(() ->
                        new PatternNotFoundException(String.format("Not Found Pattern By Name (%s)", namePattern)));
    }

    @Override
    public PatternDataTransferObject findNumberPatter(Integer numberPattern) throws PatternNotFoundException {
        return this.repository.findNumberPatter(numberPattern)
                .orElseThrow(() ->
                        new PatternNotFoundException(String.format("Not Found Pattern By Number (%s)",numberPattern)));
    }

    @Override
    public Patterns savePattern(Patterns patterns) throws PatternNotFoundException{
        return this.repository.save(patterns);
    }
}
