package dev.aisandbox.launcher;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

import java.util.ResourceBundle;

@Slf4j
public class SandboxServerFXApplication extends Application {
    private Parent rootNode;

    @Override
    public void init() throws Exception {
        log.info("Initialising application - FX");

    }

    @Override
    public void start(Stage stage) throws Exception {
        log.info("Starting application - FX");

        Parent root = FXMLLoader.load(getClass().getResource("/fx/simulation.fxml"));
        Scene scene = new Scene(root,800,600);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("AI Sandbox");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        log.info("Stopping application");
  /*      ApplicationModel model = context.getBean(ApplicationModel.class);
        try {
            model.resetRuntime();
        } catch (Exception e) {
            log.debug("Error when closing runtime", e);
        }*/
  //      context.close();
     //   System.exit(0);
    }
}
