package ru.geekbrains.hw7d.services;

import ru.geekbrains.hw7d.controllers.reprs.ContactsRepr;

import java.util.List;
import java.util.Optional;

public interface ContactsService {

    List<ContactsRepr> findAll();

    Optional<ContactsRepr> findById(Long id);

    void save(ContactsRepr contactsRepr);

    void delete(Long id);

}
