package com.estudo.patterns.service;

import com.estudo.patterns.domain.model.Patterns;
import com.estudo.patterns.dto.PatternDataTransferObject;
import com.estudo.patterns.exception.PatternNotFoundException;

import java.util.Collection;
import java.util.List;

public interface PatternService {

    Collection<Patterns> getAll() throws PatternNotFoundException;

    PatternDataTransferObject findNamePattern(String namePattern) throws PatternNotFoundException;

    PatternDataTransferObject findNumberPatter(Integer numberPattern) throws PatternNotFoundException;

    Patterns savePattern(Patterns patterns) throws PatternNotFoundException;

}
