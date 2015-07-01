package br.com.perimobileapps.listlayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Usuário on 27/06/2015.
 */
public class ImovelDetalheFragment extends Fragment {
    private static final String EXTRA_IMOVEL = "imovel";
    public static final String TAG_DETALHE = "tagDetalhe";

    Imovel mImovel;

    public static ImovelDetalheFragment novaInstancia(Imovel imovel) {
        Bundle params = new Bundle();
        params.putSerializable(EXTRA_IMOVEL, imovel);
        ImovelDetalheFragment fragment = new ImovelDetalheFragment();
        fragment.setArguments(params);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mImovel = (Imovel) getArguments().getSerializable(EXTRA_IMOVEL);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_detalhe_imovel, container, false);
        TextView tvTipo = (TextView) layout.findViewById(R.id.tvTipo);
        TextView tvValor = (TextView) layout.findViewById(R.id.tvValor);
        TextView tvtvEndereco = (TextView) layout.findViewById(R.id.tvEndereco);
        TextView tvQuartos = (TextView) layout.findViewById(R.id.tvQuartos);
        TextView tvSuite = (TextView) layout.findViewById(R.id.tvSuite);
        TextView tvBWC = (TextView) layout.findViewById(R.id.tvBWC);
        TextView tvtvAmbiente = (TextView) layout.findViewById(R.id.tvAmbiente);
        TextView tvServico = (TextView) layout.findViewById(R.id.tvServico);
        TextView tvAUtil = (TextView) layout.findViewById(R.id.tvAUtil);
        TextView tvATotal = (TextView) layout.findViewById(R.id.tvATotal);
        TextView tvVagas = (TextView) layout.findViewById(R.id.tvVagas);
        TextView tvInfo = (TextView) layout.findViewById(R.id.tvInfo);

        ImageView fotoImovel =(ImageView) layout.findViewById(R.id.fotoImovel);
        ImageView logoImob = (ImageView) layout.findViewById(R.id.logoImob);

        if(mImovel != null) {
            tvTipo.setText(String.valueOf(mImovel.getTipo()));
            tvValor.setText(String.valueOf(mImovel.getValor()));
            tvtvEndereco.setText(mImovel.getEndereco());

            String quartos = getResources().getQuantityString(R.plurals.quarto, mImovel.getQuartos(), mImovel.getQuartos() );
            tvQuartos.setText(quartos);

            String suite = getResources().getQuantityString(R.plurals.suite, mImovel.getSuite(), mImovel.getSuite() );
            tvSuite.setText(suite);

            String bwc = getResources().getQuantityString(R.plurals.bwc, mImovel.getBwc(), mImovel.getBwc() );
            tvBWC.setText(bwc);

            //tvtvAmbiente.setText(mImovel.getAmbiente());
            //tvServico.setText(mImovel.getServico());
            if (mImovel.getTipo() == Imovel.TIPO_CASA) {
               // String tpcasa = getResources(R.string.tpcasa);
                String atc = getResources().getString(R.string.aMaior, mImovel.getAreaMaior());
                tvATotal.setText(atc);
                String auc = getResources().getString(R.string.aMenorCasa, mImovel.getAreaMenor());
                tvAUtil.setText(auc);
            } else if (mImovel.getTipo() == Imovel.TIPO_AP) {
                String ata = getResources().getString(R.string.aMaior, mImovel.getAreaMaior());
                tvATotal.setText(ata);
                String aua = getResources().getString(R.string.aMenorAp, mImovel.getAreaMenor());
                tvAUtil.setText(aua);
            } else if (mImovel.getTipo() == Imovel.TIPO_TER) {
                String att = getResources().getString(R.string.aMaior, mImovel.getAreaMaior());
                tvATotal.setText(att);
            }
            String vaga = getResources().getQuantityString(R.plurals.tvVaga, mImovel.getVagaG(), mImovel.getVagaG() );
            tvVagas.setText(vaga);

            tvInfo.setText(mImovel.getInfo());
            // Implementar como resgatar as images fotoImovel e logoImob

        }
        return layout;
    }
}
