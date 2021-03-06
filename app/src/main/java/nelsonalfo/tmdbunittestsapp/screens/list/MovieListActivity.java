package nelsonalfo.tmdbunittestsapp.screens.list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import nelsonalfo.tmdbunittestsapp.R;


public class MovieListActivity extends AppCompatActivity implements MovieListContract.View {
    @BindView(R.id.movie_list)
    RecyclerView recyclerView;

    private MovieListContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        ButterKnife.bind(this);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
    }

    @Override
    public void setPresenter(MovieListContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
