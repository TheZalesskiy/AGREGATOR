package com.javarush.test.level28.lesson15.big01.model;

import com.javarush.test.level28.lesson15.big01.view.View;
import com.javarush.test.level28.lesson15.big01.vo.Vacancy;

import java.util.ArrayList;
import java.util.List;

/**
 * Model class
 */
public class Model {
    private View viewParam;
    private Provider[] providersParam;

    public Model(View viewParam, Provider[] providersParam) {
        this.viewParam = viewParam;
        this.providersParam = providersParam;
    }


    public void selectCity(String city){
        List<Vacancy> vacancies = new ArrayList<>();
        for (Provider provider : providersParam){
            vacancies.addAll(provider.getJavaVacancies(city));

        }
        viewParam.update(vacancies);

    }

}
