package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import app.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.Placanje;
import model.Tip;
import view.DrugiView;

public class PlatiController implements EventHandler<ActionEvent> {

	private DrugiView dv;
	
	public PlatiController(DrugiView dv) {
		this.dv = dv;
	}

	@Override
	public void handle(ActionEvent event) {
		try {
			int iznos = Integer.valueOf(dv.getIznosTf().getText());
			String primalac = dv.getPrimalacTf().getText();
			String kategorija = dv.getKategorijaCb().getValue();
			
			Date datum = new Date();
			SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy.");
			Placanje p = new Placanje(iznos, primalac, format.format(datum), kategorija, Tip.ISPLATA);
			dv.getPv().getPlacanjaOl().add(p);
			Placanje.setStanje(Placanje.getStanje() - p.getIznos());
			dv.getPv().getStanjeLbl().setText("Trenutno stanje: " + Placanje.getStanje() + " RSD");
			
		}catch(NumberFormatException e) {
			new Alert(AlertType.ERROR, "Wrong input format").show();
		}
		Main.st2.close();
	}

}
