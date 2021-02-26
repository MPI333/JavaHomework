package ru.geekbrains.hw7d.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.hw7d.controllers.reprs.OpportunitiesRepr;
import ru.geekbrains.hw7d.models.Opportunities;
import ru.geekbrains.hw7d.repositories.OpportunitiesRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class OpportunitiesServiceImpl implements OpportunitiesService {

    private final OpportunitiesRepository opportunitiesRepository;

    @Autowired
    public OpportunitiesServiceImpl(OpportunitiesRepository opportunitiesRepository) {
        this.opportunitiesRepository = opportunitiesRepository;
    }

    @Override
    public List<OpportunitiesRepr> findAll() {
        return opportunitiesRepository.findAll().stream().map(OpportunitiesRepr::new).collect(Collectors.toList());
    }

    @Override
    public Optional<OpportunitiesRepr> findById(Long id) {
        return opportunitiesRepository.findById(id).map(OpportunitiesRepr::new);
    }

    @Override
    public void save(OpportunitiesRepr opportunitiesRepr) {
        Opportunities opportunity = new Opportunities();
        opportunity.setId(opportunitiesRepr.getId());
        opportunity.setName(opportunitiesRepr.getName());
        opportunity.setSource(opportunitiesRepr.getSource());
        opportunity.setStatus(opportunitiesRepr.getStatus());
        opportunity.setContact(opportunitiesRepr.getContact());
        opportunity.setOpportunityContactsList(opportunitiesRepr.getOpportunityContactsList());
        opportunity.setOpportunityProductList(opportunitiesRepr.getOpportunityProductList());
        opportunitiesRepository.save(opportunity);
    }

    @Override
    public void delete(Long id) {
        opportunitiesRepository.deleteOpportunityById(id);
    }

}
