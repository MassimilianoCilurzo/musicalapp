package android.example.musicalstructureapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NowPlayingActivity  extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing_song);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            int currentPlaying = extras.getInt(SongListActivity.LIST_POSITION);
            Track nowPlayingSong = SongListActivity.mSongList.get(currentPlaying);

            TextView textView = findViewById(R.id.song_title_text_view);
            textView.setText(nowPlayingSong.getSongTitle());

            ImageView imageView = findViewById(R.id.song_image_view);
            imageView.setImageResource(nowPlayingSong.getmImageId());

            textView = findViewById(R.id.artist_name_text_view);
            textView.setText(nowPlayingSong.getmArtistName());


        }
    }
}
