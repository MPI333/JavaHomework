package ru.geekbrains.hw7d.patterns.identitymap;

import ru.geekbrains.hw7d.models.Activities;

import java.util.HashMap;
import java.util.Map;

public class IdentityMapActivities {

    private Map activityMap = new HashMap();

    public IdentityMapActivities() {
    }

    public void addActivity(Activities activity) {
        activityMap.put(activity.getId(), activity);
    }

    public Activities getActivity(Long key) {
        return (Activities)activityMap.get(key);
    }

}
