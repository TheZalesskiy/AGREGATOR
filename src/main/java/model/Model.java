package model;


import view.View;
import vo.Vacancy;

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
        List<Vacancy> vacancies = new ArrayList<Vacancy>();
        for (Provider provider : providersParam){
            vacancies.addAll(provider.getJavaVacancies(city));

        }
        viewParam.update(vacancies);

    }

}
