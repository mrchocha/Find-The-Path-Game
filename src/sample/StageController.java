package sample;
import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class StageController {

    @FXML
    private GridPane Gp;
    Map<String , String> m=new HashMap<>();
    public int wallArr[];
    @FXML
    private JFXButton Back;


    List<Button> l=new ArrayList<>();
    void MakeStages() throws SQLException, ClassNotFoundException {
        MySQLConectionClass sql=new MySQLConectionClass();
        Connection connection=sql.getConection();
        String Quary="SELECT `No`,`Start`, `Wall`, `End` FROM `totalstages` WHERE 1";

        Statement statement=connection.createStatement();
        ResultSet rs = statement.executeQuery(Quary);
        int i=30;
        while (rs.next()){
            String StageNo=rs.getString(1);
            String Start=rs.getString(2);
            String Walls=rs.getString(3);
            Walls=Walls.replace(" -1","");
            String End=rs.getString(4);
            JFXButton b = new JFXButton(StageNo);
            b.setId(StageNo);
            b.setPrefSize(100,100);
            b.setButtonType(JFXButton.ButtonType.FLAT);
            b.setRipplerFill(Color.web("#2196f3"));
            b.setCursor(Cursor.HAND);
            b.setTextFill(Color.web("#e8e1e1"));
            b.setStyle("-fx-border-color: white; -fx-font-color: white; -fx-background-radius: 20;-fx-border-spacing: 15px 50px; -fx-border-radius: 20;-fx-font-size:20;");
            String info=Start+";"+Walls+";"+End+";";
            m.put((StageNo),info);
            b.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    JFXButton bb= (JFXButton) event.getSource();
                    System.out.println(m.get(bb.getId()));
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/sample/fxmls/PlayScreen.fxml"));
                    try {
                        String  AllInfo = m.get(bb.getId());

;                       String SWE[] = AllInfo.split(";");
                        int s = Integer.parseInt(SWE[0]);
                        String[] Walls = SWE[1].split(" ");
                        wallArr = new int[Walls.length];                      //w[] = wallArr[]  global
                        for (int i = 0; i <Walls.length ; i++) {
                                wallArr[i] = Integer.parseInt(Walls[i]);
                        }
                        int e = Integer.parseInt(SWE[2]);
                        int[][] adj = new int[1275][1275];
                        adj = createConnectivityMatrix();

                        DijkstraWithDS pathFinder = new DijkstraWithDS();
                        pathFinder.findShortestPath(adj, s, e);
                        int shortestDistance = pathFinder.distanceTaken;
                        int[] pathSolution = pathFinder.pathArr;

                        Parent root =(Parent) fxmlLoader.load();
                        PlayScreenController play = fxmlLoader.getController();
                        play.InitilizerBtn();
                        play.make_pair();
                        play.Startpoint = s;
                        play.Endpoint = e;
                        play.WallArray = wallArr;
                        play.SetInitialpoint(s, wallArr, e, shortestDistance, pathSolution);
                        Stage stage = new Stage();
                        stage.setScene(new Scene(root,1300,700));
                        stage.initStyle(StageStyle.UNDECORATED);
                        stage.show();
                        ((Node)(event.getSource())).getScene().getWindow().hide();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            Gp.add(b,   i%10,i/10);
            i++;
        }
    }
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

    int findWall(int wallArrNum){
        int ans = -1;
        for (int i = 0; i < wallArr.length; i++) {
            if(wallArr[i] == wallArrNum){
                ans = i;
            }
        }
        return ans;
    }

    int[][] createConnectivityMatrix() {

        int adj[][] = new int[1275][1275];

        for (int i = 0; i < 1275; i++) {
            int temp = i+1;
            if(findWall(temp) == -1) {

                if(temp-25>=1 && temp-25<=1275){
                    int found = findWall(i-25+1);
                    if(found == -1) {
                        adj[i][i-25] = 1;
                    }
                }

                if(temp+25>=1 && temp+25<=1275){
                    int found = findWall(i+25+1);
                    if(found == -1){
                        adj[i][i+25] = 1;
                    }
                }

                if(temp-1>=1 && temp-1<=1275){
                    if(!((temp-1) % 25 == 0)) {
                        int found = findWall(i-1+1);
                        if(found == -1){
                            adj[i][i-1] = 1;
                        }
                    }
                }

                if(temp+1>=1 && temp+1<=1275){
                    if(!(temp % 25 == 0)) {
                        int found = findWall(i+1+1);
                        if(found == -1){
                            adj[i][i+1] = 1;
                        }
                    }
                }
            }

        }

        for (int i = 0; i < 1275; i++) {
            for (int j = 0; j < 1275; j++) {
                if(i==j){
                    adj[i][j] = 0;
                }
            }
        }

        return adj;
    }
}
