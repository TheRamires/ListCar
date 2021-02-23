package ram.ramires.listcar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ram.ramires.listcar.databinding.FragmentBlankBinding;

public class BlankFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentBlankBinding binding=FragmentBlankBinding.inflate(inflater);
        binding.setFragment(this);
        View view=binding.getRoot();


        return view;
    }
    public void click(View view){
        Navigation.findNavController(view).navigate(R.id.blankFragment2);
    }
}