package com.javarush.test.level28.lesson15.big01;

import com.javarush.test.level28.lesson15.big01.model.*;
import com.javarush.test.level28.lesson15.big01.view.HtmlView;
import com.javarush.test.level28.lesson15.big01.view.View;
import com.javarush.test.level28.lesson15.big01.vo.Vacancy;

import java.util.List;

/**
 * Aggregator class
 */
public class Aggregator {
    public static void main(String[] args) {
        HtmlView view = new HtmlView();
        Provider providerHH = new Provider(new HHStrategy());
        Provider providerMoikrug = new Provider(new MoikrugStrategy());
        Provider providerUa = new Provider(new RabotaStrategy());
        Model model = new Model(view, new Provider[]{providerHH, providerMoikrug, providerUa});
        view.setController(new Controller(model));
        view.userCitySelectEmulationMethod();
    }
}
