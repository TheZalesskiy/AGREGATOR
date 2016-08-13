package model;



import vo.Vacancy;

import java.util.List;

/**
 * Strategy interface
 */
public interface Strategy {
    List<Vacancy> getVacancies(String searchString);
}
