package com.companyname.demo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TableLayout;

import tv.danmaku.ijk.media.example.widget.media.AndroidMediaController;
import tv.danmaku.ijk.media.example.widget.media.IjkVideoView;

public class MainActivity extends AppCompatActivity
{
    private TableLayout mTableLayout;
    private IjkVideoView mIjkVideoView;
    private AndroidMediaController mMediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMediaController = new AndroidMediaController(this, false);
        ActionBar actionBar = getSupportActionBar();
        mMediaController.setSupportActionBar(actionBar);
        mIjkVideoView = (IjkVideoView)findViewById(R.id.videoview);
        mIjkVideoView.setMediaController(mMediaController);
        mTableLayout = (TableLayout)findViewById(R.id.hudview);
        mIjkVideoView.setHudView(mTableLayout);
        mIjkVideoView.setVideoPath("http://hnxxz.chinashadt.com:2036/zhuanma/tv3.stream/playlist.m3u8");
        mIjkVideoView.start();
    }
}
