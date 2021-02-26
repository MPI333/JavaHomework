package ru.geekbrains.hw7d.models;

import javax.persistence.*;

@Entity
@Table(name = "activities")
public class Activities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 32, nullable = false)
    private String name;

    @Column(name = "type", length = 32, nullable = false)
    private String type;

    @ManyToOne(optional = false)
    private Account account;

    public Activities() {
    }

    public Activities(String name, String type, Account account) {
        this.name = name;
        this.type = type;
        this.account = account;
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

}
