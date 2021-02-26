package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.Contacts;

public class DatabaseContacts {

    private IdentityMapContacts identityMapContacts;

    public DatabaseContacts() {
    }

    public DatabaseContacts(IdentityMapContacts identityMapContacts) {
        this.identityMapContacts = identityMapContacts;
    }

    public IdentityMapContacts getIdentityMapContacts() {
        return identityMapContacts;
    }

    public void setIdentityMapContacts(IdentityMapContacts identityMapContacts) {
        this.identityMapContacts = identityMapContacts;
    }

    public Contacts finder(Long key) {
        Contacts contact = identityMapContacts.getContact(key);

        if (contact == null) {
            // Get contact from database
            identityMapContacts.addContact(contact);
        }

        return contact;
    }

}
