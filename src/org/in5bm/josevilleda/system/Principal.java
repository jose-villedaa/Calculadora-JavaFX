package org.in5bm.josevilleda.system;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.in5bm.josevilleda.bean.*;



/**
 * @author Jose Mauricio Villeda Morales
 * @date 21/03/2022 
 * Codigo Tecnico : IN5BM 
 * Carne : 2021075 
 * Grupo : 2 (Lunes)
 */
public class Principal extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage)throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/FXMLCalculadoraView.fxml"));
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Calculadora - Jose Villeda ");
        stage.show();
    }
}
