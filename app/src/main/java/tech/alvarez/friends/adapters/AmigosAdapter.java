package tech.alvarez.friends.adapters;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.List;

import tech.alvarez.friends.R;
import tech.alvarez.friends.model.Amigo;

public class AmigosAdapter extends RecyclerView.Adapter<AmigosAdapter.ViewHolder> {

    private List<Amigo> dataset;
    private Context context;

    public AmigosAdapter(Context context) {
        this.context = context;
        this.dataset = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_amigo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Amigo a = dataset.get(position);
        holder.nombreTextView.setText(a.getNombre());
        holder.telefonoTextView.setText(a.getTelefono());

        // Así descargamos con Fresco, creando un objeto Uri primero
        Uri uri = Uri.parse(a.getFotoURL());
        holder.fotoSimpleDraweeView.setImageURI(uri);
    }

    @Override
    public int getItemCount() {
        return dataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private SimpleDraweeView fotoSimpleDraweeView;
        private TextView nombreTextView;
        private TextView telefonoTextView;

        public ViewHolder(View itemView) {
            super(itemView);

            fotoSimpleDraweeView = (SimpleDraweeView) itemView.findViewById(R.id.fotoSimpleDraweeView);
            nombreTextView = (TextView) itemView.findViewById(R.id.nombreTextView);
            telefonoTextView = (TextView) itemView.findViewById(R.id.telefonoTextView);
        }
    }

    public void setDataset(List<Amigo> amigos) {
        if (amigos != null) {
            dataset.addAll(amigos);
        }
        notifyDataSetChanged();
    }

    public void add(Amigo amigo) {
        dataset.add(amigo);
        notifyDataSetChanged();
    }

}
