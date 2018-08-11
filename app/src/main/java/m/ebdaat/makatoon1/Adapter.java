package m.ebdaat.makatoon1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    private ArrayList<Image> list;

    Adapter(ArrayList<Image> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.bookcard , null);
        return new ViewHolder(card);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Image image = list.get(position);
        holder.imageView.setImageResource(image.getImageId());
        holder.titleTv.setText(image.getTitle());
        holder.descriptionTv.setText(image.getCost());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}