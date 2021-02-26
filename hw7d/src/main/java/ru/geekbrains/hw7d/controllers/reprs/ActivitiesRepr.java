package ru.geekbrains.hw7d.controllers.reprs;

import ru.geekbrains.hw7d.models.Account;
import ru.geekbrains.hw7d.models.Activities;

import java.util.Objects;

public class ActivitiesRepr {

    private Long id;

    private String name;

    private String type;

    private Account account;

    public ActivitiesRepr() {
    }

    public ActivitiesRepr(Activities activities) {
        this.id = activities.getId();
        this.name = activities.getName();
        this.type = activities.getType();
        this.account = activities.getAccount();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActivitiesRepr that = (ActivitiesRepr) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
