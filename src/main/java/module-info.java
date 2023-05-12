module edu.ufp.inf.lp2_aed2_project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;
    requires java.management;


    opens edu.ufp.inf.lp2_aed2_project to javafx.fxml;
    exports edu.ufp.inf.lp2_aed2_project;

    exports edu.ufp.inf.lp2_aed2_project.FX;
    opens edu.ufp.inf.lp2_aed2_project.FX to javafx.fxml;
}