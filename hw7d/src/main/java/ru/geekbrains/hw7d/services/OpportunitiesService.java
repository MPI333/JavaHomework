package ru.geekbrains.hw7d.services;

import ru.geekbrains.hw7d.controllers.reprs.OpportunitiesRepr;

import java.util.List;
import java.util.Optional;

public interface OpportunitiesService {

    List<OpportunitiesRepr> findAll();

    Optional<OpportunitiesRepr> findById(Long id);

    void save(OpportunitiesRepr opportunitiesRepr);

    void delete(Long id);

}
