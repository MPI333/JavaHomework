package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.Contacts;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapContacts {

    private Map contactMap = new HashMap();

    public IdentityMapContacts() {
    }

    public void addContact(Contacts contact) {
        contactMap.put(contact.getId(), contact);
    }

    public Contacts getContact(Long key) {
        return (Contacts)contactMap.get(key);
    }

}
