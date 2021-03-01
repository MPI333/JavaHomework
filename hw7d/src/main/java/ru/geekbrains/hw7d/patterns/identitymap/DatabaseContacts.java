package ru.geekbrains.hw7d.patterns.identitymap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.Contacts;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatabaseContacts {

    private IdentityMapContacts identityMapContacts;

    public Contacts finder(Long key) {
        Contacts contact = identityMapContacts.getContact(key);

        if (contact == null) {
            // Get contact from database
            identityMapContacts.addContact(contact);
        }

        return contact;
    }

}
