package ram.ramires.listcar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ram.ramires.listcar.databinding.ItemViewBinding;

public class Recycler_View_Adapter extends RecyclerView.Adapter<Recycler_View_Adapter.DailyViewHolder> {

    List<Entity> list;
    public Recycler_View_Adapter(List<Entity> list){
        this.list=list;
        //Log.d(LOG, "Adapter constructer "+this.daily.size());
    }

    @NonNull
    @Override
    public DailyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        ItemViewBinding binding=ItemViewBinding.inflate(inflater,parent,false);
        //Log.d(LOG,"Create View Holder");
        return new DailyViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull DailyViewHolder holder, int position) {
        holder.binding.setEntity(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class DailyViewHolder extends RecyclerView.ViewHolder{
        ItemViewBinding binding;

        public DailyViewHolder(@NonNull View itemView) {
            super(itemView);
            //Log.d(LOG, "Create DailyViewHolder");
            binding= DataBindingUtil.bind(itemView);
        }
    }
}