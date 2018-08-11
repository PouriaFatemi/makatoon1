package m.ebdaat.makatoon1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView titleTv;
    TextView descriptionTv;

    public ViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        titleTv = itemView.findViewById(R.id.image_title);
        descriptionTv = itemView.findViewById(R.id.image_cost);
    }
}