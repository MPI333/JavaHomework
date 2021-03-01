package ru.geekbrains.hw7d.patterns.identitymap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.geekbrains.hw7d.models.Activities;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DatabaseActivities {

    private IdentityMapActivities identityMapActivities;

    public Activities finder(Long key) {
        Activities activity = identityMapActivities.getActivity(key);

        if (activity == null) {
            // Get activity from database
            identityMapActivities.addActivity(activity);
        }

        return activity;
    }

}
