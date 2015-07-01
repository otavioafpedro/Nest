package br.com.perimobileapps.listlayout;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuário on 27/06/2015.
 */
public class ImovelListFragment extends ListFragment {

    List<Imovel> imoveis;
    MyBaseAdapter ad;
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        imoveis = carregaImoveis();
        ad = new MyBaseAdapter(getActivity(), imoveis);

        setListAdapter(ad);
    }

    private List<Imovel> carregaImoveis() {
        List<Imovel> imoveis = new ArrayList<Imovel>();
        imoveis.add(new Imovel(1, 500000000, "Rua sáo Caralho"));
        imoveis.add(new Imovel(2, 9999999, "Avenida Tiabete"));
        imoveis.add(new Imovel(3, 200000, "Rua fim dos cafundoh"));
        return imoveis;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Activity activity = getActivity();

        if(activity instanceof AoClicarNoImovel) {
            Imovel imovel = (Imovel) l.getItemAtPosition(position);
            AoClicarNoImovel listener = (AoClicarNoImovel) activity;
            listener.clicouNoImovel(imovel);
        }
    }

    public interface AoClicarNoImovel {
        void clicouNoImovel(Imovel imovel);
    }
}
