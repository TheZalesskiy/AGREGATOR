import controller.Controller;
import model.*;
import view.HtmlView;

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
