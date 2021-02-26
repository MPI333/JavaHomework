package ru.geekbrains.hw7d.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.geekbrains.hw7d.controllers.reprs.ContactsRepr;
import ru.geekbrains.hw7d.models.Contacts;
import ru.geekbrains.hw7d.repositories.ContactsRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Transactional
public class ContactsServiceImpl implements ContactsService {

    private final ContactsRepository contactsRepository;

    @Autowired
    public ContactsServiceImpl(ContactsRepository contactsRepository) {
        this.contactsRepository = contactsRepository;
    }

    @Override
    public List<ContactsRepr> findAll() {
        return contactsRepository.findAll().stream().map(ContactsRepr::new).collect(Collectors.toList());
    }

    @Override
    public Optional<ContactsRepr> findById(Long id) {
        return contactsRepository.findById(id).map(ContactsRepr::new);
    }

    @Override
    public void save(ContactsRepr contactsRepr) {
        Contacts contact = new Contacts();
        contact.setId(contactsRepr.getId());
        contact.setFirstName(contactsRepr.getFirstName());
        contact.setLastName(contactsRepr.getLastName());
        contact.setPhone(contactsRepr.getPhone());
        contact.setEmail(contactsRepr.getEmail());
        contact.setWebsite(contactsRepr.getWebsite());
        contact.setAddress(contactsRepr.getAddress());
        contact.setDescription(contactsRepr.getDescription());
        contact.setAccount(contactsRepr.getAccount());
        contact.setOpportunitiesList(contactsRepr.getOpportunitiesList());
        contact.setLead(contactsRepr.getLead());
        contactsRepository.save(contact);
    }

    @Override
    public void delete(Long id) {
        contactsRepository.deleteContactById(id);
    }

}
