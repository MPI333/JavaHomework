package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.Activities;

public class DatabaseActivities {

    private IdentityMapActivities identityMapActivities;

    public DatabaseActivities() {
    }

    public DatabaseActivities(IdentityMapActivities identityMapActivities) {
        this.identityMapActivities = identityMapActivities;
    }

    public IdentityMapActivities getIdentityMapActivities() {
        return identityMapActivities;
    }

    public void setIdentityMapActivities(IdentityMapActivities identityMapActivities) {
        this.identityMapActivities = identityMapActivities;
    }

    public Activities finder(Long key) {
        Activities activity = identityMapActivities.getActivity(key);

        if (activity == null) {
            // Get activity from database
            identityMapActivities.addActivity(activity);
        }

        return activity;
    }

}
