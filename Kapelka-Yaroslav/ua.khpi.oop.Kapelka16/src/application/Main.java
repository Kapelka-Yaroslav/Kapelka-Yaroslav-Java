package application;
	
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;

import javafx.application.Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
 
    private TableView<Route> table = new TableView<Route>();
    private final ObservableList<Route> data = FXCollections.observableArrayList();
    final HBox hb = new HBox();
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Капелька Ярослав Лабораторная работа №16");
        stage.setWidth(1440);
        stage.setHeight(540);
 
        final Label label = new Label("Билетная касса");
        label.setFont(new Font("Jackport College NCV", 20));
 
        table.setEditable(true);
 
        TableColumn nameCol = new TableColumn("Название маршрута");
        nameCol.setMinWidth(150);
        nameCol.setCellValueFactory(
                new PropertyValueFactory<Route, String>("name_route"));
 
        TableColumn stationCol = new TableColumn("Название станции");
        stationCol.setMinWidth(150);
        stationCol.setCellValueFactory(
                new PropertyValueFactory<Route, String>("station_name"));
 
        TableColumn departureCol = new TableColumn("Время отправления с станции");
        departureCol.setMinWidth(200);
        departureCol.setCellValueFactory(
                new PropertyValueFactory<Route, String>("departure_time"));
 
        TableColumn arrivalCol = new TableColumn("Время прибытия на станцию");
        arrivalCol.setMinWidth(200);
        arrivalCol.setCellValueFactory(
                new PropertyValueFactory<Route, String>("arrival_time"));
        
        TableColumn numberfreeCol = new TableColumn("Количество пустых мест");
        numberfreeCol.setMinWidth(200);
        numberfreeCol.setCellValueFactory(
                new PropertyValueFactory<Route, String>("number_of_free_seats"));
        
        TableColumn statusCol = new TableColumn("Статус станции");
        statusCol.setMinWidth(100);
        statusCol.setCellValueFactory(
                new PropertyValueFactory<Route, String>("status_station"));
        
        TableColumn totalCol = new TableColumn("Общее количество мест");
        totalCol.setMinWidth(200);
        totalCol.setCellValueFactory(
                new PropertyValueFactory<Route, String>("total_number_of_seats"));
        
        TableColumn daysCol = new TableColumn("День недели");
        daysCol.setMinWidth(100);
        daysCol.setCellValueFactory(
                new PropertyValueFactory<Route, String>("days"));
        
        TableColumn flightCol = new TableColumn("Номер рейса");
        flightCol.setMinWidth(100);
        flightCol.setCellValueFactory(
                new PropertyValueFactory<Route, String>("flight_number"));
        
        
        table.setItems(data);
        table.getColumns().addAll(nameCol, stationCol, departureCol, arrivalCol, numberfreeCol, statusCol, totalCol, daysCol, flightCol);
 
        final TextField addName = new TextField();
        addName.setPromptText("Название маршрута");
        addName.setMaxWidth(nameCol.getPrefWidth());
       
        final TextField addStation = new TextField();
        addStation.setPromptText("Название станции");
        addStation.setMaxWidth(stationCol.getPrefWidth());
        
        final TextField addDeparture = new TextField();
        addDeparture.setPromptText("Время отправления со станции");
        addDeparture.setMaxWidth(departureCol.getPrefWidth());
        
        final TextField addArrival = new TextField();
        addArrival.setPromptText("Время прибытия на станцию");
        addArrival.setMaxWidth(arrivalCol.getPrefWidth());
        
        final TextField addNumber = new TextField();
        addNumber.setPromptText("Количество пустых мест");
        addNumber.setMaxWidth(numberfreeCol.getPrefWidth());
        
        final TextField addStatus = new TextField();
        addStatus.setPromptText("Статус станции");
        addStatus.setMaxWidth(statusCol.getPrefWidth());
        
        final TextField addTotal = new TextField();
        addTotal.setPromptText("Общее количество мест");
        addTotal.setMaxWidth(totalCol.getPrefWidth());
        
        final TextField addDays = new TextField();
        addDays.setPromptText("День недели");
        addDays.setMaxWidth(daysCol.getPrefWidth());
        
        final TextField addFlight = new TextField();
        addFlight.setPromptText("Номер рейса");
        addFlight.setMaxWidth(flightCol.getPrefWidth());
        
        final Button addButton = new Button("Добавить");
        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                try {
					data.add(new Route(
							addName.getText(),
							addStation.getText(),
							addDeparture.getText(),
							addArrival.getText(),
							addNumber.getText(),
							addStatus.getText(),
							addTotal.getText(),
							addDays.getText(),
							addFlight.getText()));
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
                addName.clear();
                addStation.clear();
                addDeparture.clear();
                addArrival.clear();
                addNumber.clear();
                addStatus.clear();
                addTotal.clear();
                addDays.clear();
                addFlight.clear();
            }
        });
        
        final TextField serializable = new TextField();
        serializable.setPromptText("Сереализация");
        serializable.setMaxWidth(addFlight.getPrefWidth());
        
        final Button serbtn = new Button("Сохранить");
        serbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            	FileOutputStream outputStream;
				try {
					outputStream = new FileOutputStream(serializable.getText());
					serializable.clear();
        		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        		for (var value : data)
        			objectOutputStream.writeObject(value);
        		objectOutputStream.close();
            } catch (FileNotFoundException e1) {
            	// TODO Auto-generated catch block
            	e1.printStackTrace();
            } catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            }
        });
        final TextField deserialize = new TextField();
        deserialize.setPromptText("Десериализация");
        deserialize.setMaxWidth(addFlight.getPrefWidth());
        
        final Button desbtn = new Button("Скачать");
        desbtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
            	

            	
            	FileInputStream inStream = null;
				try {
					inStream = new FileInputStream(deserialize.getText());
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				deserialize.clear();
        		ObjectInputStream objectInStream = null;
				try {
					objectInStream = new ObjectInputStream(inStream);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		while (true) {
        			try {
        				
						data.add((Route)objectInStream.readObject());
						
					} 
        			catch (EOFException e1) {
						try {
							objectInStream.close();
							return;
						} catch (IOException e2) {
							// TODO Auto-generated catch block
							e2.printStackTrace();
						}
					}	catch (ClassNotFoundException | IOException e1) {
					
					} 
        			
        		}
				
            }
        });
        
        hb.getChildren().addAll(addName, addStation, addDeparture, addArrival, addNumber, addStatus, addTotal, addDays, addFlight, addButton, serializable, serbtn, deserialize, desbtn);
        hb.setSpacing(3);
        
        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table, hb);
 
        ((Group) scene.getRoot()).getChildren().addAll(vbox);
 
        stage.setScene(scene);
        stage.show();
    }
}