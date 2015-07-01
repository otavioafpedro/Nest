package br.com.perimobileapps.listlayout;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;


public class MainActivity extends ActionBarActivity implements ImovelListFragment.AoClicarNoImovel{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void clicouNoImovel(Imovel imovel) {
        if(isTablet()) {
            ImovelDetalheFragment fragment = ImovelDetalheFragment.novaInstancia(imovel);

            FragmentManager fm = getSupportFragmentManager();

            FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id.imovelDetalhe, fragment, ImovelDetalheFragment.TAG_DETALHE);
            ft.commit();
        } else {
            Intent it = new Intent(this, ImovelDetalheActivity.class);
            it.putExtra(ImovelDetalheActivity.EXTRA_IMOVEL, imovel);

            startActivity(it);
        }
    }

    private boolean isTablet() {
        return findViewById(R.id.imovelDetalhe) != null;
    }
}
