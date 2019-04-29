package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.mastert.bookmyseat.R;

import java.util.List;

import model.NotificationsModel;



public class NotificationsAdapter extends RecyclerView.Adapter<NotificationsAdapter.MyViewHolder> {
    Context context;

    private List<NotificationsModel> modelfood9List;

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_notifications, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
               NotificationsModel modelfoodrecycler = modelfood9List.get(position);

        holder.foodtext1.setText(modelfoodrecycler.getFoodtext1());
        holder.foodtext2.setText(modelfoodrecycler.getFoodtext2());
        holder.foodtext3.setText(modelfoodrecycler.getFoodtext3());

        holder.foodimg1.setImageResource(modelfoodrecycler.getFoodimg1());


    }

    @Override
    public int getItemCount() {

        return modelfood9List.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView foodtext1, foodtext2, foodtext3;

        ImageView foodimg1;

        public MyViewHolder(View itemView) {
            super(itemView);
            foodtext1 = itemView.findViewById(R.id.foodtext1);
            foodtext2 = itemView.findViewById(R.id.foodtext2);
            foodtext3 = itemView.findViewById(R.id.foodtext3);
            foodimg1 = itemView.findViewById(R.id.foodimg1);

        }
    }

    public NotificationsAdapter(Context mainActivityContacts, List<NotificationsModel> offerList) {
        this.modelfood9List = offerList;
        this.context = mainActivityContacts;
    }
}
