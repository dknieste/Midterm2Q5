package application;

import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.ResourceBundle;
import java.util.Date;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class dateController implements Initializable{

    @FXML
    private ComboBox<String> month;

    @FXML
    private ComboBox<String> year;

    @FXML
    private ComboBox<String> day;
    
    ObservableList<String> monthList = FXCollections.observableArrayList("1 Jan", "2 Feb", "3 Mar", "4 Apr", "5 May", "6 Jun", "7 Jul", "8 Aug", "9 Sept", "10 Oct", "11 Nov", "12 Dec");
    ObservableList<String> thirty = FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30");
    ObservableList<String> thirtyOne = FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31");
    ObservableList<String> twentyEight = FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28");
    ObservableList<String> twentyNine = FXCollections.observableArrayList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29");
    ObservableList<String> yearList = FXCollections.observableArrayList("2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020");
	
    @FXML
    private Label label;

    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	
    	DateFormat df = new SimpleDateFormat("dd");
    	DateFormat mf = new SimpleDateFormat("MM");
    	DateFormat yf = new SimpleDateFormat("yy");
    	DateFormat ef = new SimpleDateFormat("dd/MM/yyyy");
    	Date today = Calendar.getInstance().getTime();      
    	String reportDay = df.format(today);
    	String reportMonth = mf.format(today);
    	String reportYear = yf.format(today);
    	String reportDate = ef.format(today);

    	month.setItems(monthList);
    	month.getSelectionModel().select(reportMonth);

    	year.setItems(yearList);
    	year.getSelectionModel().select(reportYear);

    	day.setItems(thirtyOne);
    	day.getSelectionModel().select(reportDay);
    	
		label.setText("The current date is:  " + reportDate);

    }
    
    @FXML
    void setDays(ActionEvent event) {
    	
    	if (month.getValue() == "4 Apr" || month.getValue() == "6 Jun" || month.getValue() == "9 Sept" || month.getValue() == "11 Nov"){
    		day.setItems(thirty);
    	}
    	
    	else if (month.getValue() == "2 Feb"){
    		if (year.getValue() == "2012" || year.getValue() == "2016" || year.getValue() == "2020"){
    			day.setItems(twentyNine);
    		}
    		else {
    			day.setItems(twentyEight);
    		}
    	}
    	
    	else {
    		day.setItems(thirtyOne);
    	}

	}
    
   
    
}
