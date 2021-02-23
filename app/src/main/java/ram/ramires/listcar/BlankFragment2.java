package ram.ramires.listcar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ram.ramires.listcar.databinding.FragmentBlank2Binding;
import ram.ramires.listcar.databinding.FragmentBlankBinding;

public class BlankFragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentBlank2Binding binding=FragmentBlank2Binding.inflate(inflater);
        binding.setFragment(this);
        View view =binding.getRoot();
        MyViewModel viewModel=new ViewModelProvider(this).get( MyViewModel.class);
        viewModel.getList();

        RecyclerView recyclerView=binding.recycler;

        viewModel.liveData.observe(getViewLifecycleOwner(), new Observer<List<Entity>>() {
            @Override
            public void onChanged(List<Entity> entities) {
                RecyclerView.Adapter adapter=new Recycler_View_Adapter(entities);
                recyclerView.setAdapter(adapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getBaseContext()));
                recyclerView.setHasFixedSize(true);
                recyclerView.setAdapter(adapter);
                adapter.notifyDataSetChanged();


                //Decor------------------------------------
                RecyclerSectionItemDecoration sectionItemDecoration =
                        new RecyclerSectionItemDecoration(getResources().getDimensionPixelSize(R.dimen.recycler_section_header_height),
                                true, // true for sticky, false for not
                                new RecyclerSectionItemDecoration.SectionCallback() {
                                    @Override
                                    public boolean isSection(int position) {
                                        return position == 0
                                                || entities.get(position)
                                                //.getLastName()
                                                .getName()
                                                .charAt(0) != entities.get(position - 1)
                                                //.getLastName()
                                                .getName()
                                                .charAt(0);
                                    }

                                    @Override
                                    public CharSequence getSectionHeader(int position) {
                                        return entities.get(position)
                                                //.getLastName()
                                                .getName();
                                                //.subSequence(0, 3); //.subSequence(0, 1);   //•установление заголовка
                                    }
                                });
                recyclerView.addItemDecoration(sectionItemDecoration);


            }
        });



        return view;
    }
}