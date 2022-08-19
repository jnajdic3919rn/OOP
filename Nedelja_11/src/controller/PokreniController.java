package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Database;
import model.Ucionica;
import model.UcionicaPoTerminu;
import view.DrugiView;
import view.PrviView;

public class PokreniController implements EventHandler<ActionEvent>{

	private PrviView pv;
	
	public PokreniController(PrviView pv) {
		super();
		this.pv = pv;
	}

	@Override
	public void handle(ActionEvent event) {
		/// provera
		if(pokretanje() == false)
			return;
		
		Stage st = new Stage();
		DrugiView root = new DrugiView();
		root.getStudentiLbl().setText(root.getStudentiLbl().getText() + Database.getInstance().getStudenti().size());
		
		/// namestamo termine
		for(int i = 1; i<=Integer.valueOf(pv.getTerminTf().getText()); i++) {
			root.getTerminCb().getItems().add("termin"+i);
		}
		root.getTerminCb().setValue(root.getTerminCb().getItems().get(0));
		
		/// namestamo studente
		root.getStudentiOl().addAll(Database.getInstance().getStudenti());
		
		/// namestamo ucionice
		boolean racunari = pv.getRacunariCb().isSelected();
		for(String termin : root.getTerminCb().getItems()) {
			for(Ucionica u : Database.getInstance().getUcionice()) {
				if(!racunari || (racunari && u.getTip().equals("R"))) {
					if(u.getTip().equals("A")) {
						UcionicaPoTerminu upt = new UcionicaPoTerminu(u, Integer.valueOf(pv.getStudentiTf().getText())*2, termin);
						Database.getInstance().dodajUcionicuPoTerminu(upt);
					}
					else {
						UcionicaPoTerminu upt = new UcionicaPoTerminu(u, Integer.valueOf(pv.getStudentiTf().getText()), termin);
						Database.getInstance().dodajUcionicuPoTerminu(upt);
					}
						
				}
			}
		}
		for(UcionicaPoTerminu upt : Database.getInstance().getUcionicePoTerminu()) {
			if(upt.getTermin().equals(root.getTerminCb().getValue()))
				root.getUcioniceOl().add(upt);
		}
		
		
		Scene sc = new Scene(root, 700, 600);
		st.setScene(sc);
		st.show();
	}

	private boolean pokretanje() {
		try {
			int brojTermina = Integer.valueOf(pv.getTerminTf().getText());
			int brojStudenata = Integer.valueOf(pv.getStudentiTf().getText());
		}catch(NumberFormatException e) {
			pv.getPorukaLbl().setText("Pogresan format broja");
			return false;
		}
		int ukupnoStudenata = 0;
		boolean racunari = pv.getRacunariCb().isSelected();
		for(Ucionica u : Database.getInstance().getUcionice()) {
			if(!racunari || (racunari && u.getTip().equals("R"))) {
				if(u.getTip().equals("A"))
					ukupnoStudenata += Integer.valueOf(pv.getStudentiTf().getText())*2;
				else 
					ukupnoStudenata += Integer.valueOf(pv.getStudentiTf().getText());
			}
		}
		ukupnoStudenata *= Integer.valueOf(pv.getTerminTf().getText());
		
		if(ukupnoStudenata < Database.getInstance().getStudenti().size()) {
			pv.getPorukaLbl().setText("Raspored nije moguc");
			return false;
		}
		return true;
	}
	
	

}
