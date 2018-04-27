package com.udacity.gradle.builditbigger.paid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;

import com.udacity.gradle.builditbigger.JokeTask;
import com.udacity.gradle.builditbigger.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {

    ProgressBar mProgress;
    Button mLaunchJokeActivity;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);

        mProgress = root.findViewById(R.id.progress);
        hideProgress();

        mLaunchJokeActivity = root.findViewById(R.id.joke_button);
        mLaunchJokeActivity.setOnClickListener(this);

        return root;
    }

    @Override
    public void onResume() {
        super.onResume();
        hideProgress();
    }

    @Override
    public void onClick(View view) {
        showProgress();
        new JokeTask(getActivity()).execute();
    }

    private void showProgress() {
        mProgress.setVisibility(View.VISIBLE);
    }

    private void hideProgress() {
        mProgress.setVisibility(View.INVISIBLE);
    }
}
