package ru.netology.i18n;

import ru.netology.entity.Country;

public class LocalizationServiceImpl implements LocalizationService {

    public String locale(Country country) {
        switch (country) {
            case RUSSIA:
                return "Этот Ip из RuZone";
            default:
                return "Этот Ip из UsZone";
        }
    }
}
