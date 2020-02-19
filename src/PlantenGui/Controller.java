package PlantenGui;

import Dao.Database;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.sql.Connection;
import java.sql.SQLException;

public class Controller {
    public Button btnVooruit;
    public Button btnAchteruit;
    public TextField txtInvoerPlant;
    public TextArea txtUitvoerPlant;


    private Connection dbConnection;
    public  void initialize() throws SQLException {
        System.out.println("init");
       // Connection con = Database.getInstance().getConnection();
        dbConnection = Database.getInstance().getConnection();
        System.out.println("connectie controller");
    }
    public void clicked_Vooruit(MouseEvent mouseEvent) {


    }

    public void clicked_Achteruit(MouseEvent mouseEvent) {
    }
}
