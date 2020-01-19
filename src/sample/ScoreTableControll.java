package sample;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ScoreTableControll implements Initializable {

    @FXML
    private TableView<Data> tableView;

    @FXML
    private TableColumn<Data, String> Name;
    public ObservableList<Data> Datalist= FXCollections.observableArrayList();

    @FXML
    private TableColumn<Data, String> Score;
    @FXML
    void GoBack(MouseEvent event) throws IOException {
        Stage BackStage=new Stage(StageStyle.TRANSPARENT);
        Parent root1 = FXMLLoader.load(getClass().getResource("MainScreeen.fxml"));
        BackStage.setScene(new Scene(root1));
        BackStage.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();

    }
    public void Minimize(javafx.scene.input.MouseEvent mouseEvent) {
        Stage s= (Stage) ((Node)mouseEvent.getSource()).getScene().getWindow();
        s.setIconified(true);
    }
    public void close(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void MakeTable() throws SQLException, ClassNotFoundException {
        MySQLConectionClass sql=new MySQLConectionClass();
        Connection connection=sql.getConection();
        String quary1 = "SELECT * FROM leadboard ORDER BY Score DESC;";
        Statement statement=connection.createStatement();
        ResultSet rs=statement.executeQuery(quary1);
        while (rs.next()){
            String name=rs.getString("Name");
            String score=rs.getString("Score");
            Datalist.add(new Data(name,score));
        }
        Name.setCellValueFactory(new PropertyValueFactory<Data, String>("Name"));
        Score.setCellValueFactory(new PropertyValueFactory<Data, String>("Score"));
        tableView.setItems(Datalist);

    }
    @Override
    public void initialize(URL location, ResourceBundle resources)  {
        try {
            MakeTable();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    public class Data {
        public SimpleStringProperty name;
        public SimpleStringProperty score;

        public Data(String Name, String Score) {
            name = new SimpleStringProperty(Name);
            score = new SimpleStringProperty(Score);
        }

        public String getName() {
            return name.get();
        }

        public SimpleStringProperty nameProperty() {
            return name;
        }

        public void setName(String name) {
            this.name.set(name);
        }

        public String getScore() {
            return score.get();
        }

        public SimpleStringProperty scoreProperty() {
            return score;
        }

        public void setScore(String score) {
            this.score.set(score);
        }
    }

}