package br.com.perimobileapps.listlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Usuário on 25/06/2015.
 */
public class MyBaseAdapter extends BaseAdapter{
    private List<Imovel> imoveis;
    private Context ctx;

    public MyBaseAdapter(Context ctx, List<Imovel> imoveis) {
        this.imoveis = imoveis;
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return imoveis.size();

    }

    @Override
    public Object getItem(int position) {
        return imoveis.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null) {
            convertView = LayoutInflater.from(ctx).inflate(R.layout.item_imovel,null);
            holder = new ViewHolder();

            holder.logoImob = (ImageView) convertView.findViewById(R.id.logoImob);
            holder.tvTipo = (TextView) convertView.findViewById(R.id.tvTipo);
            holder.tvValor = (TextView) convertView.findViewById(R.id.tvValor);
            holder.tvEndereco = (TextView) convertView.findViewById(R.id.tvEndereco);
            holder.fotoImovel = (ImageView) convertView.findViewById(R.id.fotoImovel);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Imovel imovel = imoveis.get(position);

        //Erro( Não aparece a string)
       if (R.id.tvTipo == 1) { //Holder é um textview e TIPO_CASA é int, como pegar o tvTipo int?
            holder.tvTipo.setText(R.string.tpCasa);
        } else if (R.id.tvTipo == 2) {
            holder.tvTipo.setText(R.string.tpAp);
        } else if (R.id.tvTipo == 3) {
            holder.tvTipo.setText(R.string.tpTer);
        }

        holder.tvValor.setText(String.valueOf(imovel.getValor()));
        holder.tvEndereco.setText(imovel.getEndereco());

        return convertView;
    }

    static class ViewHolder {
        ImageView logoImob;
        TextView tvTipo;
        TextView tvValor;
        TextView tvEndereco;
        ImageView fotoImovel;
    }

}
