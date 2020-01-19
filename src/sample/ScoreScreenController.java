package sample;

import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScoreScreenController extends Controller {

    @FXML
    private Label min;
    @FXML
    private Label Worning;

    @FXML
    private Label X;

    @FXML
    private Label ScoreLab;

    @FXML
    private JFXTextField Name;

    @FXML
    private JFXTextField Age;
    int Score=0;

    public void Minimize(MouseEvent mouseEvent) {
        Stage s= (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        s.setIconified(true);

    }
    public void close(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void SetScore(){
        System.out.println(Score);
        ScoreLab.setText("Your Score: "+Score);
    }
    public void SubmitClk(MouseEvent mouseEvent) throws IOException, SQLException, ClassNotFoundException {
        int flag=1;
        String name=Name.getText();
        String age=Age.getText();
        if(name.length()==0 || age.length()==0){
            Worning.setText("Invelid Input");
            flag=0;
        }
        else{
            try {
                Double num = Double.valueOf(age);
            } catch (NumberFormatException e) {
                flag=0;
                Worning.setText("Invelid Input");
            }
        }
        if(flag==1){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Message Here...");
            alert.setHeaderText("Score Registered");
            alert.setContentText("Press OK from Home!");
            alert.showAndWait().ifPresent(rs -> {
                if (rs == ButtonType.OK) {
                    System.out.println("Pressed OK.");
                }
            });
            MySQLConectionClass sql=new MySQLConectionClass();
            Connection connection=sql.getConection();
            Statement statement = connection.createStatement();

            String query = "SELECT Name, Score FROM `leadboard` WHERE Name = '"+name+"'";
            ResultSet rs = statement.executeQuery(query); String check=null; int score=0;

            while (rs.next()){
                check = rs.getString("Name");
                score = Integer.parseInt(rs.getString("Score"));
            }

            if(check == null){
                System.out.println("Got New Name.");
                String Quary="INSERT INTO `leadboard` (`Name`, `Age`, `Score`) VALUES ('"+name+"', '"+age+"', '"+Score+"');";
                statement.executeUpdate(Quary);
                statement.close();
            } else {
                System.out.println("This Name already exists.");
                String quer = "UPDATE `leadboard` SET Score = "+(Score+score)+", Age = "+age+" WHERE Name = '"+name+"'";
                statement.executeUpdate(quer);
                statement.close();
            }


            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainScreeen.fxml"));
            Parent root = (Parent)fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root,1300,700));
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();
            ((Node)(mouseEvent.getSource())).getScene().getWindow().hide();
        }

    }


}
