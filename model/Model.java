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
//        if (viewParam == null || providersParam == null || providersParam.length == 0){
//            throw new IllegalArgumentException("illegal arguments");
//       }
        this.viewParam = viewParam;
        this.providersParam = providersParam;
    }

    //    public Model(View view, Provider[] providers) {
//        if (view == null || providers == null || providers.length == 0){
//            throw new IllegalArgumentException("illegal arguments");
//        }
//        this.view = view;
//        this.providers = providers;
//    }

    public void selectCity(String city){
        List<Vacancy> vacancies = new ArrayList<>();
        for (Provider provider : providersParam){
            vacancies.addAll(provider.getJavaVacancies(city));

        }
        viewParam.update(vacancies);

    }

}
