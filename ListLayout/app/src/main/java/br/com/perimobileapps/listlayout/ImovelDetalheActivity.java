package br.com.perimobileapps.listlayout;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;


public class ImovelDetalheActivity extends ActionBarActivity{

    public static final String EXTRA_IMOVEL = "imovel";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imovel_detalhe);

        Intent it = getIntent();
        Imovel imovel = (Imovel) it.getSerializableExtra(EXTRA_IMOVEL);
        ImovelDetalheFragment fragment = ImovelDetalheFragment.novaInstancia(imovel);
        FragmentManager fm = getSupportFragmentManager();

        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.imovelDetalhe, fragment, ImovelDetalheFragment.TAG_DETALHE);
        ft.commit();
    }

}
