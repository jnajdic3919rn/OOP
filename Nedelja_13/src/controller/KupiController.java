package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Database;
import model.Podatak;
import model.Udzbenik;
import view.PrviView;

public class KupiController implements EventHandler<ActionEvent> {

	private PrviView pv;
	
	public KupiController(PrviView pv) {
		super();
		this.pv = pv;
	}

	@Override
	public void handle(ActionEvent event) {
		ObservableList<Udzbenik> selektovaniUdzbenici = pv.getLista().getSelectionModel().getSelectedItems();
		int broj = Integer.valueOf(pv.getTf().getText());
		
		boolean postoji;
		for(Udzbenik u : selektovaniUdzbenici) {
			postoji = false;
			if(broj <= u.getBrojPrimeraka()) {
				for(Podatak p : pv.getPodaciOl()) {
					if(u.getIzdavac().equals(p.getIzdavac()) && u.getNaslov().equals(p.getNaslov())) {
						p.setBrojPrimeraka(p.getBrojPrimeraka() + broj);
						p.setCena(p.getCena() + u.getCena()*broj);
						postoji = true;
						break;
					}
				}
				if(!postoji) {
					pv.getPodaciOl().add(new Podatak(u.getNaslov(), u.getIzdavac(), broj, u.getCena()*broj));
				}
			}
		}
		
		for(Udzbenik u : Database.getInstance().getUdzbenici()) {
			for(Udzbenik selektovani : selektovaniUdzbenici) {
				if(u.getIzdavac().equals(selektovani.getIzdavac()) && u.getNaslov().equals(selektovani.getNaslov())){
					u.setBrojPrimeraka(u.getBrojPrimeraka() - broj);
				}
			}
		}
		
		pv.getLista().refresh();
		pv.getTabela2().refresh();
	}

}
