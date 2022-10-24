import Specialists.NonTechnical.CustomerSuccessManager;
import Specialists.NonTechnical.MarketingManager;
import Specialists.NonTechnical.ProductManager;
import Specialists.Technical.Developer;
import Specialists.Technical.ProjectManager;
import Specialists.Technical.QA;

public class Hierarchy {
    public static void main(String[] args) {
        Developer dev = new Developer("Nik", 27, "Development team ",
                "front-end development", "senior",
                2500);
        QA qa = new QA("Vlad", 24, "QA", "Manual testing", "junior", 500);
        ProjectManager pjm = new ProjectManager("Gabe", 35, "Development team", "scrum",
                "middle", 1500);
        CustomerSuccessManager cs = new CustomerSuccessManager("Lauren",36,
                "Customer success team","customers support",900);
        MarketingManager mm= new MarketingManager("Adam",31,"Marketing team","sales",
                1600);
        ProductManager pdm = new ProductManager("Michael",49,"Business team",
                "product planning and product marketing",1500);
        dev.specialistInfo();
        dev.getPaid();
        qa.specialistInfo();
        qa.getPaid();
        pdm.specialistInfo();
        pdm.getPaid();
    }
}
